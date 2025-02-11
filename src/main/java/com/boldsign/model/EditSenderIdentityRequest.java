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
import com.boldsign.model.NotificationSettings;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
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
 * EditSenderIdentityRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class EditSenderIdentityRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NOTIFICATION_SETTINGS = "notificationSettings";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_SETTINGS)
  private NotificationSettings notificationSettings;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirectUrl";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private URI redirectUrl;

  public EditSenderIdentityRequest() {
  }

  public EditSenderIdentityRequest name(String name) {
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


  public EditSenderIdentityRequest notificationSettings(NotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  /**
   * Get notificationSettings
   * @return notificationSettings
   */
  @javax.annotation.Nullable
  public NotificationSettings getNotificationSettings() {
    return notificationSettings;
  }

  public void setNotificationSettings(NotificationSettings notificationSettings) {
    this.notificationSettings = notificationSettings;
  }


  public EditSenderIdentityRequest redirectUrl(URI redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

  /**
   * Get redirectUrl
   * @return redirectUrl
   */
  @javax.annotation.Nullable
  public URI getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(URI redirectUrl) {
    this.redirectUrl = redirectUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditSenderIdentityRequest editSenderIdentityRequest = (EditSenderIdentityRequest) o;
    return Objects.equals(this.name, editSenderIdentityRequest.name) &&
        Objects.equals(this.notificationSettings, editSenderIdentityRequest.notificationSettings) &&
        Objects.equals(this.redirectUrl, editSenderIdentityRequest.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, notificationSettings, redirectUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditSenderIdentityRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationSettings: ").append(toIndentedString(notificationSettings)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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
            name.getClass().isEnum()) {
            map.put("name", name);
        } else if (isListOfFile(name)) {
            for(int i = 0; i< getListSize(name); i++) {
                map.put("name", name);
            }
        }
        else {
          map.put("name", name);
        }
    }
    if (notificationSettings != null) {
        if (isFileTypeOrListOfFiles(notificationSettings)) {
            fileTypeFound = true;
        }

        if (notificationSettings.getClass().equals(java.io.File.class) ||
            notificationSettings.getClass().equals(Integer.class) ||
            notificationSettings.getClass().equals(String.class) ||
            notificationSettings.getClass().isEnum()) {
            map.put("notificationSettings", notificationSettings);
        } else if (isListOfFile(notificationSettings)) {
            for(int i = 0; i< getListSize(notificationSettings); i++) {
                map.put("notificationSettings", notificationSettings);
            }
        }
        else {
          map.put("notificationSettings", notificationSettings);
        }
    }
    if (redirectUrl != null) {
        if (isFileTypeOrListOfFiles(redirectUrl)) {
            fileTypeFound = true;
        }

        if (redirectUrl.getClass().equals(java.io.File.class) ||
            redirectUrl.getClass().equals(Integer.class) ||
            redirectUrl.getClass().equals(String.class) ||
            redirectUrl.getClass().isEnum()) {
            map.put("redirectUrl", redirectUrl);
        } else if (isListOfFile(redirectUrl)) {
            for(int i = 0; i< getListSize(redirectUrl); i++) {
                map.put("redirectUrl", redirectUrl);
            }
        }
        else {
          map.put("redirectUrl", redirectUrl);
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }

    if(!fileTypeFound) {
        Field[] fields = EditSenderIdentityRequest.class.getDeclaredFields();
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
    openapiFields.add("name");
    openapiFields.add("notificationSettings");
    openapiFields.add("redirectUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EditSenderIdentityRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EditSenderIdentityRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EditSenderIdentityRequest is not found in the empty JSON string", EditSenderIdentityRequest.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `notificationSettings`
      if (jsonObj.get("notificationSettings") != null && !jsonObj.get("notificationSettings").isJsonNull()) {
        NotificationSettings.validateJsonElement(jsonObj.get("notificationSettings"));
      }
      if ((jsonObj.get("redirectUrl") != null && !jsonObj.get("redirectUrl").isJsonNull()) && !jsonObj.get("redirectUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirectUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirectUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EditSenderIdentityRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EditSenderIdentityRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EditSenderIdentityRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EditSenderIdentityRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EditSenderIdentityRequest>() {
           @Override
           public void write(JsonWriter out, EditSenderIdentityRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EditSenderIdentityRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EditSenderIdentityRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EditSenderIdentityRequest
   * @throws IOException if the JSON string is invalid with respect to EditSenderIdentityRequest
   */
  public static EditSenderIdentityRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EditSenderIdentityRequest.class);
  }

  /**
   * Convert an instance of EditSenderIdentityRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

