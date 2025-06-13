

# AccessCodeDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authenticationType** | [**AuthenticationTypeEnum**](#AuthenticationTypeEnum) |  |  |
|**emailId** | **String** |  |  [optional] |
|**order** | **Integer** |  |  [optional] |
|**accessCode** | **String** |  |  [optional] |
|**onBehalfOf** | **String** |  |  [optional] |
|**phoneNumber** | [**PhoneNumber**](PhoneNumber.md) |  |  [optional] |
|**identityVerificationSettings** | [**IdentityVerificationSettings**](IdentityVerificationSettings.md) |  |  [optional] |
|**authenticationRetryCount** | **Integer** |  |  [optional] |
|**authenticationSettings** | [**AuthenticationSettings**](AuthenticationSettings.md) |  |  [optional] |



## Enum: AuthenticationTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| EMAIL_OTP | &quot;EmailOTP&quot; |
| ACCESS_CODE | &quot;AccessCode&quot; |
| SMSOTP | &quot;SMSOTP&quot; |
| ID_VERIFICATION | &quot;IdVerification&quot; |



