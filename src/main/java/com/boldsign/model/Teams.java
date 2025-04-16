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
 * Teams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class Teams {
  public static final String SERIALIZED_NAME_TEAM_NAME = "teamName";
  @SerializedName(SERIALIZED_NAME_TEAM_NAME)
  private String teamName;

  public static final String SERIALIZED_NAME_TEAM_ID = "teamId";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  private String teamId;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private Long createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private Long modifiedDate;

  public Teams() {
  }

  public Teams teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  /**
   * Get teamName
   * @return teamName
   */
  @javax.annotation.Nullable
  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }


  public Teams teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
   */
  @javax.annotation.Nullable
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }


  public Teams createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   */
  @javax.annotation.Nullable
  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }


  public Teams modifiedDate(Long modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Get modifiedDate
   * @return modifiedDate
   */
  @javax.annotation.Nullable
  public Long getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(Long modifiedDate) {
    this.modifiedDate = modifiedDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Teams teams = (Teams) o;
    return Objects.equals(this.teamName, teams.teamName) &&
        Objects.equals(this.teamId, teams.teamId) &&
        Objects.equals(this.createdDate, teams.createdDate) &&
        Objects.equals(this.modifiedDate, teams.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamName, teamId, createdDate, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Teams {\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (teamName != null) {
        if (isFileTypeOrListOfFiles(teamName)) {
            fileTypeFound = true;
        }

        if (teamName.getClass().equals(java.io.File.class) ||
            teamName.getClass().equals(Integer.class) ||
            teamName.getClass().equals(String.class) ||
            teamName.getClass().equals(java.net.URI.class)||
            teamName.getClass().isEnum()) {
            map.put("teamName", teamName);
        } else if (isListOfFile(teamName)) {
            for(int i = 0; i< getListSize(teamName); i++) {
                map.put("teamName", teamName);
            }
        }
        else {
          map.put("teamName", JSON.serialize(teamName));
        }
    }
    if (teamId != null) {
        if (isFileTypeOrListOfFiles(teamId)) {
            fileTypeFound = true;
        }

        if (teamId.getClass().equals(java.io.File.class) ||
            teamId.getClass().equals(Integer.class) ||
            teamId.getClass().equals(String.class) ||
            teamId.getClass().equals(java.net.URI.class)||
            teamId.getClass().isEnum()) {
            map.put("teamId", teamId);
        } else if (isListOfFile(teamId)) {
            for(int i = 0; i< getListSize(teamId); i++) {
                map.put("teamId", teamId);
            }
        }
        else {
          map.put("teamId", JSON.serialize(teamId));
        }
    }
    if (createdDate != null) {
        if (isFileTypeOrListOfFiles(createdDate)) {
            fileTypeFound = true;
        }

        if (createdDate.getClass().equals(java.io.File.class) ||
            createdDate.getClass().equals(Integer.class) ||
            createdDate.getClass().equals(String.class) ||
            createdDate.getClass().equals(java.net.URI.class)||
            createdDate.getClass().isEnum()) {
            map.put("createdDate", createdDate);
        } else if (isListOfFile(createdDate)) {
            for(int i = 0; i< getListSize(createdDate); i++) {
                map.put("createdDate", createdDate);
            }
        }
        else {
          map.put("createdDate", JSON.serialize(createdDate));
        }
    }
    if (modifiedDate != null) {
        if (isFileTypeOrListOfFiles(modifiedDate)) {
            fileTypeFound = true;
        }

        if (modifiedDate.getClass().equals(java.io.File.class) ||
            modifiedDate.getClass().equals(Integer.class) ||
            modifiedDate.getClass().equals(String.class) ||
            modifiedDate.getClass().equals(java.net.URI.class)||
            modifiedDate.getClass().isEnum()) {
            map.put("modifiedDate", modifiedDate);
        } else if (isListOfFile(modifiedDate)) {
            for(int i = 0; i< getListSize(modifiedDate); i++) {
                map.put("modifiedDate", modifiedDate);
            }
        }
        else {
          map.put("modifiedDate", JSON.serialize(modifiedDate));
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
    openapiFields.add("teamName");
    openapiFields.add("teamId");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Teams
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Teams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Teams is not found in the empty JSON string", Teams.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("teamName") != null && !jsonObj.get("teamName").isJsonNull()) && !jsonObj.get("teamName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `teamName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("teamName").toString()));
      }
      if ((jsonObj.get("teamId") != null && !jsonObj.get("teamId").isJsonNull()) && !jsonObj.get("teamId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `teamId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("teamId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Teams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Teams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Teams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Teams.class));

       return (TypeAdapter<T>) new TypeAdapter<Teams>() {
           @Override
           public void write(JsonWriter out, Teams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Teams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Teams given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Teams
   * @throws IOException if the JSON string is invalid with respect to Teams
   */
  public static Teams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Teams.class);
  }

  /**
   * Convert an instance of Teams to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

