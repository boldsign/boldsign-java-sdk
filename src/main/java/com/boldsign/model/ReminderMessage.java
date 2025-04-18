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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * ReminderMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class ReminderMessage {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_ON_BEHALF_OF = "onBehalfOf";
  @SerializedName(SERIALIZED_NAME_ON_BEHALF_OF)
  private String onBehalfOf;

  public static final String SERIALIZED_NAME_REMINDER_PHONE_NUMBERS = "reminderPhoneNumbers";
  @SerializedName(SERIALIZED_NAME_REMINDER_PHONE_NUMBERS)
  private List<PhoneNumber> reminderPhoneNumbers;

  public ReminderMessage() {
  }

  public ReminderMessage message(String message) {
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


  public ReminderMessage onBehalfOf(String onBehalfOf) {
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


  public ReminderMessage reminderPhoneNumbers(List<PhoneNumber> reminderPhoneNumbers) {
    this.reminderPhoneNumbers = reminderPhoneNumbers;
    return this;
  }

  public ReminderMessage addReminderPhoneNumbersItem(PhoneNumber reminderPhoneNumbersItem) {
    if (this.reminderPhoneNumbers == null) {
      this.reminderPhoneNumbers = new ArrayList<>();
    }
    this.reminderPhoneNumbers.add(reminderPhoneNumbersItem);
    return this;
  }

  /**
   * Get reminderPhoneNumbers
   * @return reminderPhoneNumbers
   */
  @javax.annotation.Nullable
  public List<PhoneNumber> getReminderPhoneNumbers() {
    return reminderPhoneNumbers;
  }

  public void setReminderPhoneNumbers(List<PhoneNumber> reminderPhoneNumbers) {
    this.reminderPhoneNumbers = reminderPhoneNumbers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReminderMessage reminderMessage = (ReminderMessage) o;
    return Objects.equals(this.message, reminderMessage.message) &&
        Objects.equals(this.onBehalfOf, reminderMessage.onBehalfOf) &&
        Objects.equals(this.reminderPhoneNumbers, reminderMessage.reminderPhoneNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, onBehalfOf, reminderPhoneNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReminderMessage {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    onBehalfOf: ").append(toIndentedString(onBehalfOf)).append("\n");
    sb.append("    reminderPhoneNumbers: ").append(toIndentedString(reminderPhoneNumbers)).append("\n");
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
    if (onBehalfOf != null) {
        if (isFileTypeOrListOfFiles(onBehalfOf)) {
            fileTypeFound = true;
        }

        if (onBehalfOf.getClass().equals(java.io.File.class) ||
            onBehalfOf.getClass().equals(Integer.class) ||
            onBehalfOf.getClass().equals(String.class) ||
            onBehalfOf.getClass().equals(java.net.URI.class)||
            onBehalfOf.getClass().isEnum()) {
            map.put("onBehalfOf", onBehalfOf);
        } else if (isListOfFile(onBehalfOf)) {
            for(int i = 0; i< getListSize(onBehalfOf); i++) {
                map.put("onBehalfOf", onBehalfOf);
            }
        }
        else {
          map.put("onBehalfOf", JSON.serialize(onBehalfOf));
        }
    }
    if (reminderPhoneNumbers != null) {
        if (isFileTypeOrListOfFiles(reminderPhoneNumbers)) {
            fileTypeFound = true;
        }

        if (reminderPhoneNumbers.getClass().equals(java.io.File.class) ||
            reminderPhoneNumbers.getClass().equals(Integer.class) ||
            reminderPhoneNumbers.getClass().equals(String.class) ||
            reminderPhoneNumbers.getClass().equals(java.net.URI.class)||
            reminderPhoneNumbers.getClass().isEnum()) {
            map.put("reminderPhoneNumbers", reminderPhoneNumbers);
        } else if (isListOfFile(reminderPhoneNumbers)) {
            for(int i = 0; i< getListSize(reminderPhoneNumbers); i++) {
                map.put("reminderPhoneNumbers", reminderPhoneNumbers);
            }
        }
        else {
          List<String> objectList = new ArrayList<String>();
          for(Object item : reminderPhoneNumbers) {
            if(item instanceof URI || item instanceof String || item instanceof Integer) {
              objectList.add(item.toString());
            }
            else {
              String objectData = JSON.serialize(item);
              objectList.add(objectData);
            }
          }
          map.put("reminderPhoneNumbers", objectList);
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
    openapiFields.add("reminderPhoneNumbers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReminderMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReminderMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReminderMessage is not found in the empty JSON string", ReminderMessage.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("onBehalfOf") != null && !jsonObj.get("onBehalfOf").isJsonNull()) && !jsonObj.get("onBehalfOf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onBehalfOf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onBehalfOf").toString()));
      }
      if (jsonObj.get("reminderPhoneNumbers") != null && !jsonObj.get("reminderPhoneNumbers").isJsonNull()) {
        JsonArray jsonArrayreminderPhoneNumbers = jsonObj.getAsJsonArray("reminderPhoneNumbers");
        if (jsonArrayreminderPhoneNumbers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reminderPhoneNumbers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reminderPhoneNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("reminderPhoneNumbers").toString()));
          }

          // validate the optional field `reminderPhoneNumbers` (array)
          for (int i = 0; i < jsonArrayreminderPhoneNumbers.size(); i++) {
            PhoneNumber.validateJsonElement(jsonArrayreminderPhoneNumbers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReminderMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReminderMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReminderMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReminderMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ReminderMessage>() {
           @Override
           public void write(JsonWriter out, ReminderMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReminderMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReminderMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReminderMessage
   * @throws IOException if the JSON string is invalid with respect to ReminderMessage
   */
  public static ReminderMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReminderMessage.class);
  }

  /**
   * Convert an instance of ReminderMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

