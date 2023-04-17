package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom

public interface PaddingAtom : AtomInterface {
    public val padding: Int?
    public val paddingHorizontal: Int?
    public val paddingVertical: Int?
    public val paddingLeft: Int?
    public val paddingRight: Int?
    public val paddingTop: Int?
    public val paddingBottom: Int?
}

public val Atom.paddingAtom: PaddingAtom?
    get() = this.asAtom<PaddingAtom>()

