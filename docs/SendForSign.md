

# SendForSign


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**files** | **List&lt;File&gt;** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**signers** | [**List&lt;DocumentSigner&gt;**](DocumentSigner.md) |  |  [optional] |
|**cc** | [**List&lt;DocumentCC&gt;**](DocumentCC.md) |  |  [optional] |
|**enableSigningOrder** | **Boolean** |  |  [optional] |
|**expiryDays** | **Integer** |  |  [optional] |
|**expiryDateType** | [**ExpiryDateTypeEnum**](#ExpiryDateTypeEnum) |  |  [optional] |
|**expiryValue** | **Long** |  |  [optional] |
|**reminderSettings** | [**ReminderSettings**](ReminderSettings.md) |  |  [optional] |
|**enableEmbeddedSigning** | **Boolean** |  |  [optional] |
|**disableEmails** | **Boolean** |  |  [optional] |
|**disableSMS** | **Boolean** |  |  [optional] |
|**brandId** | **String** |  |  [optional] |
|**hideDocumentId** | **Boolean** |  |  [optional] |
|**labels** | **List&lt;String&gt;** |  |  [optional] |
|**fileUrls** | **List&lt;URI&gt;** |  |  [optional] |
|**sendLinkValidTill** | **OffsetDateTime** |  |  [optional] |
|**useTextTags** | **Boolean** |  |  [optional] |
|**textTagDefinitions** | [**List&lt;TextTagDefinition&gt;**](TextTagDefinition.md) |  |  [optional] |
|**enablePrintAndSign** | **Boolean** |  |  [optional] |
|**enableReassign** | **Boolean** |  |  [optional] |
|**disableExpiryAlert** | **Boolean** |  |  [optional] |
|**documentInfo** | [**List&lt;DocumentInfo&gt;**](DocumentInfo.md) |  |  [optional] |
|**onBehalfOf** | **String** |  |  [optional] |
|**autoDetectFields** | **Boolean** |  |  [optional] |
|**documentDownloadOption** | [**DocumentDownloadOptionEnum**](#DocumentDownloadOptionEnum) |  |  [optional] |
|**isSandbox** | **Boolean** |  |  [optional] |
|**metaData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**recipientNotificationSettings** | [**RecipientNotificationSettings**](RecipientNotificationSettings.md) |  |  [optional] |
|**formGroups** | [**List&lt;FormGroup&gt;**](FormGroup.md) |  |  [optional] |
|**enableAuditTrailLocalization** | **Boolean** |  |  [optional] |
|**downloadFileName** | **String** |  |  [optional] |
|**scheduledSendTime** | **Long** |  |  [optional] |
|**allowScheduledSend** | **Boolean** |  |  [optional] |



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



