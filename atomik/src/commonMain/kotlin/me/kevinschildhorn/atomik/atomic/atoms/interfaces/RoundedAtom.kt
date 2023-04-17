package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom

public interface RoundedAtom : AtomInterface {
    public val radius: Int
}

public val Atom.roundedAtom: RoundedAtom?
    get() = this.asAtom<RoundedAtom>()

