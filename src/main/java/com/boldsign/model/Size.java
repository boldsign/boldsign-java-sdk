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
 * Size
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class Size {
  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Float width = 0f;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Float height = 0f;

  public Size() {
  }

  public Size width(Float width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * minimum: 0
   * @return width
   */
  @javax.annotation.Nullable
  public Float getWidth() {
    return width;
  }

  public void setWidth(Float width) {
    this.width = width;
  }


  public Size height(Float height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * minimum: 0
   * @return height
   */
  @javax.annotation.Nullable
  public Float getHeight() {
    return height;
  }

  public void setHeight(Float height) {
    this.height = height;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Size size = (Size) o;
    return Objects.equals(this.width, size.width) &&
        Objects.equals(this.height, size.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Size {\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (width != null) {
        if (isFileTypeOrListOfFiles(width)) {
            fileTypeFound = true;
        }

        if (width.getClass().equals(java.io.File.class) ||
            width.getClass().equals(Integer.class) ||
            width.getClass().equals(String.class) ||
            width.getClass().isEnum()) {
            map.put("width", width);
        } else if (isListOfFile(width)) {
            for(int i = 0; i< getListSize(width); i++) {
                map.put("width", width);
            }
        }
        else {
          map.put("width", width);
        }
    }
    if (height != null) {
        if (isFileTypeOrListOfFiles(height)) {
            fileTypeFound = true;
        }

        if (height.getClass().equals(java.io.File.class) ||
            height.getClass().equals(Integer.class) ||
            height.getClass().equals(String.class) ||
            height.getClass().isEnum()) {
            map.put("height", height);
        } else if (isListOfFile(height)) {
            for(int i = 0; i< getListSize(height); i++) {
                map.put("height", height);
            }
        }
        else {
          map.put("height", height);
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }

    if(!fileTypeFound) {
        Field[] fields = Size.class.getDeclaredFields();
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
    openapiFields.add("width");
    openapiFields.add("height");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Size
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Size.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Size is not found in the empty JSON string", Size.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Size.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Size' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Size> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Size.class));

       return (TypeAdapter<T>) new TypeAdapter<Size>() {
           @Override
           public void write(JsonWriter out, Size value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Size read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Size given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Size
   * @throws IOException if the JSON string is invalid with respect to Size
   */
  public static Size fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Size.class);
  }

  /**
   * Convert an instance of Size to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

