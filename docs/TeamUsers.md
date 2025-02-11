

# TeamUsers


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**userRole** | [**UserRoleEnum**](#UserRoleEnum) |  |  [optional] |
|**userStatus** | [**UserStatusEnum**](#UserStatusEnum) |  |  [optional] |



## Enum: UserRoleEnum

| Name | Value |
|---- | -----|
| ACCOUNT_ADMIN | &quot;AccountAdmin&quot; |
| TEAM_ADMIN | &quot;TeamAdmin&quot; |
| TEAM_MEMBER | &quot;TeamMember&quot; |



## Enum: UserStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;Active&quot; |
| INVITATION_PENDING | &quot;InvitationPending&quot; |
| DEACTIVATED | &quot;Deactivated&quot; |



