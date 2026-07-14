

# WebhookContext


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  [optional] |
|**actor** | [**WebhookActorDetails**](WebhookActorDetails.md) |  |  [optional] |
|**previousState** | **Object** |  |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| SENT | &quot;Sent&quot; |
| SIGNED | &quot;Signed&quot; |
| COMPLETED | &quot;Completed&quot; |
| DECLINED | &quot;Declined&quot; |
| REVOKED | &quot;Revoked&quot; |
| REASSIGNED | &quot;Reassigned&quot; |
| EXPIRED | &quot;Expired&quot; |
| VIEWED | &quot;Viewed&quot; |
| AUTHENTICATION_FAILED | &quot;AuthenticationFailed&quot; |
| DELIVERY_FAILED | &quot;DeliveryFailed&quot; |
| VERIFICATION | &quot;Verification&quot; |
| SEND_FAILED | &quot;SendFailed&quot; |
| DRAFT_CREATED | &quot;DraftCreated&quot; |
| SENDER_IDENTITY_CREATED | &quot;SenderIdentityCreated&quot; |
| SENDER_IDENTITY_UPDATED | &quot;SenderIdentityUpdated&quot; |
| SENDER_IDENTITY_DELETED | &quot;SenderIdentityDeleted&quot; |
| SENDER_IDENTITY_REVOKED | &quot;SenderIdentityRevoked&quot; |
| SENDER_IDENTITY_VERIFIED | &quot;SenderIdentityVerified&quot; |
| SENDER_IDENTITY_DENIED | &quot;SenderIdentityDenied&quot; |
| TEMPLATE_CREATED | &quot;TemplateCreated&quot; |
| TEMPLATE_CREATE_FAILED | &quot;TemplateCreateFailed&quot; |
| TEMPLATE_DRAFT_CREATED | &quot;TemplateDraftCreated&quot; |
| TEMPLATE_SEND_FAILED | &quot;TemplateSendFailed&quot; |
| IDENTITY_VERIFICATION_INITIATED | &quot;IdentityVerificationInitiated&quot; |
| IDENTITY_VERIFICATION_SUCCEEDED | &quot;IdentityVerificationSucceeded&quot; |
| IDENTITY_VERIFICATION_FAILED | &quot;IdentityVerificationFailed&quot; |
| REMINDER | &quot;Reminder&quot; |
| EDITED | &quot;Edited&quot; |
| EDIT_FAILED | &quot;EditFailed&quot; |
| TEMPLATE_EDITED | &quot;TemplateEdited&quot; |
| SIGNER_SAVED | &quot;SignerSaved&quot; |
| KBA_INITIATED | &quot;KBAInitiated&quot; |
| KBA_SUCCEEDED | &quot;KBASucceeded&quot; |
| KBA_FAILED | &quot;KBAFailed&quot; |



