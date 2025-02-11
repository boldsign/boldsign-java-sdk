/*
 * BoldSign API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * Contact: support@boldsign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.boldsign;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    static {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.AccessCodeDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.AccessCodeDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.AttachmentInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.AuditTrail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.BehalfDocument.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.BehalfDocumentRecords.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.BehalfOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.BillingViewModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.BrandCreated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.BrandCustomFieldDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.BrandingMessage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.BrandingRecords.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ChangeRecipient.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ConditionalRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ContactCreated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ContactDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ContactPageDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ContactsDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ContactsList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.CreateContactResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.CreateSenderIdentityRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.CreateTeamRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.CreateTemplateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.CreateUser.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.CustomDomainSettings.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.CustomFieldCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.CustomFieldMessage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.CustomFormField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.DeleteCustomFieldReply.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.Document.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.DocumentCC.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.DocumentCcDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.DocumentCreated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.DocumentExpirySettings.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.DocumentFiles.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.DocumentFormFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.DocumentInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.DocumentProperties.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.DocumentReassign.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.DocumentRecords.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.DocumentSenderDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.DocumentSigner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.DocumentSignerDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.DocumentTags.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.EditSenderIdentityRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.EditTemplateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.EditableDateFieldSettings.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.EmbeddedCreateTemplateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.EmbeddedCustomFieldCreated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.EmbeddedDocumentRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.EmbeddedSendCreated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.EmbeddedSendTemplateFormRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.EmbeddedSigningLink.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.EmbeddedTemplateCreated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.EmbeddedTemplateEditRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.EmbeddedTemplateEdited.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ErrorResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ExistingFormField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ExtendExpiry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.FileInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.Font.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.FormField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.FormGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.FormulaFieldSettings.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.IdVerification.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.IdentityVerificationSettings.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ImageInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.MergeAndSendForSignForm.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.NotificationSettings.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.PageDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.PhoneNumber.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.PrefillField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.PrefillFieldRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ProblemDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.RecipientNotificationSettings.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.Rectangle.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ReminderMessage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ReminderSettings.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.RemoveAuthentication.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.RevokeDocument.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.Role.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.Roles.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.SendForSign.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.SendForSignFromTemplateForm.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.SenderIdentityList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.SenderIdentityViewModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.Size.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TeamCreated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TeamDocumentRecords.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TeamListResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TeamPageDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TeamResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TeamUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TeamUsers.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.Teams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.Template.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TemplateCC.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TemplateCreated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TemplateFormFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TemplateProperties.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TemplateRecords.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TemplateRole.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TemplateSenderDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TemplateSenderDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TemplateSharedTemplateDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TemplateSignerDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TemplateTag.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TextTagDefinition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.TextTagOffset.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.UpdateUser.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.UserPageDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.UserProperties.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.UserRecords.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.UsersDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.Validation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ViewBrandDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.boldsign.model.ViewCustomFieldDetails.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
