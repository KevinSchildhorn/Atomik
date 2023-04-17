package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom

public interface FixedSizeAtom : AtomInterface {
    public val width: Int?
    public val height: Int?
}

public val Atom.fixedSizeAtom: FixedSizeAtom?
    get() = this.asAtom<FixedSizeAtom>()

