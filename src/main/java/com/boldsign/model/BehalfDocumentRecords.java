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
import com.boldsign.model.BehalfDocument;
import com.boldsign.model.PageDetails;
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
 * BehalfDocumentRecords
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class BehalfDocumentRecords {
  public static final String SERIALIZED_NAME_PAGE_DETAILS = "pageDetails";
  @SerializedName(SERIALIZED_NAME_PAGE_DETAILS)
  private PageDetails pageDetails;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private List<BehalfDocument> result;

  public BehalfDocumentRecords() {
  }

  public BehalfDocumentRecords pageDetails(PageDetails pageDetails) {
    this.pageDetails = pageDetails;
    return this;
  }

  /**
   * Get pageDetails
   * @return pageDetails
   */
  @javax.annotation.Nullable
  public PageDetails getPageDetails() {
    return pageDetails;
  }

  public void setPageDetails(PageDetails pageDetails) {
    this.pageDetails = pageDetails;
  }


  public BehalfDocumentRecords result(List<BehalfDocument> result) {
    this.result = result;
    return this;
  }

  public BehalfDocumentRecords addResultItem(BehalfDocument resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @javax.annotation.Nullable
  public List<BehalfDocument> getResult() {
    return result;
  }

  public void setResult(List<BehalfDocument> result) {
    this.result = result;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BehalfDocumentRecords behalfDocumentRecords = (BehalfDocumentRecords) o;
    return Objects.equals(this.pageDetails, behalfDocumentRecords.pageDetails) &&
        Objects.equals(this.result, behalfDocumentRecords.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageDetails, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BehalfDocumentRecords {\n");
    sb.append("    pageDetails: ").append(toIndentedString(pageDetails)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (pageDetails != null) {
        if (isFileTypeOrListOfFiles(pageDetails)) {
            fileTypeFound = true;
        }

        if (pageDetails.getClass().equals(java.io.File.class) ||
            pageDetails.getClass().equals(Integer.class) ||
            pageDetails.getClass().equals(String.class) ||
            pageDetails.getClass().isEnum()) {
            map.put("pageDetails", pageDetails);
        } else if (isListOfFile(pageDetails)) {
            for(int i = 0; i< getListSize(pageDetails); i++) {
                map.put("pageDetails", pageDetails);
            }
        }
        else {
          map.put("pageDetails", pageDetails);
        }
    }
    if (result != null) {
        if (isFileTypeOrListOfFiles(result)) {
            fileTypeFound = true;
        }

        if (result.getClass().equals(java.io.File.class) ||
            result.getClass().equals(Integer.class) ||
            result.getClass().equals(String.class) ||
            result.getClass().isEnum()) {
            map.put("result", result);
        } else if (isListOfFile(result)) {
            for(int i = 0; i< getListSize(result); i++) {
                map.put("result", result);
            }
        }
        else {
          List<String> objectList = new ArrayList<String>();
          for(Object item : result) {
            if(item instanceof URI) {
              objectList.add(item.toString());
            }
            else {
              String objectData = JSON.serialize(item);
              objectList.add(objectData);
            }
          }
          map.put("result", objectList);
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }

    if(!fileTypeFound) {
        Field[] fields = BehalfDocumentRecords.class.getDeclaredFields();
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
    openapiFields.add("pageDetails");
    openapiFields.add("result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BehalfDocumentRecords
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BehalfDocumentRecords.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BehalfDocumentRecords is not found in the empty JSON string", BehalfDocumentRecords.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `pageDetails`
      if (jsonObj.get("pageDetails") != null && !jsonObj.get("pageDetails").isJsonNull()) {
        PageDetails.validateJsonElement(jsonObj.get("pageDetails"));
      }
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        JsonArray jsonArrayresult = jsonObj.getAsJsonArray("result");
        if (jsonArrayresult != null) {
          // ensure the json data is an array
          if (!jsonObj.get("result").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `result` to be an array in the JSON string but got `%s`", jsonObj.get("result").toString()));
          }

          // validate the optional field `result` (array)
          for (int i = 0; i < jsonArrayresult.size(); i++) {
            BehalfDocument.validateJsonElement(jsonArrayresult.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BehalfDocumentRecords.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BehalfDocumentRecords' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BehalfDocumentRecords> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BehalfDocumentRecords.class));

       return (TypeAdapter<T>) new TypeAdapter<BehalfDocumentRecords>() {
           @Override
           public void write(JsonWriter out, BehalfDocumentRecords value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BehalfDocumentRecords read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BehalfDocumentRecords given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BehalfDocumentRecords
   * @throws IOException if the JSON string is invalid with respect to BehalfDocumentRecords
   */
  public static BehalfDocumentRecords fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BehalfDocumentRecords.class);
  }

  /**
   * Convert an instance of BehalfDocumentRecords to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

