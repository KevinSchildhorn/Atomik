package me.kevinschildhorn.atomik.atomic.atoms

import me.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomInterface
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.AtomType

abstract class Atom {
    abstract val type: AtomType
    open val subComponents: List<Atom> = emptyList()

    val hasSubComponents: Boolean
        get() = subComponents.isNotEmpty()

    @Suppress("UNCHECKED_CAST")
    fun <T : AtomInterface> asAtom(): T? = (this as? T)

    inline fun <reified T : AtomInterface> subAtom(): T? = subComponents.find { it is T } as? T
}
