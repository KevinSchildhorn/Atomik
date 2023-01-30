package me.kevinschildhorn.common.design.theme.cedar

import me.kevinschildhorn.atomik.color.CustomColorSetTyped
import me.kevinschildhorn.atomik.color.base.AtomikColor

// https://www.figma.com/community/file/1057385750878897703
// https://rei.github.io/rei-cedar-docs/tokens/all-tokens/

enum class CedarColor(val value: String) {
    BackgroundPrimary("color-background-primary"),
    BackgroundSecondary("color-background-secondary"),
    BackgroundSale("color-background-sale"),
    BackgroundBrandSource("color-background-brand-spruce"),

    BackgroundButtonPrimary("cdr-color-background-button-primary-rest"),
    BackgroundButtonSecondary("cdr-color-background-button-secondary-rest"),
    BackgroundButtonSecondaryDisabled("cdr-color-background-button-secondary-disabled"),
    BackgroundButtonDark("cdr-color-background-button-dark-rest"),
    BackgroundButtonSale("cdr-color-background-button-sale-rest"),
    BackgroundButtonDisabled("cdr-color-background-button-default-disabled"),

    // Primary / Secondary
    TextEmphasis("color-text-emphasis"),
    TextPrimary("color-text-primary"),
    TextSecondary("color-text-secondary"),
    TextSale("color-text-sale"),
    TextBrand("color-text-brand"),
    TextDisabled("color-text-disabled"),
    TextInverse("color-text-inverse"),

    TextSuccess("cdr-color-text-success #2e6b34"),
    TextWarning("cdr-color-text-warning #854714"),
    TextError("cdr-color-text-error #811823"),
    TextInfo("cdr-color-text-info #1b437e"),
    TextMessageError("cdr-color-text-message-error #bb4045"),

    TextButtonPrimary("cdr-color-text-button-primary "),
    TextButtonPrimaryDisabled("cdr-color-text-button-primary-disabled"),
    TextButtonSecondary("cdr-color-text-button-secondary"),
    TextButtonSecondaryDisabled("cdr-color-text-button-secondary-disabled"),
    TextButtonDark("cdr-color-text-button-dark"),
    TextButtonDarkDisabled("cdr-color-text-button-dark-disabled"),
    TextButtonSale("cdr-color-text-button-sale"),
    TextButtonSaleDisabled("cdr-color-text-button-sale-disabled"),

    // Icons
    IconEmphasis("color-icon-emphasis"),
    IconPrimary("color-icon-primary"),
    IconDisabled("color-icon-disabled"),

    // Borders
    BorderPrimary("color-border-primary"),
    BorderSecondary("color-border-secondary"),

    BorderButtonPrimary("cdr-color-border-button-primary-rest"), //#1f513f
    BorderButtonSecondary("cdr-color-border-button-secondary-rest"), //#928b80
    BorderButtonDark("cdr-color-border-button-dark-rest"), //#4e4d49
    BorderButtonSale("cdr-color-border-button-sale-rest"), //#c7370f
    BorderButtonDisabled("cdr-color-border-button-default-disabled"), //#dcd6cb

    // Links
    TextLinkRest("color-text-link-rest"),
    TextLinkVisited("color-text-link-visited"),
    TextLinkDisabled("color-text-link-disabled"),
}

val cedarColorSet = CustomColorSetTyped(
    fallbackColor = AtomikColor(0x000000),
    colors = mapOf(
        CedarColor.BackgroundPrimary to AtomikColor(0xFFFFFF),
        CedarColor.BackgroundSecondary to AtomikColor(0xF4F2ED),
        CedarColor.BackgroundSale to AtomikColor(0xC7370F),
        CedarColor.BackgroundBrandSource to AtomikColor(0x1F513F),
        CedarColor.BackgroundButtonPrimary to AtomikColor(0x1f513f),
        CedarColor.BackgroundButtonSecondary to AtomikColor(0xf9f8f6),
        CedarColor.BackgroundButtonSecondaryDisabled to AtomikColor(0xf9f8f6),
        CedarColor.BackgroundButtonDark to  AtomikColor(0x4e4d49),
        CedarColor.BackgroundButtonSale to AtomikColor(0xc7370f),
        CedarColor.BackgroundButtonDisabled to AtomikColor(0xdcd6cb),

        // Primary / Secondary
        CedarColor.TextEmphasis to AtomikColor(0x030301),
        CedarColor.TextPrimary to AtomikColor(0x0C0B08),
        CedarColor.TextSecondary to AtomikColor(0x4B423B2F),
        CedarColor.TextSale to AtomikColor(0xC7370F),
        CedarColor.TextBrand to AtomikColor(0x1F513F),
        CedarColor.TextDisabled to AtomikColor(0xD1CBBD),
        CedarColor.TextInverse to AtomikColor(0xF9F8F6),
        CedarColor.TextSuccess to AtomikColor(0x2e6b34),
        CedarColor.TextWarning to AtomikColor(0x854714),
        CedarColor.TextError to AtomikColor(0x811823),
        CedarColor.TextInfo to AtomikColor(0x1b437e),
        CedarColor.TextMessageError to AtomikColor(0xbb4045),

        CedarColor.TextButtonPrimary to AtomikColor(0xf9f8f6),
        CedarColor.TextButtonPrimaryDisabled to AtomikColor(0xffffff),
        CedarColor.TextButtonSecondary to AtomikColor(0x4e4d49),
        CedarColor.TextButtonSecondaryDisabled to AtomikColor(0xd1cbbd),
        CedarColor.TextButtonDark to AtomikColor(0xf9f8f6),
        CedarColor.TextButtonDarkDisabled to AtomikColor(0xffffff),
        CedarColor.TextButtonSale to AtomikColor(0xffffff),
        CedarColor.TextButtonSaleDisabled to AtomikColor(0xffffff),

        // Icons
        CedarColor.IconEmphasis to AtomikColor(0x4E4D49),
        CedarColor.IconPrimary to AtomikColor(0x928B80),
        CedarColor.IconDisabled to AtomikColor(0xDCD6CB),
        // Borders
        CedarColor.BorderPrimary to AtomikColor(0xDCD6CB),
        CedarColor.BorderSecondary to AtomikColor(0x928B80),

        CedarColor.BorderButtonPrimary to AtomikColor(0x1f513f),
        CedarColor.BorderButtonSecondary to AtomikColor(0x928b80),
        CedarColor.BorderButtonDark to AtomikColor(0x4e4d49),
        CedarColor.BorderButtonSale to AtomikColor(0xc7370f),
        CedarColor.BorderButtonDisabled to AtomikColor(0xdcd6cb),

        // Links
        CedarColor.TextLinkRest to AtomikColor(0x406EB5),
        CedarColor.TextLinkVisited to AtomikColor(0x406EB5),
        CedarColor.TextLinkDisabled to AtomikColor(0xD1CBBD),
    )
)