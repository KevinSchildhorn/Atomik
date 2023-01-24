package me.kevinschildhorn.common.design.theme

import me.kevinschildhorn.atomik.DefaultDesignSystem
import me.kevinschildhorn.common.design.theme.atoms.Atoms
import me.kevinschildhorn.common.design.theme.atoms.DesignAtoms

val designSystem = DefaultDesignSystem(
    colorSet = ColorSets.light,
    typographySet = sharedTypography,
    atoms = mapOf(
        Atoms.ErrorTextView.name to DesignAtoms.TextView.errorViewAtom,
    ),
    fontFamily = null
)
