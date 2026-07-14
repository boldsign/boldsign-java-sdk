package com.boldsign;

import com.boldsign.model.WebhookEvent;
import com.boldsign.model.WebhookEventMetadata;
import com.boldsign.model.WebhookEventMetadata.EventTypeEnum;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.*;

public class WebhookUtility {

    public static final String BOLD_SIGN_EVENT_HEADER = "X-BoldSign-Event";
    public static final String BOLD_SIGN_SIGNATURE_HEADER = "X-BoldSign-Signature";
    private static final int DEFAULT_TIME_TOLERANCE = 300;

    public static WebhookEvent parseEvent(
            String jsonPayload
            ) throws Exception {

        WebhookEvent webhookEvent = WebhookEvent.fromJson(jsonPayload);
        return webhookEvent;
    }

    public static void validateSignature(
            String payload,
            String signatureHeader,
            String secretKey) throws Exception {

        long now = System.currentTimeMillis() / 1000;
        Map<String, List<String>> header = parse(signatureHeader);

        String timestamp = header.get("t").get(0);
        String expected = hmac(secretKey, payload, timestamp);

        if (!match(expected, header.get("s0"))
                && !match(expected, header.get("s1"))) {
            throw new Exception("Signature mismatch");
        }

        if (Math.abs(now - Long.parseLong(timestamp)) > DEFAULT_TIME_TOLERANCE) {
            throw new Exception("Timestamp outside tolerance");
        }
    }

    private static Map<String, List<String>> parse(String header) {
        Map<String, List<String>> map = new HashMap<>();
        for (String p : header.split(",")) {
            String[] kv = p.trim().split("=", 2);
            map.computeIfAbsent(kv[0], k -> new ArrayList<>()).add(kv[1]);
        }
        return map;
    }

    private static String hmac(String secret, String payload, String timestamp) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
        byte[] raw = mac.doFinal((timestamp + "." + payload).getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : raw) sb.append(String.format("%02x", b));
        return sb.toString();
    }

    private static boolean match(String gen, List<String> list) {
        if (list == null) return false;
        for (String v : list) {
            if (MessageDigest.isEqual(gen.getBytes(), v.getBytes())) {
                return true;
            }
        }
        return false;
    }
}