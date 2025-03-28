

# Role


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**roleIndex** | **Integer** |  |  [optional] |
|**signerName** | **String** |  |  [optional] |
|**signerOrder** | **Integer** |  |  [optional] |
|**signerEmail** | **String** |  |  [optional] |
|**hostEmail** | **String** |  |  [optional] |
|**privateMessage** | **String** |  |  [optional] |
|**authenticationCode** | **String** |  |  [optional] |
|**enableEmailOTP** | **Boolean** |  |  [optional] |
|**authenticationType** | [**AuthenticationTypeEnum**](#AuthenticationTypeEnum) |  |  [optional] |
|**phoneNumber** | [**PhoneNumber**](PhoneNumber.md) |  |  [optional] |
|**deliveryMode** | [**DeliveryModeEnum**](#DeliveryModeEnum) |  |  [optional] |
|**signerType** | [**SignerTypeEnum**](#SignerTypeEnum) |  |  [optional] |
|**signerRole** | **String** |  |  [optional] |
|**allowFieldConfiguration** | **Boolean** |  |  [optional] |
|**formFields** | [**List&lt;FormField&gt;**](FormField.md) |  |  [optional] |
|**existingFormFields** | [**List&lt;ExistingFormField&gt;**](ExistingFormField.md) |  |  [optional] |
|**identityVerificationSettings** | [**IdentityVerificationSettings**](IdentityVerificationSettings.md) |  |  [optional] |
|**language** | [**LanguageEnum**](#LanguageEnum) | &lt;p&gt;Description:&lt;/p&gt;&lt;ul&gt;&lt;li&gt;&lt;i&gt;0&lt;/i&gt; - None&lt;/li&gt;&lt;li&gt;&lt;i&gt;1&lt;/i&gt; - English&lt;/li&gt;&lt;li&gt;&lt;i&gt;2&lt;/i&gt; - Spanish&lt;/li&gt;&lt;li&gt;&lt;i&gt;3&lt;/i&gt; - German&lt;/li&gt;&lt;li&gt;&lt;i&gt;4&lt;/i&gt; - French&lt;/li&gt;&lt;li&gt;&lt;i&gt;5&lt;/i&gt; - Romanian&lt;/li&gt;&lt;li&gt;&lt;i&gt;6&lt;/i&gt; - Norwegian&lt;/li&gt;&lt;li&gt;&lt;i&gt;7&lt;/i&gt; - Bulgarian&lt;/li&gt;&lt;li&gt;&lt;i&gt;8&lt;/i&gt; - Italian&lt;/li&gt;&lt;li&gt;&lt;i&gt;9&lt;/i&gt; - Danish&lt;/li&gt;&lt;li&gt;&lt;i&gt;10&lt;/i&gt; - Polish&lt;/li&gt;&lt;li&gt;&lt;i&gt;11&lt;/i&gt; - Portuguese&lt;/li&gt;&lt;li&gt;&lt;i&gt;12&lt;/i&gt; - Czech&lt;/li&gt;&lt;li&gt;&lt;i&gt;13&lt;/i&gt; - Dutch&lt;/li&gt;&lt;li&gt;&lt;i&gt;14&lt;/i&gt; - Swedish&lt;/li&gt;&lt;li&gt;&lt;i&gt;15&lt;/i&gt; - Russian&lt;/li&gt;&lt;/ul&gt; |  [optional] |
|**locale** | [**LocaleEnum**](#LocaleEnum) |  |  [optional] |
|**recipientNotificationSettings** | [**RecipientNotificationSettings**](RecipientNotificationSettings.md) |  |  [optional] |
|**authenticationRetryCount** | **Integer** |  |  [optional] |
|**enableQes** | **Boolean** |  |  [optional] |



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



