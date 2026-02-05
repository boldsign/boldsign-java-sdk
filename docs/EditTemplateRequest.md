

# EditTemplateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**documentTitle** | **String** |  |  [optional] |
|**documentMessage** | **String** |  |  [optional] |
|**roles** | [**List&lt;TemplateRole&gt;**](TemplateRole.md) |  |  [optional] |
|**cc** | [**List&lt;DocumentCC&gt;**](DocumentCC.md) |  |  [optional] |
|**brandId** | **String** |  |  [optional] |
|**allowMessageEditing** | **Boolean** |  |  [optional] |
|**allowNewRoles** | **Boolean** |  |  [optional] |
|**allowNewFiles** | **Boolean** |  |  [optional] |
|**enableReassign** | **Boolean** |  |  [optional] |
|**enablePrintAndSign** | **Boolean** |  |  [optional] |
|**enableSigningOrder** | **Boolean** |  |  [optional] |
|**documentInfo** | [**List&lt;DocumentInfo&gt;**](DocumentInfo.md) |  |  [optional] |
|**onBehalfOf** | **String** |  |  [optional] |
|**labels** | **List&lt;String&gt;** |  |  [optional] |
|**templateLabels** | **List&lt;String&gt;** |  |  [optional] |
|**formGroups** | [**List&lt;FormGroup&gt;**](FormGroup.md) |  |  [optional] |
|**recipientNotificationSettings** | [**RecipientNotificationSettings**](RecipientNotificationSettings.md) |  |  [optional] |
|**allowedSignatureTypes** | [**List&lt;AllowedSignatureTypesEnum&gt;**](#List&lt;AllowedSignatureTypesEnum&gt;) |  |  [optional] |
|**formFieldPermission** | [**FormFieldPermission**](FormFieldPermission.md) |  |  [optional] |
|**groupSignerSettings** | [**GroupSignerSettings**](GroupSignerSettings.md) |  |  [optional] |



## Enum: List&lt;AllowedSignatureTypesEnum&gt;

| Name | Value |
|---- | -----|
| TEXT | &quot;Text&quot; |
| DRAW | &quot;Draw&quot; |
| IMAGE | &quot;Image&quot; |



