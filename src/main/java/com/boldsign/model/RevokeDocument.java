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
 * RevokeDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class RevokeDocument {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_ON_BEHALF_OF = "onBehalfOf";
  @SerializedName(SERIALIZED_NAME_ON_BEHALF_OF)
  private String onBehalfOf;

  public RevokeDocument() {
  }

  public RevokeDocument message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nonnull
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public RevokeDocument onBehalfOf(String onBehalfOf) {
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
    RevokeDocument revokeDocument = (RevokeDocument) o;
    return Objects.equals(this.message, revokeDocument.message) &&
        Objects.equals(this.onBehalfOf, revokeDocument.onBehalfOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, onBehalfOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokeDocument {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    onBehalfOf: ").append(toIndentedString(onBehalfOf)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (message != null) {
        if (isFileTypeOrListOfFiles(message)) {
            fileTypeFound = true;
        }

        if (message.getClass().equals(java.io.File.class) ||
            message.getClass().equals(Integer.class) ||
            message.getClass().equals(String.class) ||
            message.getClass().isEnum()) {
            map.put("message", message);
        } else if (isListOfFile(message)) {
            for(int i = 0; i< getListSize(message); i++) {
                map.put("message", message);
            }
        }
        else {
          map.put("message", message);
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
    openapiFields.add("message");
    openapiFields.add("onBehalfOf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("message");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RevokeDocument
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RevokeDocument.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RevokeDocument is not found in the empty JSON string", RevokeDocument.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RevokeDocument.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("onBehalfOf") != null && !jsonObj.get("onBehalfOf").isJsonNull()) && !jsonObj.get("onBehalfOf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onBehalfOf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onBehalfOf").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RevokeDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RevokeDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RevokeDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RevokeDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<RevokeDocument>() {
           @Override
           public void write(JsonWriter out, RevokeDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RevokeDocument read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RevokeDocument given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RevokeDocument
   * @throws IOException if the JSON string is invalid with respect to RevokeDocument
   */
  public static RevokeDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RevokeDocument.class);
  }

  /**
   * Convert an instance of RevokeDocument to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

