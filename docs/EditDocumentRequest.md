

# EditDocumentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**files** | [**List&lt;EditDocumentFile&gt;**](EditDocumentFile.md) |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**signers** | [**List&lt;EditDocumentSigner&gt;**](EditDocumentSigner.md) |  |  [optional] |
|**cc** | [**List&lt;DocumentCC&gt;**](DocumentCC.md) |  |  [optional] |
|**enableSigningOrder** | **Boolean** |  |  [optional] |
|**enableAuditTrailLocalization** | **Boolean** |  |  [optional] |
|**expiryDateType** | [**ExpiryDateTypeEnum**](#ExpiryDateTypeEnum) |  |  [optional] |
|**expiryValue** | **Long** |  |  [optional] |
|**reminderSettings** | [**ReminderSettings**](ReminderSettings.md) |  |  [optional] |
|**disableEmails** | **Boolean** |  |  [optional] |
|**disableSMS** | **Boolean** |  |  [optional] |
|**brandId** | **String** |  |  [optional] |
|**hideDocumentId** | **Boolean** |  |  [optional] |
|**labels** | **List&lt;String&gt;** |  |  [optional] |
|**disableExpiryAlert** | **Boolean** |  |  [optional] |
|**enablePrintAndSign** | **Boolean** |  |  [optional] |
|**enableReassign** | **Boolean** |  |  [optional] |
|**useTextTags** | **Boolean** |  |  [optional] |
|**textTagDefinitions** | [**List&lt;TextTagDefinition&gt;**](TextTagDefinition.md) |  |  [optional] |
|**documentInfo** | [**List&lt;DocumentInfo&gt;**](DocumentInfo.md) |  |  [optional] |
|**onBehalfOf** | **String** |  |  [optional] |
|**documentDownloadOption** | [**DocumentDownloadOptionEnum**](#DocumentDownloadOptionEnum) |  |  [optional] |
|**metaData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**recipientNotificationSettings** | [**RecipientNotificationSettings**](RecipientNotificationSettings.md) |  |  [optional] |
|**formGroups** | [**List&lt;FormGroup&gt;**](FormGroup.md) |  |  [optional] |
|**downloadFileName** | **String** |  |  [optional] |
|**scheduledSendTime** | **Long** |  |  [optional] |
|**allowedSignatureTypes** | [**List&lt;AllowedSignatureTypesEnum&gt;**](#List&lt;AllowedSignatureTypesEnum&gt;) |  |  [optional] |
|**groupSignerSettings** | [**GroupSignerSettings**](GroupSignerSettings.md) |  |  [optional] |



## Enum: ExpiryDateTypeEnum

| Name | Value |
|---- | -----|
| DAYS | &quot;Days&quot; |
| HOURS | &quot;Hours&quot; |
| SPECIFIC_DATE_TIME | &quot;SpecificDateTime&quot; |



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



