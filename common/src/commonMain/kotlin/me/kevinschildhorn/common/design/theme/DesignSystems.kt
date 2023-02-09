package me.kevinschildhorn.common.design.theme

import me.kevinschildhorn.atomik.DefaultDesignSystem
import me.kevinschildhorn.common.design.theme.atoms.Atoms
import me.kevinschildhorn.common.design.theme.atoms.DesignAtoms
import me.kevinschildhorn.common.design.theme.custom.DefaultColorSet

val designSystem = DefaultDesignSystem(
    colorSet = DefaultColorSet.light,
    typographySet = sharedTypography,
    components = mapOf(
        Atoms.ErrorTextView.name to DesignAtoms.TextView.errorViewAtom,
    ),
    fontFamily = null
)