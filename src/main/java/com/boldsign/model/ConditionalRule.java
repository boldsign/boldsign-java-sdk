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
 * ConditionalRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class ConditionalRule {
  public static final String SERIALIZED_NAME_FIELD_ID = "fieldId";
  @SerializedName(SERIALIZED_NAME_FIELD_ID)
  private String fieldId;

  public static final String SERIALIZED_NAME_IS_CHECKED = "isChecked";
  @SerializedName(SERIALIZED_NAME_IS_CHECKED)
  private Boolean isChecked;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public ConditionalRule() {
  }

  public ConditionalRule fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  /**
   * Get fieldId
   * @return fieldId
   */
  @javax.annotation.Nullable
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }


  public ConditionalRule isChecked(Boolean isChecked) {
    this.isChecked = isChecked;
    return this;
  }

  /**
   * Get isChecked
   * @return isChecked
   */
  @javax.annotation.Nullable
  public Boolean getIsChecked() {
    return isChecked;
  }

  public void setIsChecked(Boolean isChecked) {
    this.isChecked = isChecked;
  }


  public ConditionalRule value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionalRule conditionalRule = (ConditionalRule) o;
    return Objects.equals(this.fieldId, conditionalRule.fieldId) &&
        Objects.equals(this.isChecked, conditionalRule.isChecked) &&
        Objects.equals(this.value, conditionalRule.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, isChecked, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalRule {\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    isChecked: ").append(toIndentedString(isChecked)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (fieldId != null) {
        if (isFileTypeOrListOfFiles(fieldId)) {
            fileTypeFound = true;
        }

        if (fieldId.getClass().equals(java.io.File.class) ||
            fieldId.getClass().equals(Integer.class) ||
            fieldId.getClass().equals(String.class) ||
            fieldId.getClass().equals(java.net.URI.class)||
            fieldId.getClass().isEnum()) {
            map.put("fieldId", fieldId);
        } else if (isListOfFile(fieldId)) {
            for(int i = 0; i< getListSize(fieldId); i++) {
                map.put("fieldId", fieldId);
            }
        }
        else {
          map.put("fieldId", JSON.serialize(fieldId));
        }
    }
    if (isChecked != null) {
        if (isFileTypeOrListOfFiles(isChecked)) {
            fileTypeFound = true;
        }

        if (isChecked.getClass().equals(java.io.File.class) ||
            isChecked.getClass().equals(Integer.class) ||
            isChecked.getClass().equals(String.class) ||
            isChecked.getClass().equals(java.net.URI.class)||
            isChecked.getClass().isEnum()) {
            map.put("isChecked", isChecked);
        } else if (isListOfFile(isChecked)) {
            for(int i = 0; i< getListSize(isChecked); i++) {
                map.put("isChecked", isChecked);
            }
        }
        else {
          map.put("isChecked", JSON.serialize(isChecked));
        }
    }
    if (value != null) {
        if (isFileTypeOrListOfFiles(value)) {
            fileTypeFound = true;
        }

        if (value.getClass().equals(java.io.File.class) ||
            value.getClass().equals(Integer.class) ||
            value.getClass().equals(String.class) ||
            value.getClass().equals(java.net.URI.class)||
            value.getClass().isEnum()) {
            map.put("value", value);
        } else if (isListOfFile(value)) {
            for(int i = 0; i< getListSize(value); i++) {
                map.put("value", value);
            }
        }
        else {
          map.put("value", JSON.serialize(value));
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
    openapiFields.add("fieldId");
    openapiFields.add("isChecked");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConditionalRule
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConditionalRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConditionalRule is not found in the empty JSON string", ConditionalRule.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fieldId") != null && !jsonObj.get("fieldId").isJsonNull()) && !jsonObj.get("fieldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldId").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConditionalRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConditionalRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConditionalRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConditionalRule.class));

       return (TypeAdapter<T>) new TypeAdapter<ConditionalRule>() {
           @Override
           public void write(JsonWriter out, ConditionalRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConditionalRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConditionalRule given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConditionalRule
   * @throws IOException if the JSON string is invalid with respect to ConditionalRule
   */
  public static ConditionalRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConditionalRule.class);
  }

  /**
   * Convert an instance of ConditionalRule to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

