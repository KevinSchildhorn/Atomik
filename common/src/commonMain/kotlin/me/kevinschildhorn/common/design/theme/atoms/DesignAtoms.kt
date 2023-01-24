package me.kevinschildhorn.common.design.theme.atoms

import me.kevinschildhorn.atomik.atomic.atoms.TextViewAtom
import me.kevinschildhorn.atomik.atomic.molecules.TextButtonMolecule
import me.kevinschildhorn.atomik.color.disabledColor
import me.kevinschildhorn.atomik.typography.base.TypographySet
import me.kevinschildhorn.atomik.typography.base.TypographyType
import me.kevinschildhorn.common.design.theme.ColorSets
import me.kevinschildhorn.common.design.theme.designSystem
import me.kevinschildhorn.common.design.theme.sharedTypography

enum class Atoms {
    ErrorTextView,
    PrimaryButton
}
object DesignAtoms {
    object Buttons {
        val primaryButtonMolecule = TextButtonMolecule(
            color = designSystem.colorSet.primary,
            disabledColor = disabledColor,
            radius = 15,
            height = 44,
            textColor = designSystem.colorSet.primaryText,
            typography = designSystem.typographySet.getTypography(TypographyType.Button),
            fontFamily = designSystem.fontFamily,
        )
    }

    object TextView {
        val errorViewAtom = TextViewAtom(
            textColor = ColorSets.light.errorText,
            typography = sharedTypography.h4!!,
            fontFamily = null,
        )
    }
}
