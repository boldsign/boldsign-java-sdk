

# TemplateSigner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**signerName** | **String** |  |  [optional] |
|**signerRole** | **String** |  |  [optional] |
|**signerEmail** | **String** |  |  [optional] |
|**groupSigners** | [**List&lt;TemplateGroupSignerWebhookModel&gt;**](TemplateGroupSignerWebhookModel.md) |  |  [optional] |
|**phoneNumber** | [**PhoneNumberWebhookModel**](PhoneNumberWebhookModel.md) |  |  [optional] |
|**enableAccessCode** | **Boolean** |  |  [optional] |
|**enableEmailOTP** | **Boolean** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**order** | **Integer** |  |  [optional] |
|**signerType** | **String** |  |  [optional] |
|**signType** | **String** |  |  [optional] |
|**groupId** | **String** |  |  [optional] |
|**hostEmail** | **String** |  |  [optional] |
|**hostName** | **String** |  |  [optional] |
|**hostUserId** | **String** |  |  [optional] |
|**imposeAuthentication** | **String** |  |  [optional] |
|**allowFieldConfiguration** | **Boolean** |  |  [optional] |
|**roleIndex** | **Integer** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| NOT_COMPLETED | &quot;NotCompleted&quot; |
| COMPLETED | &quot;Completed&quot; |
| DECLINED | &quot;Declined&quot; |
| REVOKED | &quot;Revoked&quot; |
| EXPIRED | &quot;Expired&quot; |



