package com.kevinschildhorn.common.design.theme.kevinrestart

import com.kevinschildhorn.atomik.atomic.atoms.FigmaShapeAtom
import com.kevinschildhorn.atomik.atomic.atoms.FigmaTextAtom
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomikConstraintX
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomikConstraintY
import com.kevinschildhorn.atomik.typography.base.AtomikTypography
import com.kevinschildhorn.atomik.typography.base.AtomikTypographyType

object KevinAtoms {

    private val tempType = object : AtomikTypographyType {
        override val id: String
            get() = ""
        override val typography: AtomikTypography
            get() = AtomikTypography(size = 16) // SIZE GOOD
    }

    private val errorTextAtom = FigmaTextAtom(
        constraintX = AtomikConstraintX.SCALE,
        constraintY = AtomikConstraintY.SCALE,
        textColor = kevinColorSet.getColor("errorText"), // GOOD
        typography = tempType,
        padding = 12
    )

    val errorViewAtom = FigmaShapeAtom(
        constraintX = AtomikConstraintX.SCALE,
        constraintY = AtomikConstraintY.ALIGN_TOP,
        color = kevinColorSet.getColor("Alert & Status/Red/Red 100"), // GOOD
        subComponents = listOf(errorTextAtom)
    )
}
