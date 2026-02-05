

# TemplateSignerDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**signerName** | **String** |  |  [optional] |
|**signerRole** | **String** |  |  [optional] |
|**signerEmail** | **String** |  |  [optional] |
|**phoneNumber** | [**PhoneNumber**](PhoneNumber.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**enableAccessCode** | **Boolean** |  |  [optional] |
|**enableEmailOTP** | **Boolean** |  |  [optional] |
|**imposeAuthentication** | [**ImposeAuthenticationEnum**](#ImposeAuthenticationEnum) |  |  [optional] |
|**deliveryMode** | [**DeliveryModeEnum**](#DeliveryModeEnum) |  |  [optional] |
|**allowFieldConfiguration** | **Boolean** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**order** | **Integer** |  |  [optional] |
|**signerType** | [**SignerTypeEnum**](#SignerTypeEnum) |  |  [optional] |
|**hostEmail** | **String** |  |  [optional] |
|**hostName** | **String** |  |  [optional] |
|**hostUserId** | **String** |  |  [optional] |
|**signType** | [**SignTypeEnum**](#SignTypeEnum) |  |  [optional] |
|**groupId** | **String** |  |  [optional] |
|**groupSigners** | [**List&lt;TemplateGroupSigner&gt;**](TemplateGroupSigner.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| NOT_COMPLETED | &quot;NotCompleted&quot; |
| COMPLETED | &quot;Completed&quot; |
| DECLINED | &quot;Declined&quot; |
| REVOKED | &quot;Revoked&quot; |
| EXPIRED | &quot;Expired&quot; |



## Enum: ImposeAuthenticationEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| EMAIL_OTP | &quot;EmailOTP&quot; |
| ACCESS_CODE | &quot;AccessCode&quot; |
| SMSOTP | &quot;SMSOTP&quot; |
| ID_VERIFICATION | &quot;IdVerification&quot; |



## Enum: DeliveryModeEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;Email&quot; |
| SMS | &quot;SMS&quot; |
| EMAIL_AND_SMS | &quot;EmailAndSMS&quot; |
| WHATS_APP | &quot;WhatsApp&quot; |



## Enum: SignerTypeEnum

| Name | Value |
|---- | -----|
| SIGNER | &quot;Signer&quot; |
| REVIEWER | &quot;Reviewer&quot; |
| IN_PERSON_SIGNER | &quot;InPersonSigner&quot; |



## Enum: SignTypeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;Single&quot; |
| GROUP | &quot;Group&quot; |



