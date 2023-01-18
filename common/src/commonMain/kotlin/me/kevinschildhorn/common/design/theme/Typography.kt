package me.kevinschildhorn.common.design.theme

import me.kevinschildhorn.atomik.typography.DefaultTypographySet
import me.kevinschildhorn.atomik.typography.base.AtomikTypography
import me.kevinschildhorn.atomik.typography.base.TypographyWeight

private const val fontName = "Quicksand"

val typographySet = DefaultTypographySet(
    h1 = AtomikTypography(
        fontName,
        weight = TypographyWeight.NORMAL,
        size = 96
    ),
    h2 = AtomikTypography(
        fontName,
        weight = TypographyWeight.NORMAL,
        size = 60
    ),
    h3 = AtomikTypography(
        fontName,
        weight = TypographyWeight.NORMAL,
        size = 48
    ),
    h4 = AtomikTypography(
        fontName,
        weight = TypographyWeight.NORMAL,
        size = 34
    ),
    subtitle = AtomikTypography(
        fontName,
        weight = TypographyWeight.NORMAL,
        size = 16
    ),
    caption = AtomikTypography(
        fontName,
        weight = TypographyWeight.BOLD,
        size = 14
    ),
    button = AtomikTypography(
        fontName,
        weight = TypographyWeight.BOLD,
        size = 14
    ),
    body = AtomikTypography(
        fontName,
        weight = TypographyWeight.NORMAL,
        size = 14
    ),
)
