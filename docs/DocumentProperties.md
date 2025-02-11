

# DocumentProperties


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | **String** |  |  [optional] |
|**brandId** | **String** |  |  [optional] |
|**messageTitle** | **String** |  |  [optional] |
|**documentDescription** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**files** | [**List&lt;DocumentFiles&gt;**](DocumentFiles.md) |  |  [optional] |
|**senderDetail** | [**DocumentSenderDetail**](DocumentSenderDetail.md) |  |  [optional] |
|**signerDetails** | [**List&lt;DocumentSignerDetails&gt;**](DocumentSignerDetails.md) |  |  [optional] |
|**formGroups** | [**List&lt;FormGroup&gt;**](FormGroup.md) |  |  [optional] |
|**commonFields** | [**List&lt;DocumentFormFields&gt;**](DocumentFormFields.md) |  |  [optional] |
|**behalfOf** | [**BehalfOf**](BehalfOf.md) |  |  [optional] |
|**ccDetails** | [**List&lt;DocumentCcDetails&gt;**](DocumentCcDetails.md) |  |  [optional] |
|**reminderSettings** | [**ReminderSettings**](ReminderSettings.md) |  |  [optional] |
|**reassign** | [**List&lt;DocumentReassign&gt;**](DocumentReassign.md) |  |  [optional] |
|**documentHistory** | [**List&lt;AuditTrail&gt;**](AuditTrail.md) |  |  [optional] |
|**activityBy** | **String** |  |  [optional] |
|**activityDate** | **Long** |  |  [optional] |
|**activityAction** | [**ActivityActionEnum**](#ActivityActionEnum) |  |  [optional] |
|**createdDate** | **Long** |  |  [optional] |
|**expiryDays** | **Integer** |  |  [optional] |
|**expiryDate** | **Long** |  |  [optional] |
|**enableSigningOrder** | **Boolean** |  |  [optional] |
|**isDeleted** | **Boolean** |  |  [optional] |
|**revokeMessage** | **String** |  |  [optional] |
|**declineMessage** | **String** |  |  [optional] |
|**applicationId** | **String** |  |  [optional] |
|**labels** | **List&lt;String&gt;** |  |  [optional] |
|**disableEmails** | **Boolean** |  |  [optional] |
|**enablePrintAndSign** | **Boolean** |  |  [optional] |
|**enableReassign** | **Boolean** |  |  [optional] |
|**disableExpiryAlert** | **Boolean** |  |  [optional] |
|**hideDocumentId** | **Boolean** |  |  [optional] |
|**expiryDateType** | [**ExpiryDateTypeEnum**](#ExpiryDateTypeEnum) |  |  [optional] |
|**expiryValue** | **Long** |  |  [optional] |
|**documentDownloadOption** | [**DocumentDownloadOptionEnum**](#DocumentDownloadOptionEnum) |  |  [optional] |
|**metaData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**enableAuditTrailLocalization** | **Boolean** |  |  [optional] |
|**downloadFileName** | **String** |  |  [optional] |
|**recipientNotificationSettings** | [**RecipientNotificationSettings**](RecipientNotificationSettings.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;InProgress&quot; |
| COMPLETED | &quot;Completed&quot; |
| DECLINED | &quot;Declined&quot; |
| EXPIRED | &quot;Expired&quot; |
| REVOKED | &quot;Revoked&quot; |
| DRAFT | &quot;Draft&quot; |



## Enum: ActivityActionEnum

| Name | Value |
|---- | -----|
| VIEWED | &quot;Viewed&quot; |
| SIGNED | &quot;Signed&quot; |
| REASSIGNED | &quot;Reassigned&quot; |
| DECLINED | &quot;Declined&quot; |
| REVOKED | &quot;Revoked&quot; |
| EXPIRED | &quot;Expired&quot; |
| DOWNLOADED | &quot;Downloaded&quot; |
| DOWNLOADED_FOR_PRINT_SIGN | &quot;DownloadedForPrintSign&quot; |
| INITIATE_PRINT_AND_SIGN | &quot;InitiatePrintAndSign&quot; |
| INITIATE_FORM_SIGN | &quot;InitiateFormSign&quot; |
| CANCEL_PRINT_AND_SIGN | &quot;CancelPrintAndSign&quot; |
| COMPLETE_PRINT_AND_SIGN | &quot;CompletePrintAndSign&quot; |
| REVIEWED | &quot;Reviewed&quot; |
| NONE | &quot;None&quot; |
| EDITING_INITIATED | &quot;EditingInitiated&quot; |
| EDITING_CANCELLED | &quot;EditingCancelled&quot; |
| EDITING_COMPLETED | &quot;EditingCompleted&quot; |



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



