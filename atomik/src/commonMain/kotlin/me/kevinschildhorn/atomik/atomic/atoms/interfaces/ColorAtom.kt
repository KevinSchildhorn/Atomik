package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom
import me.kevinschildhorn.atomik.color.base.AtomikColor

public interface ColorAtom : AtomInterface {
    public val color: AtomikColor
}

public val Atom.colorAtom: ColorAtom?
    get() = this.asAtom<ColorAtom>()

