package me.kevinschildhorn.atomik

import me.kevinschildhorn.atomik.atomic.atoms.Atom
import me.kevinschildhorn.atomik.color.base.ColorSet
import me.kevinschildhorn.atomik.typography.base.AtomikFontFamily
import me.kevinschildhorn.atomik.typography.base.TypographySet

/**
 * A Design System
 *
 * This is the core of the Atomik Library, representing a Design Systems components.
 * This is based on atomic design which is included in the Design System
 *
 * @property[colorSet] the collection of colors to be used in this Design System
 * @property[typographySet] the collection of typohraphies to be used in this Design System
 * @property[components] the atomic components to be used in this Design System
 * @property[fontFamily] the font family passed into the Design System from the Platform level
 */
open class DesignSystem(
    open val colorSet: ColorSet,
    open val typographySet: TypographySet,
    open val components: Map<String, Atom>,
    open var fontFamily: AtomikFontFamily? = null
)
/*
class PlatformDesignSystem(
    override val colorSet: DefaultColorSet,
    override val typographySet: PlatformTypographySet,
    override val components: Map<String, Atom>,
    override var fontFamily: AtomikFontFamily?,
) : DesignSystem(colorSet, typographySet, components, fontFamily)

class DefaultDesignSystem(
    override val colorSet: DefaultColorSet,
    override val typographySet: DefaultTypographySet,
    override val components: Map<String, Atom>,
    override var fontFamily: AtomikFontFamily?,
) : DesignSystem(colorSet, typographySet, components, fontFamily)

class CustomDesignSystem(
    override val colorSet: CustomColorSet,
    override val typographySet: CustomTypographySet,
    override val components: Map<String, Atom>,
    override var fontFamily: AtomikFontFamily?,
) : DesignSystem(colorSet, typographySet, components, fontFamily)
*/
