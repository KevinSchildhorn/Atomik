package me.kevinschildhorn.atomik.atomic.atoms

import me.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomInterface
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomType

public abstract class Atom {
    public abstract val type: AtomType
    public open val subComponents: List<Atom> = emptyList()

    public val hasSubComponents: Boolean
        get() = subComponents.isNotEmpty()

    @Suppress("UNCHECKED_CAST")
    public fun <T : AtomInterface> asAtom(): T? = (this as? T)

    public inline fun <reified T : AtomInterface> subAtom(): T? = subComponents.find { it is T } as? T
}
