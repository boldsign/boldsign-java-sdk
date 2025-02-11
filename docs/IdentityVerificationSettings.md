

# IdentityVerificationSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**maximumRetryCount** | **Integer** |  |  [optional] |
|**requireLiveCapture** | **Boolean** |  |  [optional] |
|**requireMatchingSelfie** | **Boolean** |  |  [optional] |
|**nameMatcher** | [**NameMatcherEnum**](#NameMatcherEnum) |  |  [optional] |
|**holdForPrefill** | **Boolean** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EVERY_ACCESS | &quot;EveryAccess&quot; |
| UNTIL_SIGN_COMPLETED | &quot;UntilSignCompleted&quot; |
| ONCE_PER_DOCUMENT | &quot;OncePerDocument&quot; |



## Enum: NameMatcherEnum

| Name | Value |
|---- | -----|
| STRICT | &quot;Strict&quot; |
| MODERATE | &quot;Moderate&quot; |
| LENIENT | &quot;Lenient&quot; |



