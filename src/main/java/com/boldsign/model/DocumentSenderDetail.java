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
 * DocumentSenderDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class DocumentSenderDetail {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIVATE_MESSAGE = "privateMessage";
  @SerializedName(SERIALIZED_NAME_PRIVATE_MESSAGE)
  private String privateMessage;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_IS_VIEWED = "isViewed";
  @SerializedName(SERIALIZED_NAME_IS_VIEWED)
  private Boolean isViewed = false;

  public DocumentSenderDetail() {
  }

  public DocumentSenderDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DocumentSenderDetail privateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
    return this;
  }

  /**
   * Get privateMessage
   * @return privateMessage
   */
  @javax.annotation.Nullable
  public String getPrivateMessage() {
    return privateMessage;
  }

  public void setPrivateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
  }


  public DocumentSenderDetail emailAddress(String emailAddress) {
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


  public DocumentSenderDetail isViewed(Boolean isViewed) {
    this.isViewed = isViewed;
    return this;
  }

  /**
   * Get isViewed
   * @return isViewed
   */
  @javax.annotation.Nullable
  public Boolean getIsViewed() {
    return isViewed;
  }

  public void setIsViewed(Boolean isViewed) {
    this.isViewed = isViewed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSenderDetail documentSenderDetail = (DocumentSenderDetail) o;
    return Objects.equals(this.name, documentSenderDetail.name) &&
        Objects.equals(this.privateMessage, documentSenderDetail.privateMessage) &&
        Objects.equals(this.emailAddress, documentSenderDetail.emailAddress) &&
        Objects.equals(this.isViewed, documentSenderDetail.isViewed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, privateMessage, emailAddress, isViewed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSenderDetail {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privateMessage: ").append(toIndentedString(privateMessage)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    isViewed: ").append(toIndentedString(isViewed)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (name != null) {
        if (isFileTypeOrListOfFiles(name)) {
            fileTypeFound = true;
        }

        if (name.getClass().equals(java.io.File.class) ||
            name.getClass().equals(Integer.class) ||
            name.getClass().equals(String.class) ||
            name.getClass().equals(java.net.URI.class)||
            name.getClass().isEnum()) {
            map.put("name", name);
        } else if (isListOfFile(name)) {
            for(int i = 0; i< getListSize(name); i++) {
                map.put("name", name);
            }
        }
        else {
          map.put("name", JSON.serialize(name));
        }
    }
    if (privateMessage != null) {
        if (isFileTypeOrListOfFiles(privateMessage)) {
            fileTypeFound = true;
        }

        if (privateMessage.getClass().equals(java.io.File.class) ||
            privateMessage.getClass().equals(Integer.class) ||
            privateMessage.getClass().equals(String.class) ||
            privateMessage.getClass().equals(java.net.URI.class)||
            privateMessage.getClass().isEnum()) {
            map.put("privateMessage", privateMessage);
        } else if (isListOfFile(privateMessage)) {
            for(int i = 0; i< getListSize(privateMessage); i++) {
                map.put("privateMessage", privateMessage);
            }
        }
        else {
          map.put("privateMessage", JSON.serialize(privateMessage));
        }
    }
    if (emailAddress != null) {
        if (isFileTypeOrListOfFiles(emailAddress)) {
            fileTypeFound = true;
        }

        if (emailAddress.getClass().equals(java.io.File.class) ||
            emailAddress.getClass().equals(Integer.class) ||
            emailAddress.getClass().equals(String.class) ||
            emailAddress.getClass().equals(java.net.URI.class)||
            emailAddress.getClass().isEnum()) {
            map.put("emailAddress", emailAddress);
        } else if (isListOfFile(emailAddress)) {
            for(int i = 0; i< getListSize(emailAddress); i++) {
                map.put("emailAddress", emailAddress);
            }
        }
        else {
          map.put("emailAddress", JSON.serialize(emailAddress));
        }
    }
    if (isViewed != null) {
        if (isFileTypeOrListOfFiles(isViewed)) {
            fileTypeFound = true;
        }

        if (isViewed.getClass().equals(java.io.File.class) ||
            isViewed.getClass().equals(Integer.class) ||
            isViewed.getClass().equals(String.class) ||
            isViewed.getClass().equals(java.net.URI.class)||
            isViewed.getClass().isEnum()) {
            map.put("isViewed", isViewed);
        } else if (isListOfFile(isViewed)) {
            for(int i = 0; i< getListSize(isViewed); i++) {
                map.put("isViewed", isViewed);
            }
        }
        else {
          map.put("isViewed", JSON.serialize(isViewed));
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
    openapiFields.add("name");
    openapiFields.add("privateMessage");
    openapiFields.add("emailAddress");
    openapiFields.add("isViewed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentSenderDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentSenderDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentSenderDetail is not found in the empty JSON string", DocumentSenderDetail.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("privateMessage") != null && !jsonObj.get("privateMessage").isJsonNull()) && !jsonObj.get("privateMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privateMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privateMessage").toString()));
      }
      if ((jsonObj.get("emailAddress") != null && !jsonObj.get("emailAddress").isJsonNull()) && !jsonObj.get("emailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentSenderDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentSenderDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentSenderDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentSenderDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentSenderDetail>() {
           @Override
           public void write(JsonWriter out, DocumentSenderDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentSenderDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentSenderDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentSenderDetail
   * @throws IOException if the JSON string is invalid with respect to DocumentSenderDetail
   */
  public static DocumentSenderDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentSenderDetail.class);
  }

  /**
   * Convert an instance of DocumentSenderDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

