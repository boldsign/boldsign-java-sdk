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
import com.boldsign.model.CustomFormField;
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
 * ViewCustomFieldDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class ViewCustomFieldDetails {
  public static final String SERIALIZED_NAME_CUSTOM_FIELD_ID = "customFieldId";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD_ID)
  private String customFieldId;

  public static final String SERIALIZED_NAME_FIELD_NAME = "fieldName";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_FIELD_DESCRIPTION = "fieldDescription";
  @SerializedName(SERIALIZED_NAME_FIELD_DESCRIPTION)
  private String fieldDescription;

  public static final String SERIALIZED_NAME_FIELD_ORDER = "fieldOrder";
  @SerializedName(SERIALIZED_NAME_FIELD_ORDER)
  private Integer fieldOrder;

  public static final String SERIALIZED_NAME_BRAND_ID = "brandId";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private String brandId;

  public static final String SERIALIZED_NAME_SHARED_FIELD = "sharedField";
  @SerializedName(SERIALIZED_NAME_SHARED_FIELD)
  private Boolean sharedField;

  public static final String SERIALIZED_NAME_FORM_FIELD = "formField";
  @SerializedName(SERIALIZED_NAME_FORM_FIELD)
  private CustomFormField formField;

  public ViewCustomFieldDetails() {
  }

  public ViewCustomFieldDetails customFieldId(String customFieldId) {
    this.customFieldId = customFieldId;
    return this;
  }

  /**
   * Get customFieldId
   * @return customFieldId
   */
  @javax.annotation.Nullable
  public String getCustomFieldId() {
    return customFieldId;
  }

  public void setCustomFieldId(String customFieldId) {
    this.customFieldId = customFieldId;
  }


  public ViewCustomFieldDetails fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Get fieldName
   * @return fieldName
   */
  @javax.annotation.Nullable
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public ViewCustomFieldDetails fieldDescription(String fieldDescription) {
    this.fieldDescription = fieldDescription;
    return this;
  }

  /**
   * Get fieldDescription
   * @return fieldDescription
   */
  @javax.annotation.Nullable
  public String getFieldDescription() {
    return fieldDescription;
  }

  public void setFieldDescription(String fieldDescription) {
    this.fieldDescription = fieldDescription;
  }


  public ViewCustomFieldDetails fieldOrder(Integer fieldOrder) {
    this.fieldOrder = fieldOrder;
    return this;
  }

  /**
   * Get fieldOrder
   * @return fieldOrder
   */
  @javax.annotation.Nullable
  public Integer getFieldOrder() {
    return fieldOrder;
  }

  public void setFieldOrder(Integer fieldOrder) {
    this.fieldOrder = fieldOrder;
  }


  public ViewCustomFieldDetails brandId(String brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Get brandId
   * @return brandId
   */
  @javax.annotation.Nullable
  public String getBrandId() {
    return brandId;
  }

  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  public ViewCustomFieldDetails sharedField(Boolean sharedField) {
    this.sharedField = sharedField;
    return this;
  }

  /**
   * Get sharedField
   * @return sharedField
   */
  @javax.annotation.Nullable
  public Boolean getSharedField() {
    return sharedField;
  }

  public void setSharedField(Boolean sharedField) {
    this.sharedField = sharedField;
  }


  public ViewCustomFieldDetails formField(CustomFormField formField) {
    this.formField = formField;
    return this;
  }

  /**
   * Get formField
   * @return formField
   */
  @javax.annotation.Nullable
  public CustomFormField getFormField() {
    return formField;
  }

  public void setFormField(CustomFormField formField) {
    this.formField = formField;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewCustomFieldDetails viewCustomFieldDetails = (ViewCustomFieldDetails) o;
    return Objects.equals(this.customFieldId, viewCustomFieldDetails.customFieldId) &&
        Objects.equals(this.fieldName, viewCustomFieldDetails.fieldName) &&
        Objects.equals(this.fieldDescription, viewCustomFieldDetails.fieldDescription) &&
        Objects.equals(this.fieldOrder, viewCustomFieldDetails.fieldOrder) &&
        Objects.equals(this.brandId, viewCustomFieldDetails.brandId) &&
        Objects.equals(this.sharedField, viewCustomFieldDetails.sharedField) &&
        Objects.equals(this.formField, viewCustomFieldDetails.formField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldId, fieldName, fieldDescription, fieldOrder, brandId, sharedField, formField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewCustomFieldDetails {\n");
    sb.append("    customFieldId: ").append(toIndentedString(customFieldId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldDescription: ").append(toIndentedString(fieldDescription)).append("\n");
    sb.append("    fieldOrder: ").append(toIndentedString(fieldOrder)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    sharedField: ").append(toIndentedString(sharedField)).append("\n");
    sb.append("    formField: ").append(toIndentedString(formField)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (customFieldId != null) {
        if (isFileTypeOrListOfFiles(customFieldId)) {
            fileTypeFound = true;
        }

        if (customFieldId.getClass().equals(java.io.File.class) ||
            customFieldId.getClass().equals(Integer.class) ||
            customFieldId.getClass().equals(String.class) ||
            customFieldId.getClass().equals(java.net.URI.class)||
            customFieldId.getClass().isEnum()) {
            map.put("customFieldId", customFieldId);
        } else if (isListOfFile(customFieldId)) {
            for(int i = 0; i< getListSize(customFieldId); i++) {
                map.put("customFieldId", customFieldId);
            }
        }
        else {
          map.put("customFieldId", JSON.serialize(customFieldId));
        }
    }
    if (fieldName != null) {
        if (isFileTypeOrListOfFiles(fieldName)) {
            fileTypeFound = true;
        }

        if (fieldName.getClass().equals(java.io.File.class) ||
            fieldName.getClass().equals(Integer.class) ||
            fieldName.getClass().equals(String.class) ||
            fieldName.getClass().equals(java.net.URI.class)||
            fieldName.getClass().isEnum()) {
            map.put("fieldName", fieldName);
        } else if (isListOfFile(fieldName)) {
            for(int i = 0; i< getListSize(fieldName); i++) {
                map.put("fieldName", fieldName);
            }
        }
        else {
          map.put("fieldName", JSON.serialize(fieldName));
        }
    }
    if (fieldDescription != null) {
        if (isFileTypeOrListOfFiles(fieldDescription)) {
            fileTypeFound = true;
        }

        if (fieldDescription.getClass().equals(java.io.File.class) ||
            fieldDescription.getClass().equals(Integer.class) ||
            fieldDescription.getClass().equals(String.class) ||
            fieldDescription.getClass().equals(java.net.URI.class)||
            fieldDescription.getClass().isEnum()) {
            map.put("fieldDescription", fieldDescription);
        } else if (isListOfFile(fieldDescription)) {
            for(int i = 0; i< getListSize(fieldDescription); i++) {
                map.put("fieldDescription", fieldDescription);
            }
        }
        else {
          map.put("fieldDescription", JSON.serialize(fieldDescription));
        }
    }
    if (fieldOrder != null) {
        if (isFileTypeOrListOfFiles(fieldOrder)) {
            fileTypeFound = true;
        }

        if (fieldOrder.getClass().equals(java.io.File.class) ||
            fieldOrder.getClass().equals(Integer.class) ||
            fieldOrder.getClass().equals(String.class) ||
            fieldOrder.getClass().equals(java.net.URI.class)||
            fieldOrder.getClass().isEnum()) {
            map.put("fieldOrder", fieldOrder);
        } else if (isListOfFile(fieldOrder)) {
            for(int i = 0; i< getListSize(fieldOrder); i++) {
                map.put("fieldOrder", fieldOrder);
            }
        }
        else {
          map.put("fieldOrder", JSON.serialize(fieldOrder));
        }
    }
    if (brandId != null) {
        if (isFileTypeOrListOfFiles(brandId)) {
            fileTypeFound = true;
        }

        if (brandId.getClass().equals(java.io.File.class) ||
            brandId.getClass().equals(Integer.class) ||
            brandId.getClass().equals(String.class) ||
            brandId.getClass().equals(java.net.URI.class)||
            brandId.getClass().isEnum()) {
            map.put("brandId", brandId);
        } else if (isListOfFile(brandId)) {
            for(int i = 0; i< getListSize(brandId); i++) {
                map.put("brandId", brandId);
            }
        }
        else {
          map.put("brandId", JSON.serialize(brandId));
        }
    }
    if (sharedField != null) {
        if (isFileTypeOrListOfFiles(sharedField)) {
            fileTypeFound = true;
        }

        if (sharedField.getClass().equals(java.io.File.class) ||
            sharedField.getClass().equals(Integer.class) ||
            sharedField.getClass().equals(String.class) ||
            sharedField.getClass().equals(java.net.URI.class)||
            sharedField.getClass().isEnum()) {
            map.put("sharedField", sharedField);
        } else if (isListOfFile(sharedField)) {
            for(int i = 0; i< getListSize(sharedField); i++) {
                map.put("sharedField", sharedField);
            }
        }
        else {
          map.put("sharedField", JSON.serialize(sharedField));
        }
    }
    if (formField != null) {
        if (isFileTypeOrListOfFiles(formField)) {
            fileTypeFound = true;
        }

        if (formField.getClass().equals(java.io.File.class) ||
            formField.getClass().equals(Integer.class) ||
            formField.getClass().equals(String.class) ||
            formField.getClass().equals(java.net.URI.class)||
            formField.getClass().isEnum()) {
            map.put("formField", formField);
        } else if (isListOfFile(formField)) {
            for(int i = 0; i< getListSize(formField); i++) {
                map.put("formField", formField);
            }
        }
        else {
          map.put("formField", JSON.serialize(formField));
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
    openapiFields.add("customFieldId");
    openapiFields.add("fieldName");
    openapiFields.add("fieldDescription");
    openapiFields.add("fieldOrder");
    openapiFields.add("brandId");
    openapiFields.add("sharedField");
    openapiFields.add("formField");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ViewCustomFieldDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ViewCustomFieldDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ViewCustomFieldDetails is not found in the empty JSON string", ViewCustomFieldDetails.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customFieldId") != null && !jsonObj.get("customFieldId").isJsonNull()) && !jsonObj.get("customFieldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customFieldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customFieldId").toString()));
      }
      if ((jsonObj.get("fieldName") != null && !jsonObj.get("fieldName").isJsonNull()) && !jsonObj.get("fieldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldName").toString()));
      }
      if ((jsonObj.get("fieldDescription") != null && !jsonObj.get("fieldDescription").isJsonNull()) && !jsonObj.get("fieldDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldDescription").toString()));
      }
      if ((jsonObj.get("brandId") != null && !jsonObj.get("brandId").isJsonNull()) && !jsonObj.get("brandId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandId").toString()));
      }
      // validate the optional field `formField`
      if (jsonObj.get("formField") != null && !jsonObj.get("formField").isJsonNull()) {
        CustomFormField.validateJsonElement(jsonObj.get("formField"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ViewCustomFieldDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ViewCustomFieldDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ViewCustomFieldDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ViewCustomFieldDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ViewCustomFieldDetails>() {
           @Override
           public void write(JsonWriter out, ViewCustomFieldDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ViewCustomFieldDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ViewCustomFieldDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ViewCustomFieldDetails
   * @throws IOException if the JSON string is invalid with respect to ViewCustomFieldDetails
   */
  public static ViewCustomFieldDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ViewCustomFieldDetails.class);
  }

  /**
   * Convert an instance of ViewCustomFieldDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

