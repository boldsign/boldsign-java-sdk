

# IWebhookData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | **String** |  |  [optional] |
|**documentId** | **String** |  |  [optional] |
|**messageTitle** | **String** |  |  [optional] |
|**documentDescription** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**senderDetail** | [**DocumentSender**](DocumentSender.md) |  |  [optional] |
|**signerDetails** | [**List&lt;TemplateSigner&gt;**](TemplateSigner.md) |  |  [optional] |
|**ccDetails** | [**List&lt;TemplateCcWebhookModel&gt;**](TemplateCcWebhookModel.md) |  |  [optional] |
|**onBehalfOf** | **String** |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**expiryDate** | **OffsetDateTime** |  |  [optional] |
|**enableSigningOrder** | **Boolean** |  |  [optional] |
|**disableEmails** | **Boolean** |  |  [optional] |
|**revokeMessage** | **String** |  |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**labels** | **List&lt;String&gt;** |  |  [optional] |
|**isCombinedAudit** | **Boolean** |  |  [optional] |
|**isCombinedAttachment** | **Boolean** |  |  [optional] |
|**brandId** | **String** |  |  [optional] |
|**documentDownloadOption** | **String** |  |  [optional] |
|**metaData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**failedDeliveryMode** | [**FailedDeliveryModeEnum**](#FailedDeliveryModeEnum) |  |  [optional] |
|**behalfOf** | [**BehalfOfWebhookModel**](BehalfOfWebhookModel.md) |  |  [optional] |
|**allowedSignatureTypes** | [**List&lt;AllowedSignatureTypesEnum&gt;**](#List&lt;AllowedSignatureTypesEnum&gt;) |  |  [optional] |
|**groupSignerSettings** | [**GroupSignerSettingsWebhookModel**](GroupSignerSettingsWebhookModel.md) |  |  [optional] |
|**enableAllowSignEverywhere** | **Boolean** |  |  [optional] |
|**documentTimeZone** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**modifiedDate** | **OffsetDateTime** |  |  [optional] |
|**approvedDateTime** | **OffsetDateTime** |  |  [optional] |
|**redirectUrl** | **String** |  |  [optional] |
|**createdBy** | [**SenderIdentityCreator**](SenderIdentityCreator.md) |  |  [optional] |
|**locale** | **String** |  |  [optional] |
|**templateId** | **String** |  |  [optional] |
|**allowNewFiles** | **Boolean** |  |  [optional] |
|**allowModifyFiles** | **Boolean** |  |  [optional] |
|**activityDate** | **OffsetDateTime** |  |  [optional] |
|**activityBy** | **String** |  |  [optional] |
|**templateName** | **String** |  |  [optional] |
|**templateDescription** | **String** |  |  [optional] |
|**isTemplate** | **Boolean** |  |  [optional] |
|**templateLabels** | **List&lt;String&gt;** |  |  [optional] |
|**formFieldPermission** | [**FormFieldPermissionWebhookModel**](FormFieldPermissionWebhookModel.md) |  |  [optional] |
|**signerDetail** | [**DocumentSignerWebhookModel**](DocumentSignerWebhookModel.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;InProgress&quot; |
| COMPLETED | &quot;Completed&quot; |
| DECLINED | &quot;Declined&quot; |
| EXPIRED | &quot;Expired&quot; |
| REVOKED | &quot;Revoked&quot; |
| DRAFT | &quot;Draft&quot; |
| SCHEDULED | &quot;Scheduled&quot; |



## Enum: FailedDeliveryModeEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;Email&quot; |
| SMS | &quot;SMS&quot; |
| WHATS_APP | &quot;WhatsApp&quot; |



## Enum: List&lt;AllowedSignatureTypesEnum&gt;

| Name | Value |
|---- | -----|
| TEXT | &quot;Text&quot; |
| DRAW | &quot;Draw&quot; |
| IMAGE | &quot;Image&quot; |



