package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom

interface RoundedAtom : AtomInterface {
    val radius: Int
}

val Atom.roundedAtom: RoundedAtom?
    get() = this.asAtom<RoundedAtom>()