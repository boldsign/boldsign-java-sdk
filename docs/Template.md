

# Template


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | **String** |  |  [optional] |
|**senderDetail** | [**TemplateSenderDetails**](TemplateSenderDetails.md) |  |  [optional] |
|**ccDetails** | [**List&lt;TemplateCC&gt;**](TemplateCC.md) |  |  [optional] |
|**createdDate** | **Long** |  |  [optional] |
|**activityDate** | **Long** |  |  [optional] |
|**activityBy** | **String** |  |  [optional] |
|**messageTitle** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**signerDetails** | [**List&lt;TemplateSignerDetails&gt;**](TemplateSignerDetails.md) |  |  [optional] |
|**enableSigningOrder** | **Boolean** |  |  [optional] |
|**templateName** | **String** |  |  [optional] |
|**templateDescription** | **String** |  |  [optional] |
|**accessType** | [**AccessTypeEnum**](#AccessTypeEnum) |  |  [optional] |
|**accessTid** | **String** |  |  [optional] |
|**isTemplate** | **Boolean** |  |  [optional] |
|**behalfOf** | [**BehalfOf**](BehalfOf.md) |  |  [optional] |
|**templateLabels** | **List&lt;String&gt;** |  |  [optional] |
|**labels** | **List&lt;String&gt;** |  |  [optional] |
|**brandId** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;InProgress&quot; |
| COMPLETED | &quot;Completed&quot; |
| DECLINED | &quot;Declined&quot; |
| EXPIRED | &quot;Expired&quot; |
| REVOKED | &quot;Revoked&quot; |
| DRAFT | &quot;Draft&quot; |



## Enum: AccessTypeEnum

| Name | Value |
|---- | -----|
| USE | &quot;Use&quot; |
| EDIT | &quot;Edit&quot; |
| NONE | &quot;None&quot; |



