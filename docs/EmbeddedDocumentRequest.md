

# EmbeddedDocumentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**redirectUrl** | **URI** |  |  [optional] |
|**showToolbar** | **Boolean** |  |  [optional] |
|**sendViewOption** | [**SendViewOptionEnum**](#SendViewOptionEnum) |  |  [optional] |
|**showSaveButton** | **Boolean** |  |  [optional] |
|**locale** | [**LocaleEnum**](#LocaleEnum) |  |  [optional] |
|**showSendButton** | **Boolean** |  |  [optional] |
|**showPreviewButton** | **Boolean** |  |  [optional] |
|**showNavigationButtons** | **Boolean** |  |  [optional] |
|**showTooltip** | **Boolean** |  |  [optional] |
|**embeddedSendLinkValidTill** | **OffsetDateTime** |  |  [optional] |
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
|**metaData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**formGroups** | [**List&lt;FormGroup&gt;**](FormGroup.md) |  |  [optional] |
|**enableAuditTrailLocalization** | **Boolean** |  |  [optional] |
|**downloadFileName** | **String** |  |  [optional] |



## Enum: SendViewOptionEnum

| Name | Value |
|---- | -----|
| PREPARE_PAGE | &quot;PreparePage&quot; |
| FILLING_PAGE | &quot;FillingPage&quot; |



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



