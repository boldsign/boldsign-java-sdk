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
 * DocumentReassign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class DocumentReassign {
  public static final String SERIALIZED_NAME_SIGNER_EMAIL = "signerEmail";
  @SerializedName(SERIALIZED_NAME_SIGNER_EMAIL)
  private String signerEmail;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order = 0;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public DocumentReassign() {
  }

  public DocumentReassign signerEmail(String signerEmail) {
    this.signerEmail = signerEmail;
    return this;
  }

  /**
   * Get signerEmail
   * @return signerEmail
   */
  @javax.annotation.Nullable
  public String getSignerEmail() {
    return signerEmail;
  }

  public void setSignerEmail(String signerEmail) {
    this.signerEmail = signerEmail;
  }


  public DocumentReassign order(Integer order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
   */
  @javax.annotation.Nullable
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }


  public DocumentReassign message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentReassign documentReassign = (DocumentReassign) o;
    return Objects.equals(this.signerEmail, documentReassign.signerEmail) &&
        Objects.equals(this.order, documentReassign.order) &&
        Objects.equals(this.message, documentReassign.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signerEmail, order, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentReassign {\n");
    sb.append("    signerEmail: ").append(toIndentedString(signerEmail)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (signerEmail != null) {
        if (isFileTypeOrListOfFiles(signerEmail)) {
            fileTypeFound = true;
        }

        if (signerEmail.getClass().equals(java.io.File.class) ||
            signerEmail.getClass().equals(Integer.class) ||
            signerEmail.getClass().equals(String.class) ||
            signerEmail.getClass().equals(java.net.URI.class)||
            signerEmail.getClass().isEnum()) {
            map.put("signerEmail", signerEmail);
        } else if (isListOfFile(signerEmail)) {
            for(int i = 0; i< getListSize(signerEmail); i++) {
                map.put("signerEmail", signerEmail);
            }
        }
        else {
          map.put("signerEmail", JSON.serialize(signerEmail));
        }
    }
    if (order != null) {
        if (isFileTypeOrListOfFiles(order)) {
            fileTypeFound = true;
        }

        if (order.getClass().equals(java.io.File.class) ||
            order.getClass().equals(Integer.class) ||
            order.getClass().equals(String.class) ||
            order.getClass().equals(java.net.URI.class)||
            order.getClass().isEnum()) {
            map.put("order", order);
        } else if (isListOfFile(order)) {
            for(int i = 0; i< getListSize(order); i++) {
                map.put("order", order);
            }
        }
        else {
          map.put("order", JSON.serialize(order));
        }
    }
    if (message != null) {
        if (isFileTypeOrListOfFiles(message)) {
            fileTypeFound = true;
        }

        if (message.getClass().equals(java.io.File.class) ||
            message.getClass().equals(Integer.class) ||
            message.getClass().equals(String.class) ||
            message.getClass().equals(java.net.URI.class)||
            message.getClass().isEnum()) {
            map.put("message", message);
        } else if (isListOfFile(message)) {
            for(int i = 0; i< getListSize(message); i++) {
                map.put("message", message);
            }
        }
        else {
          map.put("message", JSON.serialize(message));
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
    openapiFields.add("signerEmail");
    openapiFields.add("order");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentReassign
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentReassign.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentReassign is not found in the empty JSON string", DocumentReassign.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("signerEmail") != null && !jsonObj.get("signerEmail").isJsonNull()) && !jsonObj.get("signerEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signerEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signerEmail").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentReassign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentReassign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentReassign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentReassign.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentReassign>() {
           @Override
           public void write(JsonWriter out, DocumentReassign value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentReassign read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentReassign given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentReassign
   * @throws IOException if the JSON string is invalid with respect to DocumentReassign
   */
  public static DocumentReassign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentReassign.class);
  }

  /**
   * Convert an instance of DocumentReassign to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

