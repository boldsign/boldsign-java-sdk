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
 * ExtendExpiry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class ExtendExpiry {
  public static final String SERIALIZED_NAME_NEW_EXPIRY_VALUE = "newExpiryValue";
  @SerializedName(SERIALIZED_NAME_NEW_EXPIRY_VALUE)
  private String newExpiryValue;

  public static final String SERIALIZED_NAME_NEW_EXPIRY_DATE = "newExpiryDate";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_NEW_EXPIRY_DATE)
  private String newExpiryDate;

  public static final String SERIALIZED_NAME_WARN_PRIOR = "warnPrior";
  @SerializedName(SERIALIZED_NAME_WARN_PRIOR)
  private Boolean warnPrior;

  public static final String SERIALIZED_NAME_ON_BEHALF_OF = "onBehalfOf";
  @SerializedName(SERIALIZED_NAME_ON_BEHALF_OF)
  private String onBehalfOf;

  public ExtendExpiry() {
  }

  public ExtendExpiry newExpiryValue(String newExpiryValue) {
    this.newExpiryValue = newExpiryValue;
    return this;
  }

  /**
   * Get newExpiryValue
   * @return newExpiryValue
   */
  @javax.annotation.Nullable
  public String getNewExpiryValue() {
    return newExpiryValue;
  }

  public void setNewExpiryValue(String newExpiryValue) {
    this.newExpiryValue = newExpiryValue;
  }


  @Deprecated
  public ExtendExpiry newExpiryDate(String newExpiryDate) {
    this.newExpiryDate = newExpiryDate;
    return this;
  }

  /**
   * Get newExpiryDate
   * @return newExpiryDate
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public String getNewExpiryDate() {
    return newExpiryDate;
  }

  @Deprecated
  public void setNewExpiryDate(String newExpiryDate) {
    this.newExpiryDate = newExpiryDate;
  }


  public ExtendExpiry warnPrior(Boolean warnPrior) {
    this.warnPrior = warnPrior;
    return this;
  }

  /**
   * Get warnPrior
   * @return warnPrior
   */
  @javax.annotation.Nullable
  public Boolean getWarnPrior() {
    return warnPrior;
  }

  public void setWarnPrior(Boolean warnPrior) {
    this.warnPrior = warnPrior;
  }


  public ExtendExpiry onBehalfOf(String onBehalfOf) {
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
    ExtendExpiry extendExpiry = (ExtendExpiry) o;
    return Objects.equals(this.newExpiryValue, extendExpiry.newExpiryValue) &&
        Objects.equals(this.newExpiryDate, extendExpiry.newExpiryDate) &&
        Objects.equals(this.warnPrior, extendExpiry.warnPrior) &&
        Objects.equals(this.onBehalfOf, extendExpiry.onBehalfOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newExpiryValue, newExpiryDate, warnPrior, onBehalfOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendExpiry {\n");
    sb.append("    newExpiryValue: ").append(toIndentedString(newExpiryValue)).append("\n");
    sb.append("    newExpiryDate: ").append(toIndentedString(newExpiryDate)).append("\n");
    sb.append("    warnPrior: ").append(toIndentedString(warnPrior)).append("\n");
    sb.append("    onBehalfOf: ").append(toIndentedString(onBehalfOf)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (newExpiryValue != null) {
        if (isFileTypeOrListOfFiles(newExpiryValue)) {
            fileTypeFound = true;
        }

        if (newExpiryValue.getClass().equals(java.io.File.class) ||
            newExpiryValue.getClass().equals(Integer.class) ||
            newExpiryValue.getClass().equals(String.class) ||
            newExpiryValue.getClass().isEnum()) {
            map.put("newExpiryValue", newExpiryValue);
        } else if (isListOfFile(newExpiryValue)) {
            for(int i = 0; i< getListSize(newExpiryValue); i++) {
                map.put("newExpiryValue", newExpiryValue);
            }
        }
        else {
          map.put("newExpiryValue", newExpiryValue);
        }
    }
    if (newExpiryDate != null) {
        if (isFileTypeOrListOfFiles(newExpiryDate)) {
            fileTypeFound = true;
        }

        if (newExpiryDate.getClass().equals(java.io.File.class) ||
            newExpiryDate.getClass().equals(Integer.class) ||
            newExpiryDate.getClass().equals(String.class) ||
            newExpiryDate.getClass().isEnum()) {
            map.put("newExpiryDate", newExpiryDate);
        } else if (isListOfFile(newExpiryDate)) {
            for(int i = 0; i< getListSize(newExpiryDate); i++) {
                map.put("newExpiryDate", newExpiryDate);
            }
        }
        else {
          map.put("newExpiryDate", newExpiryDate);
        }
    }
    if (warnPrior != null) {
        if (isFileTypeOrListOfFiles(warnPrior)) {
            fileTypeFound = true;
        }

        if (warnPrior.getClass().equals(java.io.File.class) ||
            warnPrior.getClass().equals(Integer.class) ||
            warnPrior.getClass().equals(String.class) ||
            warnPrior.getClass().isEnum()) {
            map.put("warnPrior", warnPrior);
        } else if (isListOfFile(warnPrior)) {
            for(int i = 0; i< getListSize(warnPrior); i++) {
                map.put("warnPrior", warnPrior);
            }
        }
        else {
          map.put("warnPrior", warnPrior);
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
    openapiFields.add("newExpiryValue");
    openapiFields.add("newExpiryDate");
    openapiFields.add("warnPrior");
    openapiFields.add("onBehalfOf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ExtendExpiry
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExtendExpiry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExtendExpiry is not found in the empty JSON string", ExtendExpiry.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("newExpiryValue") != null && !jsonObj.get("newExpiryValue").isJsonNull()) && !jsonObj.get("newExpiryValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newExpiryValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newExpiryValue").toString()));
      }
      if ((jsonObj.get("newExpiryDate") != null && !jsonObj.get("newExpiryDate").isJsonNull()) && !jsonObj.get("newExpiryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newExpiryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newExpiryDate").toString()));
      }
      if ((jsonObj.get("onBehalfOf") != null && !jsonObj.get("onBehalfOf").isJsonNull()) && !jsonObj.get("onBehalfOf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onBehalfOf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onBehalfOf").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExtendExpiry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExtendExpiry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExtendExpiry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExtendExpiry.class));

       return (TypeAdapter<T>) new TypeAdapter<ExtendExpiry>() {
           @Override
           public void write(JsonWriter out, ExtendExpiry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExtendExpiry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ExtendExpiry given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExtendExpiry
   * @throws IOException if the JSON string is invalid with respect to ExtendExpiry
   */
  public static ExtendExpiry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExtendExpiry.class);
  }

  /**
   * Convert an instance of ExtendExpiry to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

