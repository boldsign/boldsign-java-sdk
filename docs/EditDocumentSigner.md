

# EditDocumentSigner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editAction** | [**EditActionEnum**](#EditActionEnum) |  |  |
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**emailAddress** | **String** |  |  [optional] |
|**privateMessage** | **String** |  |  [optional] |
|**authenticationType** | [**AuthenticationTypeEnum**](#AuthenticationTypeEnum) |  |  [optional] |
|**phoneNumber** | [**PhoneNumber**](PhoneNumber.md) |  |  [optional] |
|**deliveryMode** | [**DeliveryModeEnum**](#DeliveryModeEnum) |  |  [optional] |
|**authenticationCode** | **String** |  |  [optional] |
|**identityVerificationSettings** | [**IdentityVerificationSettings**](IdentityVerificationSettings.md) |  |  [optional] |
|**signerOrder** | **Integer** |  |  [optional] |
|**enableEmailOTP** | **Boolean** |  |  [optional] |
|**signerType** | [**SignerTypeEnum**](#SignerTypeEnum) |  |  [optional] |
|**hostEmail** | **String** |  |  [optional] |
|**signerRole** | **String** |  |  [optional] |
|**allowFieldConfiguration** | **Boolean** |  |  [optional] |
|**formFields** | [**List&lt;EditFormField&gt;**](EditFormField.md) |  |  [optional] |
|**language** | [**LanguageEnum**](#LanguageEnum) |  |  [optional] |
|**locale** | [**LocaleEnum**](#LocaleEnum) |  |  [optional] |
|**signType** | [**SignTypeEnum**](#SignTypeEnum) |  |  [optional] |
|**groupId** | **String** |  |  [optional] |
|**recipientNotificationSettings** | [**RecipientNotificationSettings**](RecipientNotificationSettings.md) |  |  [optional] |
|**authenticationRetryCount** | **Integer** |  |  [optional] |
|**enableQes** | **Boolean** |  |  [optional] |
|**authenticationSettings** | [**AuthenticationSettings**](AuthenticationSettings.md) |  |  [optional] |



## Enum: EditActionEnum

| Name | Value |
|---- | -----|
| ADD | &quot;Add&quot; |
| UPDATE | &quot;Update&quot; |
| REMOVE | &quot;Remove&quot; |



## Enum: AuthenticationTypeEnum

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



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_11 | 11 |
| NUMBER_12 | 12 |
| NUMBER_13 | 13 |
| NUMBER_14 | 14 |
| NUMBER_15 | 15 |
| NUMBER_16 | 16 |
| NUMBER_17 | 17 |
| NUMBER_18 | 18 |
| NUMBER_19 | 19 |
| NUMBER_20 | 20 |



## Enum: LocaleEnum

| Name | Value |
|---- | -----|
| EN | &quot;EN&quot; |
| NO | &quot;NO&quot; |
| FR | &quot;FR&quot; |
| DE | &quot;DE&quot; |
| ES | &quot;ES&quot; |
| BG | &quot;BG&quot; |
| CS | &quot;CS&quot; |
| DA | &quot;DA&quot; |
| IT | &quot;IT&quot; |
| NL | &quot;NL&quot; |
| PL | &quot;PL&quot; |
| PT | &quot;PT&quot; |
| RO | &quot;RO&quot; |
| RU | &quot;RU&quot; |
| SV | &quot;SV&quot; |
| DEFAULT | &quot;Default&quot; |
| JA | &quot;JA&quot; |
| TH | &quot;TH&quot; |
| ZH_CN | &quot;ZH_CN&quot; |
| ZH_TW | &quot;ZH_TW&quot; |
| KO | &quot;KO&quot; |



## Enum: SignTypeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;Single&quot; |
| GROUP | &quot;Group&quot; |



