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
 * Font
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class Font {
  /**
   * Gets or Sets name
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    HELVETICA("Helvetica"),
    
    COURIER("Courier"),
    
    TIMES_ROMAN("TimesRoman"),
    
    NOTO_SANS("NotoSans");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NameEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameEnum name;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Float size;

  /**
   * Gets or Sets style
   */
  @JsonAdapter(StyleEnum.Adapter.class)
  public enum StyleEnum {
    REGULAR("Regular"),
    
    BOLD("Bold"),
    
    ITALIC("Italic"),
    
    UNDERLINE("Underline");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StyleEnum fromValue(String value) {
      for (StyleEnum b : StyleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StyleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StyleEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StyleEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STYLE = "style";
  @SerializedName(SERIALIZED_NAME_STYLE)
  private StyleEnum style;

  public static final String SERIALIZED_NAME_LINE_HEIGHT = "lineHeight";
  @SerializedName(SERIALIZED_NAME_LINE_HEIGHT)
  private Integer lineHeight;

  public Font() {
  }

  public Font name(NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }


  public Font color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   */
  @javax.annotation.Nullable
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public Font size(Float size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @javax.annotation.Nullable
  public Float getSize() {
    return size;
  }

  public void setSize(Float size) {
    this.size = size;
  }


  public Font style(StyleEnum style) {
    this.style = style;
    return this;
  }

  /**
   * Get style
   * @return style
   */
  @javax.annotation.Nullable
  public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }


  public Font lineHeight(Integer lineHeight) {
    this.lineHeight = lineHeight;
    return this;
  }

  /**
   * Get lineHeight
   * @return lineHeight
   */
  @javax.annotation.Nullable
  public Integer getLineHeight() {
    return lineHeight;
  }

  public void setLineHeight(Integer lineHeight) {
    this.lineHeight = lineHeight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Font font = (Font) o;
    return Objects.equals(this.name, font.name) &&
        Objects.equals(this.color, font.color) &&
        Objects.equals(this.size, font.size) &&
        Objects.equals(this.style, font.style) &&
        Objects.equals(this.lineHeight, font.lineHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, color, size, style, lineHeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Font {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    lineHeight: ").append(toIndentedString(lineHeight)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (name != null) {
        if (isFileTypeOrListOfFiles(name)) {
            fileTypeFound = true;
        }

        if (name.getClass().equals(java.io.File.class) ||
            name.getClass().equals(Integer.class) ||
            name.getClass().equals(String.class) ||
            name.getClass().equals(java.net.URI.class)||
            name.getClass().isEnum()) {
            map.put("name", name);
        } else if (isListOfFile(name)) {
            for(int i = 0; i< getListSize(name); i++) {
                map.put("name", name);
            }
        }
        else {
          map.put("name", JSON.serialize(name));
        }
    }
    if (color != null) {
        if (isFileTypeOrListOfFiles(color)) {
            fileTypeFound = true;
        }

        if (color.getClass().equals(java.io.File.class) ||
            color.getClass().equals(Integer.class) ||
            color.getClass().equals(String.class) ||
            color.getClass().equals(java.net.URI.class)||
            color.getClass().isEnum()) {
            map.put("color", color);
        } else if (isListOfFile(color)) {
            for(int i = 0; i< getListSize(color); i++) {
                map.put("color", color);
            }
        }
        else {
          map.put("color", JSON.serialize(color));
        }
    }
    if (size != null) {
        if (isFileTypeOrListOfFiles(size)) {
            fileTypeFound = true;
        }

        if (size.getClass().equals(java.io.File.class) ||
            size.getClass().equals(Integer.class) ||
            size.getClass().equals(String.class) ||
            size.getClass().equals(java.net.URI.class)||
            size.getClass().isEnum()) {
            map.put("size", size);
        } else if (isListOfFile(size)) {
            for(int i = 0; i< getListSize(size); i++) {
                map.put("size", size);
            }
        }
        else {
          map.put("size", JSON.serialize(size));
        }
    }
    if (style != null) {
        if (isFileTypeOrListOfFiles(style)) {
            fileTypeFound = true;
        }

        if (style.getClass().equals(java.io.File.class) ||
            style.getClass().equals(Integer.class) ||
            style.getClass().equals(String.class) ||
            style.getClass().equals(java.net.URI.class)||
            style.getClass().isEnum()) {
            map.put("style", style);
        } else if (isListOfFile(style)) {
            for(int i = 0; i< getListSize(style); i++) {
                map.put("style", style);
            }
        }
        else {
          map.put("style", JSON.serialize(style));
        }
    }
    if (lineHeight != null) {
        if (isFileTypeOrListOfFiles(lineHeight)) {
            fileTypeFound = true;
        }

        if (lineHeight.getClass().equals(java.io.File.class) ||
            lineHeight.getClass().equals(Integer.class) ||
            lineHeight.getClass().equals(String.class) ||
            lineHeight.getClass().equals(java.net.URI.class)||
            lineHeight.getClass().isEnum()) {
            map.put("lineHeight", lineHeight);
        } else if (isListOfFile(lineHeight)) {
            for(int i = 0; i< getListSize(lineHeight); i++) {
                map.put("lineHeight", lineHeight);
            }
        }
        else {
          map.put("lineHeight", JSON.serialize(lineHeight));
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
    openapiFields.add("name");
    openapiFields.add("color");
    openapiFields.add("size");
    openapiFields.add("style");
    openapiFields.add("lineHeight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Font
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Font.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Font is not found in the empty JSON string", Font.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        NameEnum.validateJsonElement(jsonObj.get("name"));
      }
      if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      if ((jsonObj.get("style") != null && !jsonObj.get("style").isJsonNull()) && !jsonObj.get("style").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `style` to be a primitive type in the JSON string but got `%s`", jsonObj.get("style").toString()));
      }
      // validate the optional field `style`
      if (jsonObj.get("style") != null && !jsonObj.get("style").isJsonNull()) {
        StyleEnum.validateJsonElement(jsonObj.get("style"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Font.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Font' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Font> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Font.class));

       return (TypeAdapter<T>) new TypeAdapter<Font>() {
           @Override
           public void write(JsonWriter out, Font value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Font read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Font given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Font
   * @throws IOException if the JSON string is invalid with respect to Font
   */
  public static Font fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Font.class);
  }

  /**
   * Convert an instance of Font to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

