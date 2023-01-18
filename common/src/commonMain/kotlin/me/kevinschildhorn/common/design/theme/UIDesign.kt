package me.kevinschildhorn.common.design.theme

import me.kevinschildhorn.atomik.DefaultDesignSystem

val designSystem = DefaultDesignSystem(
    colorSet = colorSet,
    typographySet = typographySet,
    atoms = mapOf("textAtom" to textAtom)
)
