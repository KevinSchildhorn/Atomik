package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom

interface FixedSizeAtom : AtomInterface {
    val width: Int?
    val height: Int?
}

val Atom.fixedSizeAtom: FixedSizeAtom?
    get() = this.asAtom<FixedSizeAtom>()