

# TemplateEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | **String** |  |  [optional] |
|**templateId** | **String** |  |  [optional] |
|**allowNewFiles** | **Boolean** |  |  [optional] |
|**allowModifyFiles** | **Boolean** |  |  [optional] |
|**senderDetail** | [**TemplateSender**](TemplateSender.md) |  |  [optional] |
|**ccDetails** | [**List&lt;TemplateCcWebhookModel&gt;**](TemplateCcWebhookModel.md) |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**activityDate** | **OffsetDateTime** |  |  [optional] |
|**activityBy** | **String** |  |  [optional] |
|**messageTitle** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**signerDetails** | [**List&lt;TemplateSigner&gt;**](TemplateSigner.md) |  |  [optional] |
|**enableSigningOrder** | **Boolean** |  |  [optional] |
|**templateName** | **String** |  |  [optional] |
|**templateDescription** | **String** |  |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**isTemplate** | **Boolean** |  |  [optional] |
|**brandId** | **String** |  |  [optional] |
|**onBehalfOf** | **String** |  |  [optional] |
|**labels** | **List&lt;String&gt;** |  |  [optional] |
|**templateLabels** | **List&lt;String&gt;** |  |  [optional] |
|**formFieldPermission** | [**FormFieldPermissionWebhookModel**](FormFieldPermissionWebhookModel.md) |  |  [optional] |
|**groupSignerSettings** | [**GroupSignerSettingsWebhookModel**](GroupSignerSettingsWebhookModel.md) |  |  [optional] |
|**behalfOf** | [**BehalfOfWebhookModel**](BehalfOfWebhookModel.md) |  |  [optional] |
|**enableAllowSignEverywhere** | **Boolean** |  |  [optional] |
|**documentTimeZone** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;InProgress&quot; |
| COMPLETED | &quot;Completed&quot; |
| DECLINED | &quot;Declined&quot; |
| EXPIRED | &quot;Expired&quot; |
| REVOKED | &quot;Revoked&quot; |
| DRAFT | &quot;Draft&quot; |
| SCHEDULED | &quot;Scheduled&quot; |



