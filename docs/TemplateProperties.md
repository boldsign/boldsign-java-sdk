

# TemplateProperties


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**templateId** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**documentTitle** | **String** |  |  [optional] |
|**documentMessage** | **String** |  |  [optional] |
|**files** | [**List&lt;TemplateFiles&gt;**](TemplateFiles.md) |  |  [optional] |
|**roles** | [**List&lt;Roles&gt;**](Roles.md) |  |  [optional] |
|**formGroups** | [**List&lt;FormGroup&gt;**](FormGroup.md) |  |  [optional] |
|**commonFields** | [**List&lt;TemplateFormFields&gt;**](TemplateFormFields.md) |  |  [optional] |
|**cCDetails** | **List&lt;String&gt;** |  |  [optional] |
|**brandId** | **String** |  |  [optional] |
|**allowMessageEditing** | **Boolean** |  |  [optional] |
|**allowNewRoles** | **Boolean** |  |  [optional] |
|**allowNewFiles** | **Boolean** |  |  [optional] |
|**allowModifyFiles** | **Boolean** |  |  [optional] |
|**enableReassign** | **Boolean** |  |  [optional] |
|**enablePrintAndSign** | **Boolean** |  |  [optional] |
|**enableSigningOrder** | **Boolean** |  |  [optional] |
|**createdDate** | **Long** |  |  [optional] |
|**createdBy** | [**TemplateSenderDetail**](TemplateSenderDetail.md) |  |  [optional] |
|**sharedTemplateDetail** | [**List&lt;TemplateSharedTemplateDetail&gt;**](TemplateSharedTemplateDetail.md) |  |  [optional] |
|**documentInfo** | [**List&lt;DocumentInfo&gt;**](DocumentInfo.md) |  |  [optional] |
|**labels** | **List&lt;String&gt;** |  |  [optional] |
|**templateLabels** | **List&lt;String&gt;** |  |  [optional] |
|**behalfOf** | [**BehalfOf**](BehalfOf.md) |  |  [optional] |
|**documentDownloadOption** | [**DocumentDownloadOptionEnum**](#DocumentDownloadOptionEnum) |  |  [optional] |
|**recipientNotificationSettings** | [**RecipientNotificationSettings**](RecipientNotificationSettings.md) |  |  [optional] |
|**formFieldPermission** | [**FormFieldPermission**](FormFieldPermission.md) |  |  [optional] |
|**allowedSignatureTypes** | [**List&lt;AllowedSignatureTypesEnum&gt;**](#List&lt;AllowedSignatureTypesEnum&gt;) |  |  [optional] |
|**groupSignerSettings** | [**GroupSignerSettings**](GroupSignerSettings.md) |  |  [optional] |
|**sharing** | [**TemplateSharing**](TemplateSharing.md) |  |  [optional] |



## Enum: DocumentDownloadOptionEnum

| Name | Value |
|---- | -----|
| COMBINED | &quot;Combined&quot; |
| INDIVIDUALLY | &quot;Individually&quot; |



## Enum: List&lt;AllowedSignatureTypesEnum&gt;

| Name | Value |
|---- | -----|
| TEXT | &quot;Text&quot; |
| DRAW | &quot;Draw&quot; |
| IMAGE | &quot;Image&quot; |



