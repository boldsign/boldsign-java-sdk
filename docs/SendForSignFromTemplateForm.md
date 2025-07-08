

# SendForSignFromTemplateForm


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**files** | **List&lt;File&gt;** |  |  [optional] |
|**fileUrls** | **List&lt;URI&gt;** |  |  [optional] |
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
|**recipientNotificationSettings** | [**RecipientNotificationSettings**](RecipientNotificationSettings.md) |  |  [optional] |
|**formGroups** | [**List&lt;FormGroup&gt;**](FormGroup.md) |  |  [optional] |
|**removeFormFields** | **List&lt;String&gt;** |  |  [optional] |
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
| NULL | &quot;null&quot; |



## Enum: DocumentDownloadOptionEnum

| Name | Value |
|---- | -----|
| COMBINED | &quot;Combined&quot; |
| INDIVIDUALLY | &quot;Individually&quot; |
| NULL | &quot;null&quot; |



