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
import com.boldsign.model.ContactCreated;
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
 * CreateContactResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class CreateContactResponse {
  public static final String SERIALIZED_NAME_CREATED_CONTACTS = "createdContacts";
  @SerializedName(SERIALIZED_NAME_CREATED_CONTACTS)
  private List<ContactCreated> createdContacts;

  public CreateContactResponse() {
  }

  public CreateContactResponse createdContacts(List<ContactCreated> createdContacts) {
    this.createdContacts = createdContacts;
    return this;
  }

  public CreateContactResponse addCreatedContactsItem(ContactCreated createdContactsItem) {
    if (this.createdContacts == null) {
      this.createdContacts = new ArrayList<>();
    }
    this.createdContacts.add(createdContactsItem);
    return this;
  }

  /**
   * Get createdContacts
   * @return createdContacts
   */
  @javax.annotation.Nullable
  public List<ContactCreated> getCreatedContacts() {
    return createdContacts;
  }

  public void setCreatedContacts(List<ContactCreated> createdContacts) {
    this.createdContacts = createdContacts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateContactResponse createContactResponse = (CreateContactResponse) o;
    return Objects.equals(this.createdContacts, createContactResponse.createdContacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdContacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContactResponse {\n");
    sb.append("    createdContacts: ").append(toIndentedString(createdContacts)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (createdContacts != null) {
        if (isFileTypeOrListOfFiles(createdContacts)) {
            fileTypeFound = true;
        }

        if (createdContacts.getClass().equals(java.io.File.class) ||
            createdContacts.getClass().equals(Integer.class) ||
            createdContacts.getClass().equals(String.class) ||
            createdContacts.getClass().equals(java.net.URI.class)||
            createdContacts.getClass().isEnum()) {
            map.put("createdContacts", createdContacts);
        } else if (isListOfFile(createdContacts)) {
            for(int i = 0; i< getListSize(createdContacts); i++) {
                map.put("createdContacts", createdContacts);
            }
        }
        else {
          List<String> objectList = new ArrayList<String>();
          for(Object item : createdContacts) {
            if(item instanceof URI || item instanceof String || item instanceof Integer) {
              objectList.add(item.toString());
            }
            else {
              String objectData = JSON.serialize(item);
              objectList.add(objectData);
            }
          }
          map.put("createdContacts", objectList);
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
    openapiFields.add("createdContacts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateContactResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateContactResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateContactResponse is not found in the empty JSON string", CreateContactResponse.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("createdContacts") != null && !jsonObj.get("createdContacts").isJsonNull()) {
        JsonArray jsonArraycreatedContacts = jsonObj.getAsJsonArray("createdContacts");
        if (jsonArraycreatedContacts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("createdContacts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `createdContacts` to be an array in the JSON string but got `%s`", jsonObj.get("createdContacts").toString()));
          }

          // validate the optional field `createdContacts` (array)
          for (int i = 0; i < jsonArraycreatedContacts.size(); i++) {
            ContactCreated.validateJsonElement(jsonArraycreatedContacts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateContactResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateContactResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateContactResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateContactResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateContactResponse>() {
           @Override
           public void write(JsonWriter out, CreateContactResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateContactResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateContactResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateContactResponse
   * @throws IOException if the JSON string is invalid with respect to CreateContactResponse
   */
  public static CreateContactResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateContactResponse.class);
  }

  /**
   * Convert an instance of CreateContactResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

