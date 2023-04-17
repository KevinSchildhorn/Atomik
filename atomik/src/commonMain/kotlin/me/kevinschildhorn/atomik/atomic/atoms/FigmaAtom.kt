package me.kevinschildhorn.atomik.atomic.atoms

import me.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomType
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomikConstraintX
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomikConstraintY
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.ColorAtom
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.ConstrainedAtom
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.FixedSizeAtom
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.PaddingAtom
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.TextAtom
import me.kevinschildhorn.atomik.color.base.AtomikColor
import me.kevinschildhorn.atomik.typography.base.AtomikFontFamily
import me.kevinschildhorn.atomik.typography.base.AtomikTypographyType

public open class FigmaBaseAtom(
    override val type: AtomType,
    override val width: Int?,
    override val height: Int?,
    override val constraintX: AtomikConstraintX,
    override val constraintY: AtomikConstraintY,
) : Atom(), FixedSizeAtom, ConstrainedAtom

public class FigmaShapeAtom(
    override val type: AtomType = AtomType.VIEW,
    override val subComponents: List<Atom> = emptyList(),
    override val width: Int? = null,
    override val height: Int? = null,
    override val constraintX: AtomikConstraintX,
    override val constraintY: AtomikConstraintY,
    // ColorAtom
    override val color: AtomikColor,
    // PaddingAtom
    override val padding: Int? = null,
    override val paddingHorizontal: Int? = padding,
    override val paddingVertical: Int? = padding,
    override val paddingLeft: Int? = paddingHorizontal,
    override val paddingRight: Int? = paddingHorizontal,
    override val paddingTop: Int? = paddingVertical,
    override val paddingBottom: Int? = paddingVertical,
) : FigmaBaseAtom(type, width, height, constraintX, constraintY),
    ColorAtom,
    PaddingAtom

public class FigmaTextAtom(
    override val type: AtomType = AtomType.TEXT,
    override val subComponents: List<Atom> = emptyList(),
    override val width: Int? = null,
    override val height: Int? = null,
    override val constraintX: AtomikConstraintX,
    override val constraintY: AtomikConstraintY,
    // TextAtom
    override val textColor: AtomikColor,
    override val typography: AtomikTypographyType,
    override val fontFamily: AtomikFontFamily? = null,
    // PaddingAtom
    override val padding: Int? = null,
    override val paddingHorizontal: Int? = padding,
    override val paddingVertical: Int? = padding,
    override val paddingLeft: Int? = paddingHorizontal,
    override val paddingRight: Int? = paddingHorizontal,
    override val paddingTop: Int? = paddingVertical,
    override val paddingBottom: Int? = paddingVertical,
) : FigmaBaseAtom(type, width, height, constraintX, constraintY),
    TextAtom,
    PaddingAtom
