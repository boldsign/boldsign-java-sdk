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
 * Date
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class Date {
  public static final String SERIALIZED_NAME_DAY = "day";
  @SerializedName(SERIALIZED_NAME_DAY)
  private Long day;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private Long month;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Long year;

  public Date() {
  }

  public Date day(Long day) {
    this.day = day;
    return this;
  }

  /**
   * Get day
   * @return day
   */
  @javax.annotation.Nullable
  public Long getDay() {
    return day;
  }

  public void setDay(Long day) {
    this.day = day;
  }


  public Date month(Long month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
   */
  @javax.annotation.Nullable
  public Long getMonth() {
    return month;
  }

  public void setMonth(Long month) {
    this.month = month;
  }


  public Date year(Long year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
   */
  @javax.annotation.Nullable
  public Long getYear() {
    return year;
  }

  public void setYear(Long year) {
    this.year = year;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Date date = (Date) o;
    return Objects.equals(this.day, date.day) &&
        Objects.equals(this.month, date.month) &&
        Objects.equals(this.year, date.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, month, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Date {\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (day != null) {
        if (isFileTypeOrListOfFiles(day)) {
            fileTypeFound = true;
        }

        if (day.getClass().equals(java.io.File.class) ||
            day.getClass().equals(Integer.class) ||
            day.getClass().equals(String.class) ||
            day.getClass().equals(java.net.URI.class)||
            day.getClass().isEnum()) {
            map.put("day", day);
        } else if (isListOfFile(day)) {
            for(int i = 0; i< getListSize(day); i++) {
                map.put("day", day);
            }
        }
        else {
          map.put("day", JSON.serialize(day));
        }
    }
    if (month != null) {
        if (isFileTypeOrListOfFiles(month)) {
            fileTypeFound = true;
        }

        if (month.getClass().equals(java.io.File.class) ||
            month.getClass().equals(Integer.class) ||
            month.getClass().equals(String.class) ||
            month.getClass().equals(java.net.URI.class)||
            month.getClass().isEnum()) {
            map.put("month", month);
        } else if (isListOfFile(month)) {
            for(int i = 0; i< getListSize(month); i++) {
                map.put("month", month);
            }
        }
        else {
          map.put("month", JSON.serialize(month));
        }
    }
    if (year != null) {
        if (isFileTypeOrListOfFiles(year)) {
            fileTypeFound = true;
        }

        if (year.getClass().equals(java.io.File.class) ||
            year.getClass().equals(Integer.class) ||
            year.getClass().equals(String.class) ||
            year.getClass().equals(java.net.URI.class)||
            year.getClass().isEnum()) {
            map.put("year", year);
        } else if (isListOfFile(year)) {
            for(int i = 0; i< getListSize(year); i++) {
                map.put("year", year);
            }
        }
        else {
          map.put("year", JSON.serialize(year));
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
    openapiFields.add("day");
    openapiFields.add("month");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Date
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Date.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Date is not found in the empty JSON string", Date.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Date.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Date' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Date> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Date.class));

       return (TypeAdapter<T>) new TypeAdapter<Date>() {
           @Override
           public void write(JsonWriter out, Date value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Date read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Date given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Date
   * @throws IOException if the JSON string is invalid with respect to Date
   */
  public static Date fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Date.class);
  }

  /**
   * Convert an instance of Date to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

