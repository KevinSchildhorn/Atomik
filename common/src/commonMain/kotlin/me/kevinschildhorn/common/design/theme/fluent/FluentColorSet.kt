package me.kevinschildhorn.common.design.theme.fluent

import me.kevinschildhorn.atomik.color.CustomColorSet
import me.kevinschildhorn.atomik.color.base.AtomikColor
import me.kevinschildhorn.atomik.color.base.AtomikColorType

// Taken from the Microsoft Fluent Android Figma file
enum class FluentColors(override val id: String, override val color: AtomikColor) : AtomikColorType {
    commBlueLightCommShade("commBlueLightCommShade", AtomikColor(0x005A9E)),
    commBlueLightCommPrimary("commBlueLightCommPrimary", AtomikColor(0x0078D4)),
    commBlueLightCommTint("commBlueLightCommTint", AtomikColor(0xEFF6FC)),
    commBlueDarkCommTint_10("commBlueDarkCommTint_10", AtomikColor(0x0078D4)),
    neutralsBlack("neutralsBlack", AtomikColor(0x000000)),
    neutralsGray_900("neutralsGray_900", AtomikColor(0x212121)),
    neutralsGray_800("neutralsGray_800", AtomikColor(0x292929)),
    neutralsGray_700("neutralsGray_700", AtomikColor(0x303030)),
    neutralsGray_500("neutralsGray_500", AtomikColor(0x6E6E6E)),
    neutralsGray_400("neutralsGray_400", AtomikColor(0x919191)),
    neutralsGray_300("neutralsGray_300", AtomikColor(0xACACAC)),
    neutralsGray_100("neutralsGray_100", AtomikColor(0xE1E1E1)),
    neutralsGray_50("neutralsGray_50", AtomikColor(0xF1F1F1)),
    neutralsGray_25("neutralsGray_25", AtomikColor(0xF8F8F8)),
    neutralsWhite("neutralsWhite", AtomikColor(0xFFFFFF))
}

val fluentColorSet = CustomColorSet(
    AtomikColor(0x000000),
    FluentColors.values().map {
        it.id to it.color
    }.toMap()
)