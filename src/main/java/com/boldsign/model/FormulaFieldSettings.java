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
 * FormulaFieldSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class FormulaFieldSettings {
  public static final String SERIALIZED_NAME_FORMULA_EXPRESSION = "formulaExpression";
  @SerializedName(SERIALIZED_NAME_FORMULA_EXPRESSION)
  private String formulaExpression;

  public static final String SERIALIZED_NAME_DECIMAL_PRECISION = "decimalPrecision";
  @SerializedName(SERIALIZED_NAME_DECIMAL_PRECISION)
  private Integer decimalPrecision = 0;

  public FormulaFieldSettings() {
  }

  public FormulaFieldSettings formulaExpression(String formulaExpression) {
    this.formulaExpression = formulaExpression;
    return this;
  }

  /**
   * Get formulaExpression
   * @return formulaExpression
   */
  @javax.annotation.Nullable
  public String getFormulaExpression() {
    return formulaExpression;
  }

  public void setFormulaExpression(String formulaExpression) {
    this.formulaExpression = formulaExpression;
  }


  public FormulaFieldSettings decimalPrecision(Integer decimalPrecision) {
    this.decimalPrecision = decimalPrecision;
    return this;
  }

  /**
   * Get decimalPrecision
   * @return decimalPrecision
   */
  @javax.annotation.Nullable
  public Integer getDecimalPrecision() {
    return decimalPrecision;
  }

  public void setDecimalPrecision(Integer decimalPrecision) {
    this.decimalPrecision = decimalPrecision;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaFieldSettings formulaFieldSettings = (FormulaFieldSettings) o;
    return Objects.equals(this.formulaExpression, formulaFieldSettings.formulaExpression) &&
        Objects.equals(this.decimalPrecision, formulaFieldSettings.decimalPrecision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formulaExpression, decimalPrecision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaFieldSettings {\n");
    sb.append("    formulaExpression: ").append(toIndentedString(formulaExpression)).append("\n");
    sb.append("    decimalPrecision: ").append(toIndentedString(decimalPrecision)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (formulaExpression != null) {
        if (isFileTypeOrListOfFiles(formulaExpression)) {
            fileTypeFound = true;
        }

        if (formulaExpression.getClass().equals(java.io.File.class) ||
            formulaExpression.getClass().equals(Integer.class) ||
            formulaExpression.getClass().equals(String.class) ||
            formulaExpression.getClass().isEnum()) {
            map.put("formulaExpression", formulaExpression);
        } else if (isListOfFile(formulaExpression)) {
            for(int i = 0; i< getListSize(formulaExpression); i++) {
                map.put("formulaExpression", formulaExpression);
            }
        }
        else {
          map.put("formulaExpression", formulaExpression);
        }
    }
    if (decimalPrecision != null) {
        if (isFileTypeOrListOfFiles(decimalPrecision)) {
            fileTypeFound = true;
        }

        if (decimalPrecision.getClass().equals(java.io.File.class) ||
            decimalPrecision.getClass().equals(Integer.class) ||
            decimalPrecision.getClass().equals(String.class) ||
            decimalPrecision.getClass().isEnum()) {
            map.put("decimalPrecision", decimalPrecision);
        } else if (isListOfFile(decimalPrecision)) {
            for(int i = 0; i< getListSize(decimalPrecision); i++) {
                map.put("decimalPrecision", decimalPrecision);
            }
        }
        else {
          map.put("decimalPrecision", decimalPrecision);
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
    openapiFields.add("formulaExpression");
    openapiFields.add("decimalPrecision");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FormulaFieldSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FormulaFieldSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FormulaFieldSettings is not found in the empty JSON string", FormulaFieldSettings.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("formulaExpression") != null && !jsonObj.get("formulaExpression").isJsonNull()) && !jsonObj.get("formulaExpression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formulaExpression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formulaExpression").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FormulaFieldSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FormulaFieldSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FormulaFieldSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FormulaFieldSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<FormulaFieldSettings>() {
           @Override
           public void write(JsonWriter out, FormulaFieldSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FormulaFieldSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FormulaFieldSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FormulaFieldSettings
   * @throws IOException if the JSON string is invalid with respect to FormulaFieldSettings
   */
  public static FormulaFieldSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FormulaFieldSettings.class);
  }

  /**
   * Convert an instance of FormulaFieldSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

