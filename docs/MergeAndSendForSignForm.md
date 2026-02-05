

# MergeAndSendForSignForm


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**files** | **List&lt;File&gt;** |  |  [optional] |
|**fileUrls** | **List&lt;URI&gt;** |  |  [optional] |
|**templateIds** | **List&lt;String&gt;** |  |  [optional] |
|**useTextTags** | **Boolean** |  |  [optional] |
|**textTagDefinitions** | [**List&lt;TextTagDefinition&gt;**](TextTagDefinition.md) |  |  [optional] |
|**documentId** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**roles** | [**List&lt;Role&gt;**](Role.md) |  |  [optional] |
|**brandId** | **String** |  |  [optional] |
|**labels** | **List&lt;String&gt;** |  |  [optional] |
|**disableEmails** | **Boolean** |  |  [optional] |
|**disableSMS** | **Boolean** |  |  [optional] |
|**hideDocumentId** | **Boolean** |  |  [optional] |
|**reminderSettings** | [**ReminderSettings**](ReminderSettings.md) |  |  [optional] |
|**cc** | [**List&lt;DocumentCC&gt;**](DocumentCC.md) |  |  [optional] |
|**expiryDays** | **Integer** |  |  [optional] |
|**expiryDateType** | [**ExpiryDateTypeEnum**](#ExpiryDateTypeEnum) |  |  [optional] |
|**expiryValue** | **Long** |  |  [optional] |
|**enablePrintAndSign** | **Boolean** |  |  [optional] |
|**enableReassign** | **Boolean** |  |  [optional] |
|**enableSigningOrder** | **Boolean** |  |  [optional] |
|**disableExpiryAlert** | **Boolean** |  |  [optional] |
|**documentInfo** | [**List&lt;DocumentInfo&gt;**](DocumentInfo.md) |  |  [optional] |
|**onBehalfOf** | **String** |  |  [optional] |
|**isSandbox** | **Boolean** |  |  [optional] |
|**roleRemovalIndices** | **List&lt;Integer&gt;** |  |  [optional] |
|**documentDownloadOption** | [**DocumentDownloadOptionEnum**](#DocumentDownloadOptionEnum) |  |  [optional] |
|**metaData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**formGroups** | [**List&lt;FormGroup&gt;**](FormGroup.md) |  |  [optional] |
|**removeFormFields** | **List&lt;String&gt;** |  |  [optional] |
|**recipientNotificationSettings** | [**RecipientNotificationSettings**](RecipientNotificationSettings.md) |  |  [optional] |
|**enableAuditTrailLocalization** | **Boolean** |  |  [optional] |
|**downloadFileName** | **String** |  |  [optional] |
|**scheduledSendTime** | **Long** |  |  [optional] |
|**allowScheduledSend** | **Boolean** |  |  [optional] |
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



