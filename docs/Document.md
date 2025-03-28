

# Document


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | **String** |  |  [optional] |
|**senderDetail** | [**DocumentSenderDetail**](DocumentSenderDetail.md) |  |  [optional] |
|**ccDetails** | [**List&lt;DocumentCcDetails&gt;**](DocumentCcDetails.md) |  |  [optional] |
|**createdDate** | **Long** |  |  [optional] |
|**activityDate** | **Long** |  |  [optional] |
|**activityBy** | **String** |  |  [optional] |
|**messageTitle** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**signerDetails** | [**List&lt;DocumentSignerDetails&gt;**](DocumentSignerDetails.md) |  |  [optional] |
|**expiryDate** | **Long** |  |  [optional] |
|**enableSigningOrder** | **Boolean** |  |  [optional] |
|**isDeleted** | **Boolean** |  |  [optional] |
|**labels** | **List&lt;String&gt;** |  |  [optional] |
|**cursor** | **Long** |  |  [optional] |
|**brandId** | **String** |  |  [optional] |
|**scheduledSendTime** | **Long** |  |  [optional] |



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



