

# DocumentFormFields


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**value** | **String** |  |  [optional] |
|**font** | **String** |  |  [optional] |
|**isRequired** | **Boolean** |  |  [optional] |
|**isReadOnly** | **Boolean** |  |  [optional] |
|**lineHeight** | **Float** |  |  [optional] |
|**fontSize** | **Float** |  |  [optional] |
|**fontColor** | **String** |  |  [optional] |
|**isUnderline** | **Boolean** |  |  [optional] |
|**isItalic** | **Boolean** |  |  [optional] |
|**isBold** | **Boolean** |  |  [optional] |
|**groupName** | **String** |  |  [optional] |
|**label** | **String** |  |  [optional] |
|**placeholder** | **String** |  |  [optional] |
|**validationtype** | [**ValidationtypeEnum**](#ValidationtypeEnum) |  |  [optional] |
|**validationCustomRegex** | **String** |  |  [optional] |
|**validationCustomRegexMessage** | **String** |  |  [optional] |
|**dateFormat** | **String** |  |  [optional] |
|**timeFormat** | **String** |  |  [optional] |
|**imageInfo** | [**ImageInfo**](ImageInfo.md) |  |  [optional] |
|**attachmentInfo** | [**AttachmentInfo**](AttachmentInfo.md) |  |  [optional] |
|**fileInfo** | [**FileInfo**](FileInfo.md) |  |  [optional] |
|**editableDateFieldSettings** | [**EditableDateFieldSettings**](EditableDateFieldSettings.md) |  |  [optional] |
|**hyperlinkText** | **String** |  |  [optional] |
|**conditionalRules** | [**List&lt;ConditionalRule&gt;**](ConditionalRule.md) |  |  [optional] |
|**bounds** | [**Rectangle**](Rectangle.md) |  |  [optional] |
|**pageNumber** | **Integer** |  |  [optional] |
|**dataSyncTag** | **String** |  |  [optional] |
|**dropdownOptions** | **List&lt;String&gt;** |  |  [optional] |
|**textAlign** | [**TextAlignEnum**](#TextAlignEnum) |  |  [optional] |
|**textDirection** | [**TextDirectionEnum**](#TextDirectionEnum) |  |  [optional] |
|**characterSpacing** | **Float** |  |  [optional] |
|**backgroundHexColor** | **String** |  |  [optional] |
|**tabIndex** | **Integer** |  |  [optional] |
|**formulaFieldSettings** | [**FormulaFieldSettings**](FormulaFieldSettings.md) |  |  [optional] |



## Enum: ValidationtypeEnum

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



