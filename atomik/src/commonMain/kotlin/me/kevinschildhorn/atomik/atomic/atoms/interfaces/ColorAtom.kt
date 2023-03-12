package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom
import me.kevinschildhorn.atomik.color.base.AtomikColor

interface ColorAtom : AtomInterface {
    val color: AtomikColor
}

val Atom.colorAtom: ColorAtom?
    get() = this.asAtom<ColorAtom>()