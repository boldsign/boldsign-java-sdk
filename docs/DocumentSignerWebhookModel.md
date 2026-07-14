

# DocumentSignerWebhookModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**signerName** | **String** |  |  [optional] |
|**signerRole** | **String** |  |  [optional] |
|**signerEmail** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**groupSigners** | [**List&lt;DocumentGroupSignerWebhookModel&gt;**](DocumentGroupSignerWebhookModel.md) |  |  [optional] |
|**phoneNumber** | [**PhoneNumberWebhookModel**](PhoneNumberWebhookModel.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**enableAccessCode** | **Boolean** |  |  [optional] |
|**isAuthenticationFailed** | **Boolean** |  |  [optional] |
|**enableEmailOTP** | **Boolean** |  |  [optional] |
|**isDeliveryFailed** | **Boolean** |  |  [optional] |
|**isViewed** | **Boolean** |  |  [optional] |
|**order** | **Integer** |  |  [optional] |
|**signerType** | **String** |  |  [optional] |
|**signType** | **String** |  |  [optional] |
|**groupId** | **String** |  |  [optional] |
|**isReassigned** | **Boolean** |  |  [optional] |
|**reassignMessage** | **String** |  |  [optional] |
|**declineMessage** | **String** |  |  [optional] |
|**lastActivityDate** | **OffsetDateTime** |  |  [optional] |
|**authenticationType** | **String** |  |  [optional] |
|**idVerification** | [**IdVerificationSignerWebhookModel**](IdVerificationSignerWebhookModel.md) |  |  [optional] |
|**kba** | [**KbaSignerWebhookModel**](KbaSignerWebhookModel.md) |  |  [optional] |
|**allowFieldConfiguration** | **Boolean** |  |  [optional] |
|**lastReminderSentOn** | **OffsetDateTime** |  |  [optional] |
|**authenticationRetryCount** | **Integer** |  |  [optional] |
|**authenticationSettings** | [**SignerAuthenticationWebhookModel**](SignerAuthenticationWebhookModel.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| NOT_COMPLETED | &quot;NotCompleted&quot; |
| COMPLETED | &quot;Completed&quot; |
| DECLINED | &quot;Declined&quot; |
| REVOKED | &quot;Revoked&quot; |
| EXPIRED | &quot;Expired&quot; |



