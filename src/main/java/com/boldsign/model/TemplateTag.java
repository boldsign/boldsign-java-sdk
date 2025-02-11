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
 * TemplateTag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class TemplateTag {
  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_DOCUMENT_LABELS = "documentLabels";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_LABELS)
  private List<String> documentLabels;

  public static final String SERIALIZED_NAME_TEMPLATE_LABELS = "templateLabels";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_LABELS)
  private List<String> templateLabels;

  public static final String SERIALIZED_NAME_ON_BEHALF_OF = "onBehalfOf";
  @SerializedName(SERIALIZED_NAME_ON_BEHALF_OF)
  private String onBehalfOf;

  public TemplateTag() {
  }

  public TemplateTag templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * Get templateId
   * @return templateId
   */
  @javax.annotation.Nonnull
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public TemplateTag documentLabels(List<String> documentLabels) {
    this.documentLabels = documentLabels;
    return this;
  }

  public TemplateTag addDocumentLabelsItem(String documentLabelsItem) {
    if (this.documentLabels == null) {
      this.documentLabels = new ArrayList<>();
    }
    this.documentLabels.add(documentLabelsItem);
    return this;
  }

  /**
   * Get documentLabels
   * @return documentLabels
   */
  @javax.annotation.Nullable
  public List<String> getDocumentLabels() {
    return documentLabels;
  }

  public void setDocumentLabels(List<String> documentLabels) {
    this.documentLabels = documentLabels;
  }


  public TemplateTag templateLabels(List<String> templateLabels) {
    this.templateLabels = templateLabels;
    return this;
  }

  public TemplateTag addTemplateLabelsItem(String templateLabelsItem) {
    if (this.templateLabels == null) {
      this.templateLabels = new ArrayList<>();
    }
    this.templateLabels.add(templateLabelsItem);
    return this;
  }

  /**
   * Get templateLabels
   * @return templateLabels
   */
  @javax.annotation.Nullable
  public List<String> getTemplateLabels() {
    return templateLabels;
  }

  public void setTemplateLabels(List<String> templateLabels) {
    this.templateLabels = templateLabels;
  }


  public TemplateTag onBehalfOf(String onBehalfOf) {
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
    TemplateTag templateTag = (TemplateTag) o;
    return Objects.equals(this.templateId, templateTag.templateId) &&
        Objects.equals(this.documentLabels, templateTag.documentLabels) &&
        Objects.equals(this.templateLabels, templateTag.templateLabels) &&
        Objects.equals(this.onBehalfOf, templateTag.onBehalfOf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, documentLabels, templateLabels, onBehalfOf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateTag {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    documentLabels: ").append(toIndentedString(documentLabels)).append("\n");
    sb.append("    templateLabels: ").append(toIndentedString(templateLabels)).append("\n");
    sb.append("    onBehalfOf: ").append(toIndentedString(onBehalfOf)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (templateId != null) {
        if (isFileTypeOrListOfFiles(templateId)) {
            fileTypeFound = true;
        }

        if (templateId.getClass().equals(java.io.File.class) ||
            templateId.getClass().equals(Integer.class) ||
            templateId.getClass().equals(String.class) ||
            templateId.getClass().isEnum()) {
            map.put("templateId", templateId);
        } else if (isListOfFile(templateId)) {
            for(int i = 0; i< getListSize(templateId); i++) {
                map.put("templateId", templateId);
            }
        }
        else {
          map.put("templateId", templateId);
        }
    }
    if (documentLabels != null) {
        if (isFileTypeOrListOfFiles(documentLabels)) {
            fileTypeFound = true;
        }

        if (documentLabels.getClass().equals(java.io.File.class) ||
            documentLabels.getClass().equals(Integer.class) ||
            documentLabels.getClass().equals(String.class) ||
            documentLabels.getClass().isEnum()) {
            map.put("documentLabels", documentLabels);
        } else if (isListOfFile(documentLabels)) {
            for(int i = 0; i< getListSize(documentLabels); i++) {
                map.put("documentLabels", documentLabels);
            }
        }
        else {
          List<String> objectList = new ArrayList<String>();
          for(Object item : documentLabels) {
            if(item instanceof URI) {
              objectList.add(item.toString());
            }
            else {
              String objectData = JSON.serialize(item);
              objectList.add(objectData);
            }
          }
          map.put("documentLabels", objectList);
        }
    }
    if (templateLabels != null) {
        if (isFileTypeOrListOfFiles(templateLabels)) {
            fileTypeFound = true;
        }

        if (templateLabels.getClass().equals(java.io.File.class) ||
            templateLabels.getClass().equals(Integer.class) ||
            templateLabels.getClass().equals(String.class) ||
            templateLabels.getClass().isEnum()) {
            map.put("templateLabels", templateLabels);
        } else if (isListOfFile(templateLabels)) {
            for(int i = 0; i< getListSize(templateLabels); i++) {
                map.put("templateLabels", templateLabels);
            }
        }
        else {
          List<String> objectList = new ArrayList<String>();
          for(Object item : templateLabels) {
            if(item instanceof URI) {
              objectList.add(item.toString());
            }
            else {
              String objectData = JSON.serialize(item);
              objectList.add(objectData);
            }
          }
          map.put("templateLabels", objectList);
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

    if(!fileTypeFound) {
        Field[] fields = TemplateTag.class.getDeclaredFields();
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
    openapiFields.add("templateId");
    openapiFields.add("documentLabels");
    openapiFields.add("templateLabels");
    openapiFields.add("onBehalfOf");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("templateId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TemplateTag
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TemplateTag.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateTag is not found in the empty JSON string", TemplateTag.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TemplateTag.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("templateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("documentLabels") != null && !jsonObj.get("documentLabels").isJsonNull() && !jsonObj.get("documentLabels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentLabels` to be an array in the JSON string but got `%s`", jsonObj.get("documentLabels").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("templateLabels") != null && !jsonObj.get("templateLabels").isJsonNull() && !jsonObj.get("templateLabels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateLabels` to be an array in the JSON string but got `%s`", jsonObj.get("templateLabels").toString()));
      }
      if ((jsonObj.get("onBehalfOf") != null && !jsonObj.get("onBehalfOf").isJsonNull()) && !jsonObj.get("onBehalfOf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onBehalfOf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onBehalfOf").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateTag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateTag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateTag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateTag.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateTag>() {
           @Override
           public void write(JsonWriter out, TemplateTag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateTag read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TemplateTag given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TemplateTag
   * @throws IOException if the JSON string is invalid with respect to TemplateTag
   */
  public static TemplateTag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateTag.class);
  }

  /**
   * Convert an instance of TemplateTag to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

