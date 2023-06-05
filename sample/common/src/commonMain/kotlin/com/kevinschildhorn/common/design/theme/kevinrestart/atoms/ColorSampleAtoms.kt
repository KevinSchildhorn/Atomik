package com.kevinschildhorn.common.design.theme.kevinrestart.atoms

import com.kevinschildhorn.atomik.atomic.atoms.Atom
import com.kevinschildhorn.atomik.atomic.atoms.FigmaShapeAtom
import com.kevinschildhorn.atomik.atomic.atoms.FigmaTextAtom
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomType
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomikConstraintX
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomikConstraintY
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.ColorAtom
import com.kevinschildhorn.atomik.color.base.AtomikColor
import com.kevinschildhorn.atomik.typography.base.AtomikTypography
import com.kevinschildhorn.atomik.typography.base.AtomikTypographyType
import com.kevinschildhorn.common.design.theme.kevinrestart.sampleColorSet

/*
 * Custom Atoms to be used in the sample.
 */
object ColorSampleAtoms {

    class SimpleColorAtom(override val color: AtomikColor) : Atom(), ColorAtom {
        override val type: AtomType = AtomType.VIEW
    }
    val simpleSquareAtom = SimpleColorAtom(color  = sampleColorSet.getColor("primary"))




    private val tempType = object : AtomikTypographyType {
        override val id: String
            get() = ""
        override val typography: AtomikTypography
            get() = AtomikTypography(size = 16) // SIZE GOOD
    }

    private val errorTextAtom = FigmaTextAtom(
        constraintX = AtomikConstraintX.SCALE,
        constraintY = AtomikConstraintY.SCALE,
        textColor = sampleColorSet.getColor("errorText"), // GOOD
        typography = tempType,
        padding = 12
    )

    val errorViewAtom = FigmaShapeAtom(
        constraintX = AtomikConstraintX.SCALE,
        constraintY = AtomikConstraintY.ALIGN_TOP,
        color = sampleColorSet.getColor("Alert & Status/Red/Red 100"), // GOOD
        subComponents = listOf(errorTextAtom)
    )
}
