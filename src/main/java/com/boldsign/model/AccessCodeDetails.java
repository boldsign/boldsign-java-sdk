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
import com.boldsign.model.PhoneNumber;
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
 * AccessCodeDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class AccessCodeDetails {
  public static final String SERIALIZED_NAME_ACCESS_CODE = "accessCode";
  @SerializedName(SERIALIZED_NAME_ACCESS_CODE)
  private String accessCode;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private PhoneNumber phoneNumber;

  public static final String SERIALIZED_NAME_ON_BEHALF_OF = "onBehalfOf";
  @SerializedName(SERIALIZED_NAME_ON_BEHALF_OF)
  private String onBehalfOf;

  public AccessCodeDetails() {
  }

  public AccessCodeDetails accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

  /**
   * Get accessCode
   * @return accessCode
   */
  @javax.annotation.Nonnull
  public String getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }


  public AccessCodeDetails phoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  public PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public AccessCodeDetails onBehalfOf(String onBehalfOf) {
    this.onBehalfOf = onBehalfOf;
    return this;
  }

  /**
   * Get onBehalfOf
   * @return onBehalfOf
   */
  @javax.annotation.Nullable
  public String getOnBehalfOf() {
    return onBehalfOf;
  }

  public void setOnBehalfOf(String onBehalfOf) {
    this.onBehalfOf = onBehalfOf;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessCodeDetails accessCodeDetails = (AccessCodeDetails) o;
    return Objects.equals(this.accessCode, accessCodeDetails.accessCode) &&
        Objects.equals(this.phoneNumber, accessCodeDetails.phoneNumber) &&
        Objects.equals(this.onBehalfOf, accessCodeDetails.onBehalfOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCode, phoneNumber, onBehalfOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessCodeDetails {\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    onBehalfOf: ").append(toIndentedString(onBehalfOf)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (accessCode != null) {
        if (isFileTypeOrListOfFiles(accessCode)) {
            fileTypeFound = true;
        }

        if (accessCode.getClass().equals(java.io.File.class) ||
            accessCode.getClass().equals(Integer.class) ||
            accessCode.getClass().equals(String.class) ||
            accessCode.getClass().isEnum()) {
            map.put("accessCode", accessCode);
        } else if (isListOfFile(accessCode)) {
            for(int i = 0; i< getListSize(accessCode); i++) {
                map.put("accessCode", accessCode);
            }
        }
        else {
          map.put("accessCode", accessCode);
        }
    }
    if (phoneNumber != null) {
        if (isFileTypeOrListOfFiles(phoneNumber)) {
            fileTypeFound = true;
        }

        if (phoneNumber.getClass().equals(java.io.File.class) ||
            phoneNumber.getClass().equals(Integer.class) ||
            phoneNumber.getClass().equals(String.class) ||
            phoneNumber.getClass().isEnum()) {
            map.put("phoneNumber", phoneNumber);
        } else if (isListOfFile(phoneNumber)) {
            for(int i = 0; i< getListSize(phoneNumber); i++) {
                map.put("phoneNumber", phoneNumber);
            }
        }
        else {
          map.put("phoneNumber", phoneNumber);
        }
    }
    if (onBehalfOf != null) {
        if (isFileTypeOrListOfFiles(onBehalfOf)) {
            fileTypeFound = true;
        }

        if (onBehalfOf.getClass().equals(java.io.File.class) ||
            onBehalfOf.getClass().equals(Integer.class) ||
            onBehalfOf.getClass().equals(String.class) ||
            onBehalfOf.getClass().isEnum()) {
            map.put("onBehalfOf", onBehalfOf);
        } else if (isListOfFile(onBehalfOf)) {
            for(int i = 0; i< getListSize(onBehalfOf); i++) {
                map.put("onBehalfOf", onBehalfOf);
            }
        }
        else {
          map.put("onBehalfOf", onBehalfOf);
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }

    if(!fileTypeFound) {
        Field[] fields = AccessCodeDetails.class.getDeclaredFields();
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
    openapiFields.add("accessCode");
    openapiFields.add("phoneNumber");
    openapiFields.add("onBehalfOf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accessCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AccessCodeDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessCodeDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessCodeDetails is not found in the empty JSON string", AccessCodeDetails.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccessCodeDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("accessCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessCode").toString()));
      }
      // validate the optional field `phoneNumber`
      if (jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) {
        PhoneNumber.validateJsonElement(jsonObj.get("phoneNumber"));
      }
      if ((jsonObj.get("onBehalfOf") != null && !jsonObj.get("onBehalfOf").isJsonNull()) && !jsonObj.get("onBehalfOf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onBehalfOf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onBehalfOf").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessCodeDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessCodeDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessCodeDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessCodeDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessCodeDetails>() {
           @Override
           public void write(JsonWriter out, AccessCodeDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessCodeDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AccessCodeDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccessCodeDetails
   * @throws IOException if the JSON string is invalid with respect to AccessCodeDetails
   */
  public static AccessCodeDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessCodeDetails.class);
  }

  /**
   * Convert an instance of AccessCodeDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

