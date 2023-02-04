package me.kevinschildhorn.common.design.theme.cedar

import me.kevinschildhorn.atomik.color.CustomColorSetTyped
import me.kevinschildhorn.atomik.color.base.AtomikColor

// https://www.figma.com/community/file/1057385750878897703
// https://rei.github.io/rei-cedar-docs/tokens/all-tokens/

enum class CedarColor(val value: String, val hex:Long) {
    BackgroundPrimary("color-background-primary",0xFFFFFF),
    BackgroundSecondary("color-background-secondary",0xF4F2ED),
    BackgroundSale("color-background-sale",0xC7370F65),
    BackgroundBrandSource("color-background-brand-spruce",0x1F513F),

    BackgroundButtonPrimary("cdr-color-background-button-primary-rest",0x1f513f),
    BackgroundButtonSecondary("cdr-color-background-button-secondary-rest",0xf9f8f6),
    BackgroundButtonSecondaryDisabled("cdr-color-background-button-secondary-disabled",0xf9f8f6),
    BackgroundButtonDark("cdr-color-background-button-dark-rest",0x4e4d49),
    BackgroundButtonSale("cdr-color-background-button-sale-rest",0xc7370f),
    BackgroundButtonDisabled("cdr-color-background-button-default-disabled",0xdcd6cb),

    // Primary / Secondary
    TextEmphasis("color-text-emphasis",0x030301),
    TextPrimary("color-text-primary",0x0C0B08),
    TextSecondary("color-text-secondary",0x4B423B2F),
    TextSale("color-text-sale",0xC7370F),
    TextBrand("color-text-brand",0x1F513F),
    TextDisabled("color-text-disabled",0xD1CBBD),
    TextInverse("color-text-inverse",0xF9F8F6),

    TextSuccess("cdr-color-text-success",0x2e6b34),
    TextWarning("cdr-color-text-warning",0x854714),
    TextError("cdr-color-text-error",0x811823),
    TextInfo("cdr-color-text-info",0x1b437e),
    TextMessageError("cdr-color-text-message-error",0xbb4045),

    TextButtonPrimary("cdr-color-text-button-primary",0xf9f8f6),
    TextButtonPrimaryDisabled("cdr-color-text-button-primary-disabled",0xffffff),
    TextButtonSecondary("cdr-color-text-button-secondary",0x4e4d49),
    TextButtonSecondaryDisabled("cdr-color-text-button-secondary-disabled",0xd1cbbd),
    TextButtonDark("cdr-color-text-button-dark",0xf9f8f6),
    TextButtonDarkDisabled("cdr-color-text-button-dark-disabled",0xffffff),
    TextButtonSale("cdr-color-text-button-sale",0xffffff),
    TextButtonSaleDisabled("cdr-color-text-button-sale-disabled",0xffffff),

    // Icons
    IconEmphasis("color-icon-emphasis",0x4E4D49),
    IconPrimary("color-icon-primary",0x928B80),
    IconDisabled("color-icon-disabled",0xDCD6CB),

    // Borders
    BorderPrimary("color-border-primary",0xDCD6CB),
    BorderSecondary("color-border-secondary",0x928B80),

    BorderButtonPrimary("cdr-color-border-button-primary-rest",0x1f513f),
    BorderButtonSecondary("cdr-color-border-button-secondary-rest",0x928b80),
    BorderButtonDark("cdr-color-border-button-dark-rest",0x4e4d49),
    BorderButtonSale("cdr-color-border-button-sale-rest",0xc7370f),
    BorderButtonDisabled("cdr-color-border-button-default-disabled",0xdcd6cb),

    // Links
    TextLinkRest("color-text-link-rest",0x406EB5),
    TextLinkVisited("color-text-link-visited",0x406EB5),
    TextLinkDisabled("color-text-link-disabled",0xD1CBBD),
}
/*
val cedarColorSet = CustomColorSetTyped(
    fallbackColor = AtomikColor(0x000000),
    colors = CedarColor.values().map { it.value to AtomikColor(it.hex) }.toMap()
)*/