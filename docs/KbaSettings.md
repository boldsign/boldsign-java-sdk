

# KbaSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**maximumRetryCount** | **Integer** |  |  [optional] |
|**nameMatcher** | [**NameMatcherEnum**](#NameMatcherEnum) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| EVERY_ACCESS | &quot;EveryAccess&quot; |
| UNTIL_SIGN_COMPLETED | &quot;UntilSignCompleted&quot; |
| ONCE_PER_DOCUMENT | &quot;OncePerDocument&quot; |



## Enum: NameMatcherEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| LENIENT | &quot;Lenient&quot; |
| MODERATE | &quot;Moderate&quot; |
| STRICT | &quot;Strict&quot; |



