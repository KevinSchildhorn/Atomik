package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom
import me.kevinschildhorn.atomik.color.base.AtomikColorType

interface EnablableAtom : ColorAtom {
    val disabledColor: AtomikColorType?
}

val Atom.enablableAtom: EnablableAtom?
    get() = this.asAtom<EnablableAtom>()