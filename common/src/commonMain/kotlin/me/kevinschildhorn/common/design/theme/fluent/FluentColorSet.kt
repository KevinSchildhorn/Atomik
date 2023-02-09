package me.kevinschildhorn.common.design.theme.fluent

import me.kevinschildhorn.atomik.color.CustomColorSet
import me.kevinschildhorn.atomik.color.base.AtomikColor

// Taken from the Microsoft Fluent Android Figma file
val fluentColorMap = mapOf(
    "commBlueLightCommShade" to AtomikColor(0x005A9E),
    "commBlueLightCommPrimary" to AtomikColor(0x0078D4),
    "commBlueLightCommTint" to AtomikColor(0xEFF6FC),
    "commBlueDarkCommTint_10" to AtomikColor(0x0078D4),
    "neutralsBlack" to AtomikColor(0x000000),
    "neutralsGray_900" to AtomikColor(0x212121),
    "neutralsGray_800" to AtomikColor(0x292929),
    "neutralsGray_700" to AtomikColor(0x303030),
    "neutralsGray_500" to AtomikColor(0x6E6E6E),
    "neutralsGray_400" to AtomikColor(0x919191),
    "neutralsGray_100" to AtomikColor(0xE1E1E1),
    "neutralsGray_50" to AtomikColor(0xF1F1F1),
    "neutralsGray_25" to AtomikColor(0xF8F8F8),
    "neutralsWhite" to AtomikColor(0xFFFFFF),
)

val fluentColorSet = CustomColorSet(AtomikColor(0x000000), fluentColorMap)