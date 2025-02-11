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
import java.util.HashMap;
import java.util.Map;

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
 * CreateUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class CreateUser {
  public static final String SERIALIZED_NAME_EMAIL_ID = "emailId";
  @SerializedName(SERIALIZED_NAME_EMAIL_ID)
  private String emailId;

  public static final String SERIALIZED_NAME_TEAM_ID = "teamId";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  private String teamId;

  /**
   * Gets or Sets userRole
   */
  @JsonAdapter(UserRoleEnum.Adapter.class)
  public enum UserRoleEnum {
    ADMIN("Admin"),
    
    TEAM_ADMIN("TeamAdmin"),
    
    MEMBER("Member");

    private String value;

    UserRoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UserRoleEnum fromValue(String value) {
      for (UserRoleEnum b : UserRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UserRoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UserRoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UserRoleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UserRoleEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      UserRoleEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_USER_ROLE = "userRole";
  @SerializedName(SERIALIZED_NAME_USER_ROLE)
  private UserRoleEnum userRole;

  public static final String SERIALIZED_NAME_META_DATA = "metaData";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private Map<String, String> metaData;

  public CreateUser() {
  }

  public CreateUser emailId(String emailId) {
    this.emailId = emailId;
    return this;
  }

  /**
   * Get emailId
   * @return emailId
   */
  @javax.annotation.Nonnull
  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }


  public CreateUser teamId(String teamId) {
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


  public CreateUser userRole(UserRoleEnum userRole) {
    this.userRole = userRole;
    return this;
  }

  /**
   * Get userRole
   * @return userRole
   */
  @javax.annotation.Nullable
  public UserRoleEnum getUserRole() {
    return userRole;
  }

  public void setUserRole(UserRoleEnum userRole) {
    this.userRole = userRole;
  }


  public CreateUser metaData(Map<String, String> metaData) {
    this.metaData = metaData;
    return this;
  }

  public CreateUser putMetaDataItem(String key, String metaDataItem) {
    if (this.metaData == null) {
      this.metaData = new HashMap<>();
    }
    this.metaData.put(key, metaDataItem);
    return this;
  }

  /**
   * Get metaData
   * @return metaData
   */
  @javax.annotation.Nullable
  public Map<String, String> getMetaData() {
    return metaData;
  }

  public void setMetaData(Map<String, String> metaData) {
    this.metaData = metaData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUser createUser = (CreateUser) o;
    return Objects.equals(this.emailId, createUser.emailId) &&
        Objects.equals(this.teamId, createUser.teamId) &&
        Objects.equals(this.userRole, createUser.userRole) &&
        Objects.equals(this.metaData, createUser.metaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailId, teamId, userRole, metaData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUser {\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    userRole: ").append(toIndentedString(userRole)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (emailId != null) {
        if (isFileTypeOrListOfFiles(emailId)) {
            fileTypeFound = true;
        }

        if (emailId.getClass().equals(java.io.File.class) ||
            emailId.getClass().equals(Integer.class) ||
            emailId.getClass().equals(String.class) ||
            emailId.getClass().isEnum()) {
            map.put("emailId", emailId);
        } else if (isListOfFile(emailId)) {
            for(int i = 0; i< getListSize(emailId); i++) {
                map.put("emailId", emailId);
            }
        }
        else {
          map.put("emailId", emailId);
        }
    }
    if (teamId != null) {
        if (isFileTypeOrListOfFiles(teamId)) {
            fileTypeFound = true;
        }

        if (teamId.getClass().equals(java.io.File.class) ||
            teamId.getClass().equals(Integer.class) ||
            teamId.getClass().equals(String.class) ||
            teamId.getClass().isEnum()) {
            map.put("teamId", teamId);
        } else if (isListOfFile(teamId)) {
            for(int i = 0; i< getListSize(teamId); i++) {
                map.put("teamId", teamId);
            }
        }
        else {
          map.put("teamId", teamId);
        }
    }
    if (userRole != null) {
        if (isFileTypeOrListOfFiles(userRole)) {
            fileTypeFound = true;
        }

        if (userRole.getClass().equals(java.io.File.class) ||
            userRole.getClass().equals(Integer.class) ||
            userRole.getClass().equals(String.class) ||
            userRole.getClass().isEnum()) {
            map.put("userRole", userRole);
        } else if (isListOfFile(userRole)) {
            for(int i = 0; i< getListSize(userRole); i++) {
                map.put("userRole", userRole);
            }
        }
        else {
          map.put("userRole", userRole);
        }
    }
    if (metaData != null) {
        if (isFileTypeOrListOfFiles(metaData)) {
            fileTypeFound = true;
        }

        if (metaData.getClass().equals(java.io.File.class) ||
            metaData.getClass().equals(Integer.class) ||
            metaData.getClass().equals(String.class) ||
            metaData.getClass().isEnum()) {
            map.put("metaData", metaData);
        } else if (isListOfFile(metaData)) {
            for(int i = 0; i< getListSize(metaData); i++) {
                map.put("metaData", metaData);
            }
        }
        else {
          map.put("metaData", metaData);
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }

    if(!fileTypeFound) {
        Field[] fields = CreateUser.class.getDeclaredFields();
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
    openapiFields.add("emailId");
    openapiFields.add("teamId");
    openapiFields.add("userRole");
    openapiFields.add("metaData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("emailId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateUser
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateUser is not found in the empty JSON string", CreateUser.openapiRequiredFields.toString()));
        }
      }
	  //Ignored additional properties from response json. 

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateUser.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("emailId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailId").toString()));
      }
      if ((jsonObj.get("teamId") != null && !jsonObj.get("teamId").isJsonNull()) && !jsonObj.get("teamId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `teamId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("teamId").toString()));
      }
      if ((jsonObj.get("userRole") != null && !jsonObj.get("userRole").isJsonNull()) && !jsonObj.get("userRole").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userRole` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userRole").toString()));
      }
      // validate the optional field `userRole`
      if (jsonObj.get("userRole") != null && !jsonObj.get("userRole").isJsonNull()) {
        UserRoleEnum.validateJsonElement(jsonObj.get("userRole"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateUser.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateUser>() {
           @Override
           public void write(JsonWriter out, CreateUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateUser given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateUser
   * @throws IOException if the JSON string is invalid with respect to CreateUser
   */
  public static CreateUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateUser.class);
  }

  /**
   * Convert an instance of CreateUser to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

