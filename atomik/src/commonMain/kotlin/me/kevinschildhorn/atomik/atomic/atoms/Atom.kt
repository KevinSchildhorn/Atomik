package me.kevinschildhorn.atomik.atomic.atoms

import me.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomInterface
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomType
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomikConstraintX
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomikConstraintY
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.ColorAtom
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.ConstrainedAtom
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.FixedSizeAtom
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.TextAtom
import me.kevinschildhorn.atomik.color.base.AtomikColor
import me.kevinschildhorn.atomik.color.base.AtomikColorType
import me.kevinschildhorn.atomik.typography.base.AtomikFontFamily
import me.kevinschildhorn.atomik.typography.base.AtomikTypographyType

abstract class Atom {
    abstract val type: AtomType
    open val subComponents: List<Atom> = emptyList()

    val hasSubComponents: Boolean
        get() = subComponents.isNotEmpty()

    @Suppress("UNCHECKED_CAST")
    fun <T : AtomInterface> asAtom(): T? = (this as? T)

    inline fun <reified T : AtomInterface> subAtom(): T? = subComponents.find { it is T } as? T
}

