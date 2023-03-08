package me.kevinschildhorn.common.design.theme.kevinrestart

import me.kevinschildhorn.atomik.color.CustomColorSet
import me.kevinschildhorn.atomik.color.base.AtomikColor

private val primary = AtomikColor(255, 165, 0)

val kevinColorSet = CustomColorSet(
    fallbackColor = primary,
    colors = mapOf(
        "primary" to primary,
        "background" to AtomikColor(255, 255, 255),
        "surface" to AtomikColor(255, 255, 255),
        "error" to AtomikColor(255, 232, 235, 1F),
        "primaryText" to AtomikColor(64, 41, 0),
        "secondary" to AtomikColor(255, 211, 131),
        "secondaryText" to AtomikColor(255, 165, 0),
        "backgroundText" to AtomikColor(37, 35, 31),
        "surfaceText" to AtomikColor(255, 165, 0),
        "errorText" to AtomikColor(208, 2, 27, 1F),
        "primaryDark" to AtomikColor(255, 165, 0),
        "primaryDarkText" to AtomikColor(0, 0, 0),
        "secondaryDark" to AtomikColor(232, 129, 12),
        "secondaryDarkText" to AtomikColor(109, 78, 20),
        "backgroundDark" to AtomikColor(46, 48, 52),
        "backgroundDarkText" to AtomikColor(179, 183, 192),
        "surfaceDark" to AtomikColor(85, 86, 91),
        "surfaceDarkText" to AtomikColor(255, 165, 0),
        "errorDark" to AtomikColor(209, 0, 0),
        "errorDarkText" to AtomikColor(90, 18, 18),
        "Alert & Status/Red/Red 100" to AtomikColor(255, 232, 235, 1F),
),
)