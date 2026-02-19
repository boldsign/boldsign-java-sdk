# boldsign-java

Easily integrate BoldSign's e-signature features into your Java applications. This package simplifies sending documents for signature, embedding signing ceremonies, tracking document status, downloading signed documents, and managing e-signature workflows.

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.boldsign</groupId>
  <artifactId>boldsign-java</artifactId>
  <version>5.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'boldsign-java' jar has been published to maven central.
    mavenLocal()       // Needed if the 'boldsign-java' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.boldsign:boldsign-java:5.1.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/boldsign-java-5.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.boldsign.ApiClient;
import com.boldsign.ApiException;
import com.boldsign.Configuration;
import com.boldsign.api.DocumentApi;
import com.boldsign.model.*;
import com.boldsign.model.FormField.FieldTypeEnum;

public class Example 
{
    public static void main(String[] args) throws ApiException 
    {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        apiClient.setApiKey("YOUR_API_KEY");
        DocumentApi documentApi = new DocumentApi(apiClient);

        List<File> files = new ArrayList<File>();
        File file = new File("examples/documents/agreement.pdf");
        files.add(file);

        List<FormField> formFields = new ArrayList<FormField>();

        FormField signatureField = new FormField();
        signatureField.setFieldType(FieldTypeEnum.SIGNATURE);
        signatureField.setPageNumber(1);
        Rectangle rectangle = new Rectangle().x(100f).y(100f).width(100f).height(50f);
        signatureField.setBounds(rectangle);
        formFields.add(signatureField);

        List<DocumentSigner> signers = new ArrayList<DocumentSigner>();

        DocumentSigner signer = new DocumentSigner();
        signer.setName("Signer");
        signer.setEmailAddress("hankwhite@cubeflakes.com");
        signer.setFormFields(formFields);
        signers.add(signer);

        SendForSign sendForSign = new SendForSign();
        sendForSign.setTitle("Agreement");
        sendForSign.setFiles(files);
        sendForSign.setSigners(signers);

        DocumentCreated document = documentApi.sendDocument(sendForSign);
        System.out.println(document.getDocumentId());
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.boldsign.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BrandingApi* | [**brandList**](docs/BrandingApi.md#brandList) | **GET** /v1/brand/list | List all the brands.
*BrandingApi* | [**createBrand**](docs/BrandingApi.md#createBrand) | **POST** /v1/brand/create | Create the brand.
*BrandingApi* | [**deleteBrand**](docs/BrandingApi.md#deleteBrand) | **DELETE** /v1/brand/delete | Delete the brand.
*BrandingApi* | [**editBrand**](docs/BrandingApi.md#editBrand) | **POST** /v1/brand/edit | Edit the brand.
*BrandingApi* | [**getBrand**](docs/BrandingApi.md#getBrand) | **GET** /v1/brand/get | Get the specific brand details.
*BrandingApi* | [**resetDefaultBrand**](docs/BrandingApi.md#resetDefaultBrand) | **POST** /v1/brand/resetdefault | Reset default brand.
*ContactsApi* | [**contactUserList**](docs/ContactsApi.md#contactUserList) | **GET** /v1/contacts/list | List Contact document.
*ContactsApi* | [**createContact**](docs/ContactsApi.md#createContact) | **POST** /v1/contacts/create | Create the new Contact.
*ContactsApi* | [**deleteContacts**](docs/ContactsApi.md#deleteContacts) | **DELETE** /v1/contacts/delete | Deletes a contact.
*ContactsApi* | [**getContact**](docs/ContactsApi.md#getContact) | **GET** /v1/contacts/get | Get summary of the contact.
*ContactsApi* | [**updateContact**](docs/ContactsApi.md#updateContact) | **PUT** /v1/contacts/update | Update the contact.
*CustomFieldApi* | [**createCustomField**](docs/CustomFieldApi.md#createCustomField) | **POST** /v1/customField/create | Create the custom field.
*CustomFieldApi* | [**customFieldsList**](docs/CustomFieldApi.md#customFieldsList) | **GET** /v1/customField/list | List the custom fields respective to the brand id.
*CustomFieldApi* | [**deleteCustomField**](docs/CustomFieldApi.md#deleteCustomField) | **DELETE** /v1/customField/delete | Delete the custom field.
*CustomFieldApi* | [**editCustomField**](docs/CustomFieldApi.md#editCustomField) | **POST** /v1/customField/edit | Edit the custom field.
*CustomFieldApi* | [**embedCustomField**](docs/CustomFieldApi.md#embedCustomField) | **POST** /v1/customField/createEmbeddedCustomFieldUrl | Generates a URL for creating or modifying custom fields within your application&#39;s embedded Designer.
*DocumentApi* | [**addAuthentication**](docs/DocumentApi.md#addAuthentication) | **PATCH** /v1/document/addAuthentication | The add authentication to recipient.
*DocumentApi* | [**addTag**](docs/DocumentApi.md#addTag) | **PATCH** /v1/document/addTags | Add the Tags in Documents.
*DocumentApi* | [**behalfDocuments**](docs/DocumentApi.md#behalfDocuments) | **GET** /v1/document/behalfList | Gets the behalf documents.
*DocumentApi* | [**changeAccessCode**](docs/DocumentApi.md#changeAccessCode) | **PATCH** /v1/document/changeAccessCode | Changes the access code for the given document signer.
*DocumentApi* | [**changeRecipient**](docs/DocumentApi.md#changeRecipient) | **PATCH** /v1/document/changeRecipient | Change recipient details of a document.
*DocumentApi* | [**createEmbeddedRequestUrlDocument**](docs/DocumentApi.md#createEmbeddedRequestUrlDocument) | **POST** /v1/document/createEmbeddedRequestUrl | Generates a send URL which embeds document sending process into your application.
*DocumentApi* | [**deleteDocument**](docs/DocumentApi.md#deleteDocument) | **DELETE** /v1/document/delete | Delete the document.
*DocumentApi* | [**deleteTag**](docs/DocumentApi.md#deleteTag) | **DELETE** /v1/document/deleteTags | Delete the Tags in Documents.
*DocumentApi* | [**downloadAttachment**](docs/DocumentApi.md#downloadAttachment) | **GET** /v1/document/downloadAttachment | Download the Attachment.
*DocumentApi* | [**downloadAuditLog**](docs/DocumentApi.md#downloadAuditLog) | **GET** /v1/document/downloadAuditLog | Download the audit trail document.
*DocumentApi* | [**downloadDocument**](docs/DocumentApi.md#downloadDocument) | **GET** /v1/document/download | Download the document.
*DocumentApi* | [**draftSend**](docs/DocumentApi.md#draftSend) | **POST** /v1/document/draftSend | Sends a draft-status document out for signature.
*DocumentApi* | [**editDocument**](docs/DocumentApi.md#editDocument) | **PUT** /v1/document/edit | Edit and updates an existing document.
*DocumentApi* | [**extendExpiry**](docs/DocumentApi.md#extendExpiry) | **PATCH** /v1/document/extendExpiry | Extends the expiration date of the document.
*DocumentApi* | [**getProperties**](docs/DocumentApi.md#getProperties) | **GET** /v1/document/properties | Get summary of the document.
*DocumentApi* | [**getEmbeddedSignLink**](docs/DocumentApi.md#getEmbeddedSignLink) | **GET** /v1/document/getEmbeddedSignLink | Get sign link for Embedded Sign.
*DocumentApi* | [**listDocuments**](docs/DocumentApi.md#listDocuments) | **GET** /v1/document/list | List user documents.
*DocumentApi* | [**prefillFields**](docs/DocumentApi.md#prefillFields) | **PATCH** /v1/document/prefillFields | Updates the value (prefill) of the fields in the document.
*DocumentApi* | [**remindDocument**](docs/DocumentApi.md#remindDocument) | **POST** /v1/document/remind | Send reminder to pending signers.
*DocumentApi* | [**removeAuthentication**](docs/DocumentApi.md#removeAuthentication) | **PATCH** /v1/document/RemoveAuthentication | Remove the access code for the given document signer.
*DocumentApi* | [**revokeDocument**](docs/DocumentApi.md#revokeDocument) | **POST** /v1/document/revoke | Revoke the document.
*DocumentApi* | [**sendDocument**](docs/DocumentApi.md#sendDocument) | **POST** /v1/document/send | Sends the document for sign.
*DocumentApi* | [**teamDocuments**](docs/DocumentApi.md#teamDocuments) | **GET** /v1/document/teamlist | Get user Team documents.
*IdentityVerificationApi* | [**createEmbeddedVerificationUrl**](docs/IdentityVerificationApi.md#createEmbeddedVerificationUrl) | **POST** /v1/identityVerification/createEmbeddedVerificationUrl | Generate a URL that embeds manual ID verification for the specified document signer into your application.
*IdentityVerificationApi* | [**image**](docs/IdentityVerificationApi.md#image) | **POST** /v1/identityVerification/image | Retrieve the uploaded ID verification document or selfie image for the specified document signer using the file ID.
*IdentityVerificationApi* | [**report**](docs/IdentityVerificationApi.md#report) | **POST** /v1/identityVerification/report | Retrieve the ID verification report for the specified document signer.
*PlanApi* | [**apiCreditsCount**](docs/PlanApi.md#apiCreditsCount) | **GET** /v1/plan/apiCreditsCount | Gets the Api credits details.
*SenderIdentitiesApi* | [**createSenderIdentities**](docs/SenderIdentitiesApi.md#createSenderIdentities) | **POST** /v1/senderIdentities/create | Creates sender identity.
*SenderIdentitiesApi* | [**deleteSenderIdentities**](docs/SenderIdentitiesApi.md#deleteSenderIdentities) | **DELETE** /v1/senderIdentities/delete | Deletes sender identity.
*SenderIdentitiesApi* | [**getSenderIdentityProperties**](docs/SenderIdentitiesApi.md#getSenderIdentityProperties) | **GET** /v1/senderIdentities/properties | Gets sender identity by ID or email.
*SenderIdentitiesApi* | [**listSenderIdentities**](docs/SenderIdentitiesApi.md#listSenderIdentities) | **GET** /v1/senderIdentities/list | Lists sender identity.
*SenderIdentitiesApi* | [**reRequestSenderIdentities**](docs/SenderIdentitiesApi.md#reRequestSenderIdentities) | **POST** /v1/senderIdentities/rerequest | Rerequests denied sender identity.
*SenderIdentitiesApi* | [**resendInvitationSenderIdentities**](docs/SenderIdentitiesApi.md#resendInvitationSenderIdentities) | **POST** /v1/senderIdentities/resendInvitation | Resends sender identity invitation.
*SenderIdentitiesApi* | [**updateSenderIdentities**](docs/SenderIdentitiesApi.md#updateSenderIdentities) | **POST** /v1/senderIdentities/update | Updates sender identity.
*TeamsApi* | [**createTeam**](docs/TeamsApi.md#createTeam) | **POST** /v1/teams/create | Create Team.
*TeamsApi* | [**getTeam**](docs/TeamsApi.md#getTeam) | **GET** /v1/teams/get | Get Team details.
*TeamsApi* | [**listTeams**](docs/TeamsApi.md#listTeams) | **GET** /v1/teams/list | List Teams.
*TeamsApi* | [**updateTeam**](docs/TeamsApi.md#updateTeam) | **PUT** /v1/teams/update | Update Team.
*TemplateApi* | [**addTag**](docs/TemplateApi.md#addTag) | **PATCH** /v1/template/addTags | Add the Tags in Templates.
*TemplateApi* | [**createEmbeddedPreviewUrl**](docs/TemplateApi.md#createEmbeddedPreviewUrl) | **POST** /v1/template/createEmbeddedPreviewUrl | Generates a preview URL for a template to view it.
*TemplateApi* | [**createEmbeddedRequestUrlTemplate**](docs/TemplateApi.md#createEmbeddedRequestUrlTemplate) | **POST** /v1/template/createEmbeddedRequestUrl | Generates a send URL using a template which embeds document sending process into your application.
*TemplateApi* | [**createEmbeddedTemplateUrl**](docs/TemplateApi.md#createEmbeddedTemplateUrl) | **POST** /v1/template/createEmbeddedTemplateUrl | Generates a create URL to embeds template create process into your application.
*TemplateApi* | [**createTemplate**](docs/TemplateApi.md#createTemplate) | **POST** /v1/template/create | Creates a new template.
*TemplateApi* | [**deleteTemplate**](docs/TemplateApi.md#deleteTemplate) | **DELETE** /v1/template/delete | Deletes a template.
*TemplateApi* | [**deleteTag**](docs/TemplateApi.md#deleteTag) | **DELETE** /v1/template/deleteTags | Delete the Tags in Templates.
*TemplateApi* | [**download**](docs/TemplateApi.md#download) | **GET** /v1/template/download | Download the template.
*TemplateApi* | [**editTemplate**](docs/TemplateApi.md#editTemplate) | **PUT** /v1/template/edit | Edit and updates an existing template.
*TemplateApi* | [**getEmbeddedTemplateEditUrl**](docs/TemplateApi.md#getEmbeddedTemplateEditUrl) | **POST** /v1/template/getEmbeddedTemplateEditUrl | Generates a edit URL to embeds template edit process into your application.
*TemplateApi* | [**getProperties**](docs/TemplateApi.md#getProperties) | **GET** /v1/template/properties | Get summary of the template.
*TemplateApi* | [**listTemplates**](docs/TemplateApi.md#listTemplates) | **GET** /v1/template/list | List all the templates.
*TemplateApi* | [**mergeAndSend**](docs/TemplateApi.md#mergeAndSend) | **POST** /v1/template/mergeAndSend | Send the document by merging multiple templates.
*TemplateApi* | [**mergeCreateEmbeddedRequestUrlTemplate**](docs/TemplateApi.md#mergeCreateEmbeddedRequestUrlTemplate) | **POST** /v1/template/mergeCreateEmbeddedRequestUrl | Generates a merge request URL using a template that combines document merging and sending processes into your application.
*TemplateApi* | [**sendUsingTemplate**](docs/TemplateApi.md#sendUsingTemplate) | **POST** /v1/template/send | Send a document for signature using a Template.
*UserApi* | [**cancelInvitation**](docs/UserApi.md#cancelInvitation) | **POST** /v1/users/cancelInvitation | Cancel the users invitation.
*UserApi* | [**changeTeam**](docs/UserApi.md#changeTeam) | **PUT** /v1/users/changeTeam | Change users to other team.
*UserApi* | [**createUser**](docs/UserApi.md#createUser) | **POST** /v1/users/create | Create the user.
*UserApi* | [**getUser**](docs/UserApi.md#getUser) | **GET** /v1/users/get | Get summary of the user.
*UserApi* | [**listUsers**](docs/UserApi.md#listUsers) | **GET** /v1/users/list | List user documents.
*UserApi* | [**resendInvitation**](docs/UserApi.md#resendInvitation) | **POST** /v1/users/resendInvitation | Resend the users invitation.
*UserApi* | [**updateMetaData**](docs/UserApi.md#updateMetaData) | **PUT** /v1/users/updateMetaData | Update new User meta data details.
*UserApi* | [**updateUser**](docs/UserApi.md#updateUser) | **PUT** /v1/users/update | Update new User role.


## Documentation for Models

 - [AccessCodeDetail](docs/AccessCodeDetail.md)
 - [AccessCodeDetails](docs/AccessCodeDetails.md)
 - [Added](docs/Added.md)
 - [Address](docs/Address.md)
 - [AttachmentInfo](docs/AttachmentInfo.md)
 - [AuditTrail](docs/AuditTrail.md)
 - [AuthenticationSettings](docs/AuthenticationSettings.md)
 - [Base64File](docs/Base64File.md)
 - [BehalfDocument](docs/BehalfDocument.md)
 - [BehalfDocumentRecords](docs/BehalfDocumentRecords.md)
 - [BehalfOf](docs/BehalfOf.md)
 - [BillingViewModel](docs/BillingViewModel.md)
 - [BrandCreated](docs/BrandCreated.md)
 - [BrandCustomFieldDetails](docs/BrandCustomFieldDetails.md)
 - [BrandingMessage](docs/BrandingMessage.md)
 - [BrandingRecords](docs/BrandingRecords.md)
 - [ChangeRecipient](docs/ChangeRecipient.md)
 - [ChangeTeamRequest](docs/ChangeTeamRequest.md)
 - [CollaborationSettings](docs/CollaborationSettings.md)
 - [ConditionalRule](docs/ConditionalRule.md)
 - [ContactCreated](docs/ContactCreated.md)
 - [ContactDetails](docs/ContactDetails.md)
 - [ContactPageDetails](docs/ContactPageDetails.md)
 - [ContactsDetails](docs/ContactsDetails.md)
 - [ContactsList](docs/ContactsList.md)
 - [CreateContactResponse](docs/CreateContactResponse.md)
 - [CreateSenderIdentityRequest](docs/CreateSenderIdentityRequest.md)
 - [CreateTeamRequest](docs/CreateTeamRequest.md)
 - [CreateTemplateRequest](docs/CreateTemplateRequest.md)
 - [CreateUser](docs/CreateUser.md)
 - [CustomDomainSettings](docs/CustomDomainSettings.md)
 - [CustomFieldCollection](docs/CustomFieldCollection.md)
 - [CustomFieldMessage](docs/CustomFieldMessage.md)
 - [CustomFormField](docs/CustomFormField.md)
 - [Date](docs/Date.md)
 - [DeleteCustomFieldReply](docs/DeleteCustomFieldReply.md)
 - [Document](docs/Document.md)
 - [DocumentCC](docs/DocumentCC.md)
 - [DocumentCcDetails](docs/DocumentCcDetails.md)
 - [DocumentCreated](docs/DocumentCreated.md)
 - [DocumentEdited](docs/DocumentEdited.md)
 - [DocumentExpirySettings](docs/DocumentExpirySettings.md)
 - [DocumentFiles](docs/DocumentFiles.md)
 - [DocumentFormFields](docs/DocumentFormFields.md)
 - [DocumentInfo](docs/DocumentInfo.md)
 - [DocumentProperties](docs/DocumentProperties.md)
 - [DocumentReassign](docs/DocumentReassign.md)
 - [DocumentRecords](docs/DocumentRecords.md)
 - [DocumentSenderDetail](docs/DocumentSenderDetail.md)
 - [DocumentSigner](docs/DocumentSigner.md)
 - [DocumentSignerDetails](docs/DocumentSignerDetails.md)
 - [DocumentTags](docs/DocumentTags.md)
 - [DownloadImageRequest](docs/DownloadImageRequest.md)
 - [EditDocumentFile](docs/EditDocumentFile.md)
 - [EditDocumentRequest](docs/EditDocumentRequest.md)
 - [EditDocumentSigner](docs/EditDocumentSigner.md)
 - [EditFormField](docs/EditFormField.md)
 - [EditSenderIdentityRequest](docs/EditSenderIdentityRequest.md)
 - [EditTemplateRequest](docs/EditTemplateRequest.md)
 - [EditableDateFieldSettings](docs/EditableDateFieldSettings.md)
 - [EmbeddedCreateTemplateRequest](docs/EmbeddedCreateTemplateRequest.md)
 - [EmbeddedCustomFieldCreated](docs/EmbeddedCustomFieldCreated.md)
 - [EmbeddedDocumentRequest](docs/EmbeddedDocumentRequest.md)
 - [EmbeddedFileDetails](docs/EmbeddedFileDetails.md)
 - [EmbeddedFileLink](docs/EmbeddedFileLink.md)
 - [EmbeddedMergeTemplateFormRequest](docs/EmbeddedMergeTemplateFormRequest.md)
 - [EmbeddedSendCreated](docs/EmbeddedSendCreated.md)
 - [EmbeddedSendTemplateFormRequest](docs/EmbeddedSendTemplateFormRequest.md)
 - [EmbeddedSigningLink](docs/EmbeddedSigningLink.md)
 - [EmbeddedTemplateCreated](docs/EmbeddedTemplateCreated.md)
 - [EmbeddedTemplateEditRequest](docs/EmbeddedTemplateEditRequest.md)
 - [EmbeddedTemplateEdited](docs/EmbeddedTemplateEdited.md)
 - [EmbeddedTemplatePreview](docs/EmbeddedTemplatePreview.md)
 - [EmbeddedTemplatePreviewJsonRequest](docs/EmbeddedTemplatePreviewJsonRequest.md)
 - [Error](docs/Error.md)
 - [ErrorResult](docs/ErrorResult.md)
 - [ExistingFormField](docs/ExistingFormField.md)
 - [ExtendExpiry](docs/ExtendExpiry.md)
 - [FileInfo](docs/FileInfo.md)
 - [Font](docs/Font.md)
 - [FormField](docs/FormField.md)
 - [FormFieldPermission](docs/FormFieldPermission.md)
 - [FormGroup](docs/FormGroup.md)
 - [FormulaFieldSettings](docs/FormulaFieldSettings.md)
 - [GroupSigner](docs/GroupSigner.md)
 - [GroupSignerSettings](docs/GroupSignerSettings.md)
 - [IdDocument](docs/IdDocument.md)
 - [IdReport](docs/IdReport.md)
 - [IdVerificationDetails](docs/IdVerificationDetails.md)
 - [IdentityVerificationSettings](docs/IdentityVerificationSettings.md)
 - [ImageInfo](docs/ImageInfo.md)
 - [MergeAndSendForSignForm](docs/MergeAndSendForSignForm.md)
 - [ModificationDetails](docs/ModificationDetails.md)
 - [NotificationSettings](docs/NotificationSettings.md)
 - [PageDetails](docs/PageDetails.md)
 - [PhoneNumber](docs/PhoneNumber.md)
 - [PrefillField](docs/PrefillField.md)
 - [PrefillFieldRequest](docs/PrefillFieldRequest.md)
 - [RecipientChangeLog](docs/RecipientChangeLog.md)
 - [RecipientNotificationSettings](docs/RecipientNotificationSettings.md)
 - [Rectangle](docs/Rectangle.md)
 - [ReminderMessage](docs/ReminderMessage.md)
 - [ReminderSettings](docs/ReminderSettings.md)
 - [RemoveAuthentication](docs/RemoveAuthentication.md)
 - [Removed](docs/Removed.md)
 - [RevokeDocument](docs/RevokeDocument.md)
 - [Role](docs/Role.md)
 - [Roles](docs/Roles.md)
 - [SendForSign](docs/SendForSign.md)
 - [SendForSignFromTemplateForm](docs/SendForSignFromTemplateForm.md)
 - [SenderIdentityCreated](docs/SenderIdentityCreated.md)
 - [SenderIdentityList](docs/SenderIdentityList.md)
 - [SenderIdentityViewModel](docs/SenderIdentityViewModel.md)
 - [SignatureFrameSettings](docs/SignatureFrameSettings.md)
 - [SignerAuthenticationSettings](docs/SignerAuthenticationSettings.md)
 - [Size](docs/Size.md)
 - [TeamCreated](docs/TeamCreated.md)
 - [TeamDocumentRecords](docs/TeamDocumentRecords.md)
 - [TeamListResponse](docs/TeamListResponse.md)
 - [TeamPageDetails](docs/TeamPageDetails.md)
 - [TeamResponse](docs/TeamResponse.md)
 - [TeamUpdateRequest](docs/TeamUpdateRequest.md)
 - [TeamUsers](docs/TeamUsers.md)
 - [Teams](docs/Teams.md)
 - [Template](docs/Template.md)
 - [TemplateCC](docs/TemplateCC.md)
 - [TemplateCreated](docs/TemplateCreated.md)
 - [TemplateFiles](docs/TemplateFiles.md)
 - [TemplateFormFields](docs/TemplateFormFields.md)
 - [TemplateGroupSigner](docs/TemplateGroupSigner.md)
 - [TemplateProperties](docs/TemplateProperties.md)
 - [TemplateRecords](docs/TemplateRecords.md)
 - [TemplateRole](docs/TemplateRole.md)
 - [TemplateSenderDetail](docs/TemplateSenderDetail.md)
 - [TemplateSenderDetails](docs/TemplateSenderDetails.md)
 - [TemplateSharedTemplateDetail](docs/TemplateSharedTemplateDetail.md)
 - [TemplateSharing](docs/TemplateSharing.md)
 - [TemplateSignerDetails](docs/TemplateSignerDetails.md)
 - [TemplateTag](docs/TemplateTag.md)
 - [TemplateTeamShare](docs/TemplateTeamShare.md)
 - [TextTagDefinition](docs/TextTagDefinition.md)
 - [TextTagOffset](docs/TextTagOffset.md)
 - [UpdateUser](docs/UpdateUser.md)
 - [UpdateUserMetaData](docs/UpdateUserMetaData.md)
 - [UserPageDetails](docs/UserPageDetails.md)
 - [UserProperties](docs/UserProperties.md)
 - [UserRecords](docs/UserRecords.md)
 - [UsersDetails](docs/UsersDetails.md)
 - [Validation](docs/Validation.md)
 - [VerificationDataRequest](docs/VerificationDataRequest.md)
 - [ViewBrandDetails](docs/ViewBrandDetails.md)
 - [ViewCustomFieldDetails](docs/ViewCustomFieldDetails.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Bearer"></a>
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

<a id="X-API-KEY"></a>
### X-API-KEY

- **Type**: API key
- **API key parameter name**: X-API-KEY
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@boldsign.com

