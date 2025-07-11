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
 * ModificationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class ModificationDetails {
  public static final String SERIALIZED_NAME_REMOVED_COUNT = "removedCount";
  @SerializedName(SERIALIZED_NAME_REMOVED_COUNT)
  private Integer removedCount;

  public static final String SERIALIZED_NAME_ADDED_COUNT = "addedCount";
  @SerializedName(SERIALIZED_NAME_ADDED_COUNT)
  private Integer addedCount;

  public ModificationDetails() {
  }

  public ModificationDetails removedCount(Integer removedCount) {
    this.removedCount = removedCount;
    return this;
  }

  /**
   * Get removedCount
   * @return removedCount
   */
  @javax.annotation.Nullable
  public Integer getRemovedCount() {
    return removedCount;
  }

  public void setRemovedCount(Integer removedCount) {
    this.removedCount = removedCount;
  }


  public ModificationDetails addedCount(Integer addedCount) {
    this.addedCount = addedCount;
    return this;
  }

  /**
   * Get addedCount
   * @return addedCount
   */
  @javax.annotation.Nullable
  public Integer getAddedCount() {
    return addedCount;
  }

  public void setAddedCount(Integer addedCount) {
    this.addedCount = addedCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModificationDetails modificationDetails = (ModificationDetails) o;
    return Objects.equals(this.removedCount, modificationDetails.removedCount) &&
        Objects.equals(this.addedCount, modificationDetails.addedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removedCount, addedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModificationDetails {\n");
    sb.append("    removedCount: ").append(toIndentedString(removedCount)).append("\n");
    sb.append("    addedCount: ").append(toIndentedString(addedCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (removedCount != null) {
        if (isFileTypeOrListOfFiles(removedCount)) {
            fileTypeFound = true;
        }

        if (removedCount.getClass().equals(java.io.File.class) ||
            removedCount.getClass().equals(Integer.class) ||
            removedCount.getClass().equals(String.class) ||
            removedCount.getClass().equals(java.net.URI.class)||
            removedCount.getClass().isEnum()) {
            map.put("removedCount", removedCount);
        } else if (isListOfFile(removedCount)) {
            for(int i = 0; i< getListSize(removedCount); i++) {
                map.put("removedCount", removedCount);
            }
        }
        else {
          map.put("removedCount", JSON.serialize(removedCount));
        }
    }
    if (addedCount != null) {
        if (isFileTypeOrListOfFiles(addedCount)) {
            fileTypeFound = true;
        }

        if (addedCount.getClass().equals(java.io.File.class) ||
            addedCount.getClass().equals(Integer.class) ||
            addedCount.getClass().equals(String.class) ||
            addedCount.getClass().equals(java.net.URI.class)||
            addedCount.getClass().isEnum()) {
            map.put("addedCount", addedCount);
        } else if (isListOfFile(addedCount)) {
            for(int i = 0; i< getListSize(addedCount); i++) {
                map.put("addedCount", addedCount);
            }
        }
        else {
          map.put("addedCount", JSON.serialize(addedCount));
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
    openapiFields.add("removedCount");
    openapiFields.add("addedCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ModificationDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModificationDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModificationDetails is not found in the empty JSON string", ModificationDetails.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModificationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModificationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModificationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModificationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ModificationDetails>() {
           @Override
           public void write(JsonWriter out, ModificationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModificationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ModificationDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ModificationDetails
   * @throws IOException if the JSON string is invalid with respect to ModificationDetails
   */
  public static ModificationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModificationDetails.class);
  }

  /**
   * Convert an instance of ModificationDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

