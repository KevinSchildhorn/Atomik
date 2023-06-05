package com.kevinschildhorn.common.design.theme.kevinrestart.atoms

import com.kevinschildhorn.atomik.atomic.atoms.Atom
import com.kevinschildhorn.atomik.atomic.atoms.FigmaShapeAtom
import com.kevinschildhorn.atomik.atomic.atoms.FigmaTextAtom
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomType
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomikConstraintX
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomikConstraintY
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.ColorAtom
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.SimpleColorAtom
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.SimpleTextAtom
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.TextAtom
import com.kevinschildhorn.atomik.atomic.molecules.TextFieldMolecule
import com.kevinschildhorn.atomik.color.base.AtomikColor
import com.kevinschildhorn.atomik.typography.base.AtomikTypography
import com.kevinschildhorn.atomik.typography.base.AtomikTypographyType
import com.kevinschildhorn.common.design.theme.kevinrestart.sampleColorSet

/*
 * Custom Atoms to be used in the sample.
 */
object ColorSampleAtoms {
    private val sampleTypographyType = object : AtomikTypographyType {
        override val id: String
            get() = ""
        override val typography: AtomikTypography
            get() = AtomikTypography(size = 16) // SIZE GOOD
    }


    val simplePrimaryAtom = SimpleColorAtom(color  = sampleColorSet.getColor("primary"))
    private val simpleBackgroundAtom = SimpleColorAtom(color  = sampleColorSet.getColor("background"))

    private val simpleTextAtom = SimpleTextAtom(
        textColor = sampleColorSet.getColor("primary"),
        typography = sampleTypographyType,
        fontFamily = null,
    )
    val simpleTextFieldMolecule = TextFieldMolecule(
        textAtom = simpleTextAtom,
        backgroundColorAtom = simpleBackgroundAtom,
    )





    private val errorTextAtom = FigmaTextAtom(
        constraintX = AtomikConstraintX.SCALE,
        constraintY = AtomikConstraintY.SCALE,
        textColor = sampleColorSet.getColor("errorText"), // GOOD
        typography = sampleTypographyType,
        padding = 12
    )

    val errorViewAtom = FigmaShapeAtom(
        constraintX = AtomikConstraintX.SCALE,
        constraintY = AtomikConstraintY.ALIGN_TOP,
        color = sampleColorSet.getColor("Alert & Status/Red/Red 100"), // GOOD
        subComponents = listOf(errorTextAtom)
    )
}
