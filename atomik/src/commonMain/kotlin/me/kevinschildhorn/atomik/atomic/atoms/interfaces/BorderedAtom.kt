package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom
import me.kevinschildhorn.atomik.color.base.AtomikColor

interface BorderedAtom : AtomInterface {
    val borderColor: AtomikColor
}

val Atom.borderedAtom: BorderedAtom?
    get() = this.asAtom<BorderedAtom>()