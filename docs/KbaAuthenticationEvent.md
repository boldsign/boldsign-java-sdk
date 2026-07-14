

# KbaAuthenticationEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | **String** |  |  [optional] |
|**documentId** | **String** |  |  [optional] |
|**messageTitle** | **String** |  |  [optional] |
|**documentDescription** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**senderDetail** | [**DocumentSender**](DocumentSender.md) |  |  [optional] |
|**signerDetail** | [**DocumentSignerWebhookModel**](DocumentSignerWebhookModel.md) |  |  [optional] |



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



