

# FormField


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fieldType** | [**FieldTypeEnum**](#FieldTypeEnum) |  |  |
|**pageNumber** | **Integer** |  |  |
|**bounds** | [**Rectangle**](Rectangle.md) |  |  |
|**id** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**isRequired** | **Boolean** |  |  [optional] |
|**isReadOnly** | **Boolean** |  |  [optional] |
|**value** | **String** |  |  [optional] |
|**fontSize** | **Float** |  |  [optional] |
|**font** | [**FontEnum**](#FontEnum) |  |  [optional] |
|**fontHexColor** | **String** |  |  [optional] |
|**isBoldFont** | **Boolean** |  |  [optional] |
|**isItalicFont** | **Boolean** |  |  [optional] |
|**isUnderLineFont** | **Boolean** |  |  [optional] |
|**lineHeight** | **Integer** |  |  [optional] |
|**characterLimit** | **Integer** |  |  [optional] |
|**groupName** | **String** |  |  [optional] |
|**label** | **String** |  |  [optional] |
|**placeHolder** | **String** |  |  [optional] |
|**validationType** | [**ValidationTypeEnum**](#ValidationTypeEnum) |  |  [optional] |
|**validationCustomRegex** | **String** |  |  [optional] |
|**validationCustomRegexMessage** | **String** |  |  [optional] |
|**dateFormat** | **String** |  |  [optional] |
|**timeFormat** | **String** |  |  [optional] |
|**imageInfo** | [**ImageInfo**](ImageInfo.md) |  |  [optional] |
|**attachmentInfo** | [**AttachmentInfo**](AttachmentInfo.md) |  |  [optional] |
|**editableDateFieldSettings** | [**EditableDateFieldSettings**](EditableDateFieldSettings.md) |  |  [optional] |
|**hyperlinkText** | **String** |  |  [optional] |
|**conditionalRules** | [**List&lt;ConditionalRule&gt;**](ConditionalRule.md) |  |  [optional] |
|**dataSyncTag** | **String** |  |  [optional] |
|**dropdownOptions** | **List&lt;String&gt;** |  |  [optional] |
|**textAlign** | [**TextAlignEnum**](#TextAlignEnum) |  |  [optional] |
|**textDirection** | [**TextDirectionEnum**](#TextDirectionEnum) |  |  [optional] |
|**characterSpacing** | **Float** |  |  [optional] |
|**backgroundHexColor** | **String** |  |  [optional] |
|**tabIndex** | **Integer** |  |  [optional] |
|**formulaFieldSettings** | [**FormulaFieldSettings**](FormulaFieldSettings.md) |  |  [optional] |



## Enum: FieldTypeEnum

| Name | Value |
|---- | -----|
| SIGNATURE | &quot;Signature&quot; |
| INITIAL | &quot;Initial&quot; |
| CHECK_BOX | &quot;CheckBox&quot; |
| TEXT_BOX | &quot;TextBox&quot; |
| LABEL | &quot;Label&quot; |
| DATE_SIGNED | &quot;DateSigned&quot; |
| RADIO_BUTTON | &quot;RadioButton&quot; |
| IMAGE | &quot;Image&quot; |
| ATTACHMENT | &quot;Attachment&quot; |
| EDITABLE_DATE | &quot;EditableDate&quot; |
| HYPERLINK | &quot;Hyperlink&quot; |
| DROPDOWN | &quot;Dropdown&quot; |
| TITLE | &quot;Title&quot; |
| COMPANY | &quot;Company&quot; |
| FORMULA | &quot;Formula&quot; |



## Enum: FontEnum

| Name | Value |
|---- | -----|
| HELVETICA | &quot;Helvetica&quot; |
| COURIER | &quot;Courier&quot; |
| TIMES_ROMAN | &quot;TimesRoman&quot; |
| NOTO_SANS | &quot;NotoSans&quot; |



## Enum: ValidationTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| NUMBERS_ONLY | &quot;NumbersOnly&quot; |
| EMAIL_ADDRESS | &quot;EmailAddress&quot; |
| CURRENCY | &quot;Currency&quot; |
| CUSTOM_REGEX | &quot;CustomRegex&quot; |



## Enum: TextAlignEnum

| Name | Value |
|---- | -----|
| LEFT | &quot;Left&quot; |
| CENTER | &quot;Center&quot; |
| RIGHT | &quot;Right&quot; |



## Enum: TextDirectionEnum

| Name | Value |
|---- | -----|
| LTR | &quot;LTR&quot; |
| RTL | &quot;RTL&quot; |



