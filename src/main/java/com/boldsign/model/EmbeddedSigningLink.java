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
import java.net.URI;
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
 * EmbeddedSigningLink
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class EmbeddedSigningLink {
  public static final String SERIALIZED_NAME_SIGN_LINK = "signLink";
  @SerializedName(SERIALIZED_NAME_SIGN_LINK)
  private URI signLink;

  public EmbeddedSigningLink() {
  }

  public EmbeddedSigningLink signLink(URI signLink) {
    this.signLink = signLink;
    return this;
  }

  /**
   * Get signLink
   * @return signLink
   */
  @javax.annotation.Nullable
  public URI getSignLink() {
    return signLink;
  }

  public void setSignLink(URI signLink) {
    this.signLink = signLink;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddedSigningLink embeddedSigningLink = (EmbeddedSigningLink) o;
    return Objects.equals(this.signLink, embeddedSigningLink.signLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddedSigningLink {\n");
    sb.append("    signLink: ").append(toIndentedString(signLink)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (signLink != null) {
        if (isFileTypeOrListOfFiles(signLink)) {
            fileTypeFound = true;
        }

        if (signLink.getClass().equals(java.io.File.class) ||
            signLink.getClass().equals(Integer.class) ||
            signLink.getClass().equals(String.class) ||
            signLink.getClass().equals(java.net.URI.class)||
            signLink.getClass().isEnum()) {
            map.put("signLink", signLink);
        } else if (isListOfFile(signLink)) {
            for(int i = 0; i< getListSize(signLink); i++) {
                map.put("signLink", signLink);
            }
        }
        else {
          map.put("signLink", JSON.serialize(signLink));
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
    openapiFields.add("signLink");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmbeddedSigningLink
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmbeddedSigningLink.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmbeddedSigningLink is not found in the empty JSON string", EmbeddedSigningLink.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("signLink") != null && !jsonObj.get("signLink").isJsonNull()) && !jsonObj.get("signLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signLink").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmbeddedSigningLink.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmbeddedSigningLink' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmbeddedSigningLink> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmbeddedSigningLink.class));

       return (TypeAdapter<T>) new TypeAdapter<EmbeddedSigningLink>() {
           @Override
           public void write(JsonWriter out, EmbeddedSigningLink value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmbeddedSigningLink read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmbeddedSigningLink given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmbeddedSigningLink
   * @throws IOException if the JSON string is invalid with respect to EmbeddedSigningLink
   */
  public static EmbeddedSigningLink fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmbeddedSigningLink.class);
  }

  /**
   * Convert an instance of EmbeddedSigningLink to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

