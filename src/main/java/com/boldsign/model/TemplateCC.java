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
 * TemplateCC
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class TemplateCC {
  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public TemplateCC() {
  }

  public TemplateCC emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * @return emailAddress
   */
  @javax.annotation.Nullable
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public TemplateCC userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateCC templateCC = (TemplateCC) o;
    return Objects.equals(this.emailAddress, templateCC.emailAddress) &&
        Objects.equals(this.userId, templateCC.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateCC {\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (emailAddress != null) {
        if (isFileTypeOrListOfFiles(emailAddress)) {
            fileTypeFound = true;
        }

        if (emailAddress.getClass().equals(java.io.File.class) ||
            emailAddress.getClass().equals(Integer.class) ||
            emailAddress.getClass().equals(String.class) ||
            emailAddress.getClass().isEnum()) {
            map.put("emailAddress", emailAddress);
        } else if (isListOfFile(emailAddress)) {
            for(int i = 0; i< getListSize(emailAddress); i++) {
                map.put("emailAddress", emailAddress);
            }
        }
        else {
          map.put("emailAddress", emailAddress);
        }
    }
    if (userId != null) {
        if (isFileTypeOrListOfFiles(userId)) {
            fileTypeFound = true;
        }

        if (userId.getClass().equals(java.io.File.class) ||
            userId.getClass().equals(Integer.class) ||
            userId.getClass().equals(String.class) ||
            userId.getClass().isEnum()) {
            map.put("userId", userId);
        } else if (isListOfFile(userId)) {
            for(int i = 0; i< getListSize(userId); i++) {
                map.put("userId", userId);
            }
        }
        else {
          map.put("userId", userId);
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }

    if(!fileTypeFound) {
        Field[] fields = TemplateCC.class.getDeclaredFields();
        for (Field field : fields) {
            if ("files".equals(field.getName())) {
                fileTypeFound = true;
                break;
            }
        }
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
    openapiFields.add("emailAddress");
    openapiFields.add("userId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TemplateCC
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TemplateCC.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateCC is not found in the empty JSON string", TemplateCC.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("emailAddress") != null && !jsonObj.get("emailAddress").isJsonNull()) && !jsonObj.get("emailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddress").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateCC.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateCC' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateCC> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateCC.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateCC>() {
           @Override
           public void write(JsonWriter out, TemplateCC value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateCC read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TemplateCC given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TemplateCC
   * @throws IOException if the JSON string is invalid with respect to TemplateCC
   */
  public static TemplateCC fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateCC.class);
  }

  /**
   * Convert an instance of TemplateCC to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

