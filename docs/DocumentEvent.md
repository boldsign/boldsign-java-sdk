

# DocumentEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | **String** |  |  [optional] |
|**documentId** | **String** |  |  [optional] |
|**messageTitle** | **String** |  |  [optional] |
|**documentDescription** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**senderDetail** | [**DocumentSender**](DocumentSender.md) |  |  [optional] |
|**signerDetails** | [**List&lt;DocumentSignerWebhookModel&gt;**](DocumentSignerWebhookModel.md) |  |  [optional] |
|**ccDetails** | [**List&lt;DocumentCcWebhookModel&gt;**](DocumentCcWebhookModel.md) |  |  [optional] |
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



