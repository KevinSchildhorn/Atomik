package me.kevinschildhorn.common.design.theme.fluent

import me.kevinschildhorn.atomik.CustomDesignSystem
import me.kevinschildhorn.common.design.theme.atoms.DesignAtoms

val fluentDesignSystem = CustomDesignSystem(
    colorSet = fluentColorSet,
    typographySet = fluentTypographySet,
    components = mapOf(
        "" to DesignAtoms.TextView.errorViewAtom
    ),
    fontFamily = null,
)