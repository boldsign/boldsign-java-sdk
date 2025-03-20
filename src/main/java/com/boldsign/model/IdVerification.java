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


package com.boldsign.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.lang.reflect.Field;
import java.net.URI;

import com.boldsign.JSON;
import com.boldsign.ApiException;

/**
 * IdVerification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class IdVerification {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_MAXIMUM_RETRY_COUNT = "maximumRetryCount";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_RETRY_COUNT)
  private Integer maximumRetryCount;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_NAME_MATCHER = "nameMatcher";
  @SerializedName(SERIALIZED_NAME_NAME_MATCHER)
  private String nameMatcher;

  public static final String SERIALIZED_NAME_REQUIRE_LIVE_CAPTURE = "requireLiveCapture";
  @SerializedName(SERIALIZED_NAME_REQUIRE_LIVE_CAPTURE)
  private Boolean requireLiveCapture;

  public static final String SERIALIZED_NAME_REQUIRE_MATCHING_SELFIE = "requireMatchingSelfie";
  @SerializedName(SERIALIZED_NAME_REQUIRE_MATCHING_SELFIE)
  private Boolean requireMatchingSelfie;

  public static final String SERIALIZED_NAME_HOLD_FOR_PREFILL = "holdForPrefill";
  @SerializedName(SERIALIZED_NAME_HOLD_FOR_PREFILL)
  private Boolean holdForPrefill;

  public static final String SERIALIZED_NAME_PREFILL_COMPLETED = "prefillCompleted";
  @SerializedName(SERIALIZED_NAME_PREFILL_COMPLETED)
  private Boolean prefillCompleted;

  public IdVerification() {
  }

  public IdVerification type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public IdVerification maximumRetryCount(Integer maximumRetryCount) {
    this.maximumRetryCount = maximumRetryCount;
    return this;
  }

  /**
   * Get maximumRetryCount
   * @return maximumRetryCount
   */
  @javax.annotation.Nullable
  public Integer getMaximumRetryCount() {
    return maximumRetryCount;
  }

  public void setMaximumRetryCount(Integer maximumRetryCount) {
    this.maximumRetryCount = maximumRetryCount;
  }


  public IdVerification status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public IdVerification nameMatcher(String nameMatcher) {
    this.nameMatcher = nameMatcher;
    return this;
  }

  /**
   * Get nameMatcher
   * @return nameMatcher
   */
  @javax.annotation.Nullable
  public String getNameMatcher() {
    return nameMatcher;
  }

  public void setNameMatcher(String nameMatcher) {
    this.nameMatcher = nameMatcher;
  }


  public IdVerification requireLiveCapture(Boolean requireLiveCapture) {
    this.requireLiveCapture = requireLiveCapture;
    return this;
  }

  /**
   * Get requireLiveCapture
   * @return requireLiveCapture
   */
  @javax.annotation.Nullable
  public Boolean getRequireLiveCapture() {
    return requireLiveCapture;
  }

  public void setRequireLiveCapture(Boolean requireLiveCapture) {
    this.requireLiveCapture = requireLiveCapture;
  }


  public IdVerification requireMatchingSelfie(Boolean requireMatchingSelfie) {
    this.requireMatchingSelfie = requireMatchingSelfie;
    return this;
  }

  /**
   * Get requireMatchingSelfie
   * @return requireMatchingSelfie
   */
  @javax.annotation.Nullable
  public Boolean getRequireMatchingSelfie() {
    return requireMatchingSelfie;
  }

  public void setRequireMatchingSelfie(Boolean requireMatchingSelfie) {
    this.requireMatchingSelfie = requireMatchingSelfie;
  }


  public IdVerification holdForPrefill(Boolean holdForPrefill) {
    this.holdForPrefill = holdForPrefill;
    return this;
  }

  /**
   * Get holdForPrefill
   * @return holdForPrefill
   */
  @javax.annotation.Nullable
  public Boolean getHoldForPrefill() {
    return holdForPrefill;
  }

  public void setHoldForPrefill(Boolean holdForPrefill) {
    this.holdForPrefill = holdForPrefill;
  }


  public IdVerification prefillCompleted(Boolean prefillCompleted) {
    this.prefillCompleted = prefillCompleted;
    return this;
  }

  /**
   * Get prefillCompleted
   * @return prefillCompleted
   */
  @javax.annotation.Nullable
  public Boolean getPrefillCompleted() {
    return prefillCompleted;
  }

  public void setPrefillCompleted(Boolean prefillCompleted) {
    this.prefillCompleted = prefillCompleted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdVerification idVerification = (IdVerification) o;
    return Objects.equals(this.type, idVerification.type) &&
        Objects.equals(this.maximumRetryCount, idVerification.maximumRetryCount) &&
        Objects.equals(this.status, idVerification.status) &&
        Objects.equals(this.nameMatcher, idVerification.nameMatcher) &&
        Objects.equals(this.requireLiveCapture, idVerification.requireLiveCapture) &&
        Objects.equals(this.requireMatchingSelfie, idVerification.requireMatchingSelfie) &&
        Objects.equals(this.holdForPrefill, idVerification.holdForPrefill) &&
        Objects.equals(this.prefillCompleted, idVerification.prefillCompleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, maximumRetryCount, status, nameMatcher, requireLiveCapture, requireMatchingSelfie, holdForPrefill, prefillCompleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdVerification {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    maximumRetryCount: ").append(toIndentedString(maximumRetryCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    nameMatcher: ").append(toIndentedString(nameMatcher)).append("\n");
    sb.append("    requireLiveCapture: ").append(toIndentedString(requireLiveCapture)).append("\n");
    sb.append("    requireMatchingSelfie: ").append(toIndentedString(requireMatchingSelfie)).append("\n");
    sb.append("    holdForPrefill: ").append(toIndentedString(holdForPrefill)).append("\n");
    sb.append("    prefillCompleted: ").append(toIndentedString(prefillCompleted)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (type != null) {
        if (isFileTypeOrListOfFiles(type)) {
            fileTypeFound = true;
        }

        if (type.getClass().equals(java.io.File.class) ||
            type.getClass().equals(Integer.class) ||
            type.getClass().equals(String.class) ||
            type.getClass().isEnum()) {
            map.put("type", type);
        } else if (isListOfFile(type)) {
            for(int i = 0; i< getListSize(type); i++) {
                map.put("type", type);
            }
        }
        else {
          map.put("type", type);
        }
    }
    if (maximumRetryCount != null) {
        if (isFileTypeOrListOfFiles(maximumRetryCount)) {
            fileTypeFound = true;
        }

        if (maximumRetryCount.getClass().equals(java.io.File.class) ||
            maximumRetryCount.getClass().equals(Integer.class) ||
            maximumRetryCount.getClass().equals(String.class) ||
            maximumRetryCount.getClass().isEnum()) {
            map.put("maximumRetryCount", maximumRetryCount);
        } else if (isListOfFile(maximumRetryCount)) {
            for(int i = 0; i< getListSize(maximumRetryCount); i++) {
                map.put("maximumRetryCount", maximumRetryCount);
            }
        }
        else {
          map.put("maximumRetryCount", maximumRetryCount);
        }
    }
    if (status != null) {
        if (isFileTypeOrListOfFiles(status)) {
            fileTypeFound = true;
        }

        if (status.getClass().equals(java.io.File.class) ||
            status.getClass().equals(Integer.class) ||
            status.getClass().equals(String.class) ||
            status.getClass().isEnum()) {
            map.put("status", status);
        } else if (isListOfFile(status)) {
            for(int i = 0; i< getListSize(status); i++) {
                map.put("status", status);
            }
        }
        else {
          map.put("status", status);
        }
    }
    if (nameMatcher != null) {
        if (isFileTypeOrListOfFiles(nameMatcher)) {
            fileTypeFound = true;
        }

        if (nameMatcher.getClass().equals(java.io.File.class) ||
            nameMatcher.getClass().equals(Integer.class) ||
            nameMatcher.getClass().equals(String.class) ||
            nameMatcher.getClass().isEnum()) {
            map.put("nameMatcher", nameMatcher);
        } else if (isListOfFile(nameMatcher)) {
            for(int i = 0; i< getListSize(nameMatcher); i++) {
                map.put("nameMatcher", nameMatcher);
            }
        }
        else {
          map.put("nameMatcher", nameMatcher);
        }
    }
    if (requireLiveCapture != null) {
        if (isFileTypeOrListOfFiles(requireLiveCapture)) {
            fileTypeFound = true;
        }

        if (requireLiveCapture.getClass().equals(java.io.File.class) ||
            requireLiveCapture.getClass().equals(Integer.class) ||
            requireLiveCapture.getClass().equals(String.class) ||
            requireLiveCapture.getClass().isEnum()) {
            map.put("requireLiveCapture", requireLiveCapture);
        } else if (isListOfFile(requireLiveCapture)) {
            for(int i = 0; i< getListSize(requireLiveCapture); i++) {
                map.put("requireLiveCapture", requireLiveCapture);
            }
        }
        else {
          map.put("requireLiveCapture", requireLiveCapture);
        }
    }
    if (requireMatchingSelfie != null) {
        if (isFileTypeOrListOfFiles(requireMatchingSelfie)) {
            fileTypeFound = true;
        }

        if (requireMatchingSelfie.getClass().equals(java.io.File.class) ||
            requireMatchingSelfie.getClass().equals(Integer.class) ||
            requireMatchingSelfie.getClass().equals(String.class) ||
            requireMatchingSelfie.getClass().isEnum()) {
            map.put("requireMatchingSelfie", requireMatchingSelfie);
        } else if (isListOfFile(requireMatchingSelfie)) {
            for(int i = 0; i< getListSize(requireMatchingSelfie); i++) {
                map.put("requireMatchingSelfie", requireMatchingSelfie);
            }
        }
        else {
          map.put("requireMatchingSelfie", requireMatchingSelfie);
        }
    }
    if (holdForPrefill != null) {
        if (isFileTypeOrListOfFiles(holdForPrefill)) {
            fileTypeFound = true;
        }

        if (holdForPrefill.getClass().equals(java.io.File.class) ||
            holdForPrefill.getClass().equals(Integer.class) ||
            holdForPrefill.getClass().equals(String.class) ||
            holdForPrefill.getClass().isEnum()) {
            map.put("holdForPrefill", holdForPrefill);
        } else if (isListOfFile(holdForPrefill)) {
            for(int i = 0; i< getListSize(holdForPrefill); i++) {
                map.put("holdForPrefill", holdForPrefill);
            }
        }
        else {
          map.put("holdForPrefill", holdForPrefill);
        }
    }
    if (prefillCompleted != null) {
        if (isFileTypeOrListOfFiles(prefillCompleted)) {
            fileTypeFound = true;
        }

        if (prefillCompleted.getClass().equals(java.io.File.class) ||
            prefillCompleted.getClass().equals(Integer.class) ||
            prefillCompleted.getClass().equals(String.class) ||
            prefillCompleted.getClass().isEnum()) {
            map.put("prefillCompleted", prefillCompleted);
        } else if (isListOfFile(prefillCompleted)) {
            for(int i = 0; i< getListSize(prefillCompleted); i++) {
                map.put("prefillCompleted", prefillCompleted);
            }
        }
        else {
          map.put("prefillCompleted", prefillCompleted);
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }
    return fileTypeFound ? map : new HashMap<>();
  }

  private boolean isFileTypeOrListOfFiles(Object obj) throws Exception {
    return obj.getClass().equals(java.io.File.class) || isListOfFile(obj);
  }

  private boolean isListOfFile(Object obj) throws Exception {
      return obj instanceof java.util.List && !isListEmpty(obj) && getFromList(obj, 0) instanceof java.io.File;
  }

  private boolean isListEmpty(Object obj) throws Exception {
    return (boolean) Class.forName(java.util.List.class.getName()).getMethod("isEmpty").invoke(obj);
  }

  private Object getFromList(Object obj, int index) throws Exception {
    return Class.forName(java.util.List.class.getName()).getMethod("get", int.class).invoke(obj, index);
  }

  private int getListSize(Object obj) throws Exception {
    return (int) Class.forName(java.util.List.class.getName()).getMethod("size").invoke(obj);
  }


  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("type");
    openapiFields.add("maximumRetryCount");
    openapiFields.add("status");
    openapiFields.add("nameMatcher");
    openapiFields.add("requireLiveCapture");
    openapiFields.add("requireMatchingSelfie");
    openapiFields.add("holdForPrefill");
    openapiFields.add("prefillCompleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IdVerification
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IdVerification.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdVerification is not found in the empty JSON string", IdVerification.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("nameMatcher") != null && !jsonObj.get("nameMatcher").isJsonNull()) && !jsonObj.get("nameMatcher").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameMatcher` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nameMatcher").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdVerification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdVerification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdVerification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdVerification.class));

       return (TypeAdapter<T>) new TypeAdapter<IdVerification>() {
           @Override
           public void write(JsonWriter out, IdVerification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdVerification read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IdVerification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IdVerification
   * @throws IOException if the JSON string is invalid with respect to IdVerification
   */
  public static IdVerification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdVerification.class);
  }

  /**
   * Convert an instance of IdVerification to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

