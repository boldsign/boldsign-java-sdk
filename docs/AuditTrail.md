

# AuditTrail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**toName** | **String** |  |  [optional] |
|**toEmail** | **String** |  |  [optional] |
|**ipaddress** | **String** |  |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) |  |  [optional] |
|**timestamp** | **Long** |  |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| SENT | &quot;Sent&quot; |
| VIEWED | &quot;Viewed&quot; |
| SIGNED | &quot;Signed&quot; |
| COMPLETED | &quot;Completed&quot; |
| DOWNLOADED | &quot;Downloaded&quot; |
| REASSIGNED | &quot;Reassigned&quot; |
| DECLINED | &quot;Declined&quot; |
| RECALLED | &quot;Recalled&quot; |
| CREATED | &quot;Created&quot; |
| AUTHENTICATION_FAILED | &quot;AuthenticationFailed&quot; |
| REMINDER | &quot;Reminder&quot; |
| ACCESS_CODE_CHANGED | &quot;AccessCodeChanged&quot; |
| ACCESS_CODE_VIEWED | &quot;AccessCodeViewed&quot; |
| DOWNLOADED_FOR_PRINT_SIGN | &quot;DownloadedForPrintSign&quot; |
| FORM_CREATED | &quot;FormCreated&quot; |
| EMAIL_OTP | &quot;EmailOTP&quot; |
| AUTHENTICATION_REMOVED | &quot;AuthenticationRemoved&quot; |
| DOWNLOADED_AUDIT_TRAIL | &quot;DownloadedAuditTrail&quot; |
| CLONED | &quot;Cloned&quot; |
| CLONED_WITH_FIELD_VALUES | &quot;ClonedWithFieldValues&quot; |
| DELETED | &quot;Deleted&quot; |
| MOVED_TO_TRASH | &quot;MovedToTrash&quot; |
| RESTORED | &quot;Restored&quot; |
| AUTO_REMINDER | &quot;AutoReminder&quot; |
| RESEND | &quot;Resend&quot; |
| REVIEWED | &quot;Reviewed&quot; |
| INITIATE_PRINT_SIGN | &quot;InitiatePrintSign&quot; |
| CANCEL_PRINT_SIGN | &quot;CancelPrintSign&quot; |
| COMPLETE_PRINT_SIGN | &quot;CompletePrintSign&quot; |
| GENERATED_EMBEDDED_SIGN_LINK | &quot;GeneratedEmbeddedSignLink&quot; |
| EMBEDDED_SIGNED | &quot;EmbeddedSigned&quot; |
| EMBEDDED_REVIEWED | &quot;EmbeddedReviewed&quot; |
| EXPIRY_DATE_EXTENDED | &quot;ExpiryDateExtended&quot; |
| ATTACHMENT | &quot;Attachment&quot; |
| EDIT_RECIPIENT | &quot;EditRecipient&quot; |
| AUTHENTICATION_ADDED | &quot;AuthenticationAdded&quot; |
| AUTO_REMINDER_ON | &quot;AutoReminderON&quot; |
| AUTO_REMINDER_OFF | &quot;AutoReminderOFF&quot; |
| SMSOTP | &quot;SMSOTP&quot; |
| PHONE_NUMBER_CHANGED | &quot;PhoneNumberChanged&quot; |
| UNLOCKED_SMSOTP | &quot;UnlockedSMSOTP&quot; |
| SMS_AUTHENTICATION_ADDED | &quot;SMSAuthenticationAdded&quot; |
| SMS_AUTHENTICATION_REMOVED | &quot;SMSAuthenticationRemoved&quot; |
| SMSOTP_VERIFIED | &quot;SMSOTPVerified&quot; |
| SMS_AUTHENTICATION_FAILED | &quot;SMSAuthenticationFailed&quot; |
| UNLOCK_EMAIL_OTP | &quot;UnlockEmailOTP&quot; |
| EMAIL_AUTHENTICATION_ADDED | &quot;EmailAuthenticationAdded&quot; |
| EMAIL_AUTHENTICATION_REMOVED | &quot;EmailAuthenticationRemoved&quot; |
| EMAIL_OTP_VERIFY | &quot;EmailOtpVerify&quot; |
| EMAIL_AUTHENTICATION_FAILED | &quot;EmailAuthenticationFailed&quot; |
| SMSOTP_RESEND | &quot;SMSOTPResend&quot; |
| EMAIL_OTP_RESEND | &quot;EmailOTPResend&quot; |
| RESUME_DOCUMENT_SIGNING | &quot;ResumeDocumentSigning&quot; |
| EMAIL_OTP_AUTHENTICATION_ADDED | &quot;EmailOTPAuthenticationAdded&quot; |
| EMAIL_OTP_AUTHENTICATION_REMOVED | &quot;EmailOTPAuthenticationRemoved&quot; |
| EMAIL_OTP_AUTHENTICATION_FAILED | &quot;EmailOTPAuthenticationFailed&quot; |
| EMAIL_OTP_VERIFIED | &quot;EmailOTPVerified&quot; |
| IDENTITY_VERIFICATION_INITIATED | &quot;IdentityVerificationInitiated&quot; |
| IDENTITY_VERIFICATION_REMOVED | &quot;IdentityVerificationRemoved&quot; |
| IDENTITY_VERIFICATION_COMPLETED | &quot;IdentityVerificationCompleted&quot; |
| IDENTITY_VERIFICATION_FAILED | &quot;IdentityVerificationFailed&quot; |
| DOWNLOADED_VERIFICATION_DATA | &quot;DownloadedVerificationData&quot; |
| MANUAL_IDENTITY_VERIFICATION_COMPLETED | &quot;ManualIdentityVerificationCompleted&quot; |
| IDENTITY_VERIFICATION_RESET | &quot;IdentityVerificationReset&quot; |
| CREATE_EMBEDDED_VERIFICATION_LINK | &quot;CreateEmbeddedVerificationLink&quot; |
| SENSITIVE_DATA_DOWNLOADED | &quot;SensitiveDataDownloaded&quot; |
| ID_VERIFICATION_REMOVED | &quot;IdVerificationRemoved&quot; |
| ID_VERIFICATION_ADDED | &quot;IdVerificationAdded&quot; |
| MANUAL_IDENTITY_VERIFICATION_INITIATED | &quot;ManualIdentityVerificationInitiated&quot; |
| GENERATED_SIGNING_LINK | &quot;GeneratedSigningLink&quot; |
| EDITING_INITIATED | &quot;EditingInitiated&quot; |
| EDITING_CANCELLED | &quot;EditingCancelled&quot; |
| EDITING_COMPLETED | &quot;EditingCompleted&quot; |
| QES_VERIFICATION_INITIATED | &quot;QESVerificationInitiated&quot; |
| QES_VERIFIED | &quot;QESVerified&quot; |
| QES_REJECTED | &quot;QESRejected&quot; |
| QES_EXPIRED | &quot;QESExpired&quot; |
| QES_WITHDRAWN | &quot;QESWithdrawn&quot; |



