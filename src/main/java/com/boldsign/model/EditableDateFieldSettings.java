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
import java.time.OffsetDateTime;
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
 * EditableDateFieldSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class EditableDateFieldSettings {
  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_MIN_DATE = "minDate";
  @SerializedName(SERIALIZED_NAME_MIN_DATE)
  private OffsetDateTime minDate;

  public static final String SERIALIZED_NAME_MAX_DATE = "maxDate";
  @SerializedName(SERIALIZED_NAME_MAX_DATE)
  private OffsetDateTime maxDate;

  public EditableDateFieldSettings() {
  }

  public EditableDateFieldSettings dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

  /**
   * Get dateFormat
   * @return dateFormat
   */
  @javax.annotation.Nullable
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }


  public EditableDateFieldSettings minDate(OffsetDateTime minDate) {
    this.minDate = minDate;
    return this;
  }

  /**
   * Get minDate
   * @return minDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getMinDate() {
    return minDate;
  }

  public void setMinDate(OffsetDateTime minDate) {
    this.minDate = minDate;
  }


  public EditableDateFieldSettings maxDate(OffsetDateTime maxDate) {
    this.maxDate = maxDate;
    return this;
  }

  /**
   * Get maxDate
   * @return maxDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getMaxDate() {
    return maxDate;
  }

  public void setMaxDate(OffsetDateTime maxDate) {
    this.maxDate = maxDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditableDateFieldSettings editableDateFieldSettings = (EditableDateFieldSettings) o;
    return Objects.equals(this.dateFormat, editableDateFieldSettings.dateFormat) &&
        Objects.equals(this.minDate, editableDateFieldSettings.minDate) &&
        Objects.equals(this.maxDate, editableDateFieldSettings.maxDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFormat, minDate, maxDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditableDateFieldSettings {\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    minDate: ").append(toIndentedString(minDate)).append("\n");
    sb.append("    maxDate: ").append(toIndentedString(maxDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (dateFormat != null) {
        if (isFileTypeOrListOfFiles(dateFormat)) {
            fileTypeFound = true;
        }

        if (dateFormat.getClass().equals(java.io.File.class) ||
            dateFormat.getClass().equals(Integer.class) ||
            dateFormat.getClass().equals(String.class) ||
            dateFormat.getClass().equals(java.net.URI.class)||
            dateFormat.getClass().isEnum()) {
            map.put("dateFormat", dateFormat);
        } else if (isListOfFile(dateFormat)) {
            for(int i = 0; i< getListSize(dateFormat); i++) {
                map.put("dateFormat", dateFormat);
            }
        }
        else {
          map.put("dateFormat", JSON.serialize(dateFormat));
        }
    }
    if (minDate != null) {
        if (isFileTypeOrListOfFiles(minDate)) {
            fileTypeFound = true;
        }

        if (minDate.getClass().equals(java.io.File.class) ||
            minDate.getClass().equals(Integer.class) ||
            minDate.getClass().equals(String.class) ||
            minDate.getClass().equals(java.net.URI.class)||
            minDate.getClass().isEnum()) {
            map.put("minDate", minDate);
        } else if (isListOfFile(minDate)) {
            for(int i = 0; i< getListSize(minDate); i++) {
                map.put("minDate", minDate);
            }
        }
        else {
          map.put("minDate", JSON.serialize(minDate));
        }
    }
    if (maxDate != null) {
        if (isFileTypeOrListOfFiles(maxDate)) {
            fileTypeFound = true;
        }

        if (maxDate.getClass().equals(java.io.File.class) ||
            maxDate.getClass().equals(Integer.class) ||
            maxDate.getClass().equals(String.class) ||
            maxDate.getClass().equals(java.net.URI.class)||
            maxDate.getClass().isEnum()) {
            map.put("maxDate", maxDate);
        } else if (isListOfFile(maxDate)) {
            for(int i = 0; i< getListSize(maxDate); i++) {
                map.put("maxDate", maxDate);
            }
        }
        else {
          map.put("maxDate", JSON.serialize(maxDate));
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
    openapiFields.add("dateFormat");
    openapiFields.add("minDate");
    openapiFields.add("maxDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dateFormat");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EditableDateFieldSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EditableDateFieldSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EditableDateFieldSettings is not found in the empty JSON string", EditableDateFieldSettings.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EditableDateFieldSettings.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dateFormat") != null && !jsonObj.get("dateFormat").isJsonNull()) && !jsonObj.get("dateFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateFormat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EditableDateFieldSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EditableDateFieldSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EditableDateFieldSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EditableDateFieldSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<EditableDateFieldSettings>() {
           @Override
           public void write(JsonWriter out, EditableDateFieldSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EditableDateFieldSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EditableDateFieldSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EditableDateFieldSettings
   * @throws IOException if the JSON string is invalid with respect to EditableDateFieldSettings
   */
  public static EditableDateFieldSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EditableDateFieldSettings.class);
  }

  /**
   * Convert an instance of EditableDateFieldSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

