package com.kevinschildhorn.common.design.theme.kevinrestart

import com.kevinschildhorn.atomik.atomic.atoms.FigmaTextAtom
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomikConstraintX
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomikConstraintY
import com.kevinschildhorn.atomik.color.base.AtomikColor
import com.kevinschildhorn.atomik.typography.base.AtomikTypography
import com.kevinschildhorn.atomik.typography.base.AtomikTypographyType
import com.kevinschildhorn.atomik.typography.base.AtomikTypographyWeight

object ScaffoldingAtoms {

    private fun typographyType(size: Int) = object : AtomikTypographyType {
        override val id: String
            get() = ""
        override val typography: AtomikTypography
            get() = AtomikTypography(size = size, weight = AtomikTypographyWeight.BOLD)
    }

    val headerTitle = FigmaTextAtom(
        constraintX = AtomikConstraintX.SCALE,
        constraintY = AtomikConstraintY.SCALE,
        textColor = AtomikColor(0,0,0),
        typography = typographyType(24),
        padding = 12
    )

    val headerSubtitle = FigmaTextAtom(
        constraintX = AtomikConstraintX.SCALE,
        constraintY = AtomikConstraintY.SCALE,
        textColor = AtomikColor(0,0,0),
        typography = typographyType(16),
        padding = 12
    )
}