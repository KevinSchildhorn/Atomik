package me.kevinschildhorn.common.design.theme.cedar

import me.kevinschildhorn.atomik.typography.CustomTypographySet
import me.kevinschildhorn.atomik.typography.CustomTypographySetTyped
import me.kevinschildhorn.atomik.typography.base.AtomikTypography
import me.kevinschildhorn.atomik.typography.base.AtomikTypographyWeight
import me.kevinschildhorn.atomik.typography.base.TypographyType

//https://www.figma.com/community/file/1057382149759850021
// https://rei.github.io/rei-cedar-docs/tokens/all-tokens/

/*
text
header
cdr_text_default_display_1_size	34.00sp
cdr_text_default_display_1_line_spacing	40.00dp
cdr_text_default_display_1_font_family	Stuart-App-Medium.otf
cdr_text_default_title_1_size	26.00sp
cdr_text_default_title_1_line_spacing	36.00dp
cdr_text_default_title_1_font_family	Stuart-App-Semibold.otf
cdr_text_default_title_2_size	24.00sp
cdr_text_default_title_2_line_spacing	32.00dp
cdr_text_default_title_2_font_family	Stuart-App-Semibold.otf
cdr_text_default_title_3_size	19.00sp
cdr_text_default_title_3_line_spacing	28.00dp
cdr_text_default_title_3_font_family	Stuart-App-Semibold.otf
cdr_text_default_headline_size	17.00sp
cdr_text_default_headline_line_spacing	24.00dp
cdr_text_default_subheadline_size	15.00sp
cdr_text_default_subheadline_line_spacing	20.00dp
body
cdr_text_default_body_1_size	15.00sp
cdr_text_default_body_1_line_spacing	20.00dp
cdr_text_default_body_2_size	12.00sp
cdr_text_default_body_2_line_spacing	18.00dp
cdr_text_default_caption_1_size	12.00sp
cdr_text_default_caption_1_line_spacing	16.00dp
cdr_text_default_caption_2_size	11.00sp
cdr_text_default_caption_2_line_spacing	16.00dp
button
cdr_text_default_button_size	15.00sp
cdr_text_default_button_line_spacing	24.00dp
 */

// Stuart App
enum class CedarTypography(val value: String, val type: TypographyType, val typography: AtomikTypography) {
    Display("cdr_text_default_display"),
    Title1("cdr_text_default_title_1"),
    Title2("cdr_text_default_title_2"),
    Title3("cdr_text_default_title_3"),
    Headline("cdr_text_default_headline"),
    Subheadline("cdr_text_default_subheadline"),
    Body1("cdr_text_default_body_1"),
    Body2("cdr_text_default_body_2"),
    Caption1("cdr_text_default_caption_1"),
    Caption2("cdr_text_default_caption_2"),
    Button("cdr_text_default_button"),
}

val cedarTypographySet = CustomTypographySet(
    fallbackTypography = AtomikTypography(size = 14),
    typographies = CedarTypography.values().map {
        it.type to it.typography
    }.toMap()
)