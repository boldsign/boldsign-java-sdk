

# EmbeddedCreateTemplateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  |
|**redirectUrl** | **URI** |  |  [optional] |
|**showToolbar** | **Boolean** |  |  [optional] |
|**viewOption** | [**ViewOptionEnum**](#ViewOptionEnum) |  |  [optional] |
|**showSaveButton** | **Boolean** |  |  [optional] |
|**locale** | [**LocaleEnum**](#LocaleEnum) |  |  [optional] |
|**showSendButton** | **Boolean** |  |  [optional] |
|**showCreateButton** | **Boolean** |  |  [optional] |
|**showPreviewButton** | **Boolean** |  |  [optional] |
|**showNavigationButtons** | **Boolean** |  |  [optional] |
|**linkValidTill** | **OffsetDateTime** |  |  [optional] |
|**showTooltip** | **Boolean** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**documentTitle** | **String** |  |  [optional] |
|**documentMessage** | **String** |  |  [optional] |
|**files** | **List&lt;File&gt;** |  |  [optional] |
|**fileUrls** | **List&lt;URI&gt;** |  |  [optional] |
|**roles** | [**List&lt;TemplateRole&gt;**](TemplateRole.md) |  |  [optional] |
|**allowModifyFiles** | **Boolean** |  |  [optional] |
|**cc** | [**List&lt;DocumentCC&gt;**](DocumentCC.md) |  |  [optional] |
|**brandId** | **String** |  |  [optional] |
|**allowMessageEditing** | **Boolean** |  |  [optional] |
|**allowNewRoles** | **Boolean** |  |  [optional] |
|**allowNewFiles** | **Boolean** |  |  [optional] |
|**enableReassign** | **Boolean** |  |  [optional] |
|**enablePrintAndAssign** | **Boolean** |  |  [optional] |
|**enableSigningOrder** | **Boolean** |  |  [optional] |
|**documentInfo** | [**List&lt;DocumentInfo&gt;**](DocumentInfo.md) |  |  [optional] |
|**useTextTags** | **Boolean** |  |  [optional] |
|**textTagDefinitions** | [**List&lt;TextTagDefinition&gt;**](TextTagDefinition.md) |  |  [optional] |
|**autoDetectFields** | **Boolean** |  |  [optional] |
|**onBehalfOf** | **String** |  |  [optional] |
|**labels** | **List&lt;String&gt;** |  |  [optional] |
|**templateLabels** | **List&lt;String&gt;** |  |  [optional] |
|**recipientNotificationSettings** | [**RecipientNotificationSettings**](RecipientNotificationSettings.md) |  |  [optional] |
|**formGroups** | [**List&lt;FormGroup&gt;**](FormGroup.md) |  |  [optional] |



## Enum: ViewOptionEnum

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



