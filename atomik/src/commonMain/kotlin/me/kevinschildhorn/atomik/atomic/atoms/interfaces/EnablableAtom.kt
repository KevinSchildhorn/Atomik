package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom
import me.kevinschildhorn.atomik.color.base.AtomikColorType

public interface EnablableAtom : ColorAtom {
    public val disabledColor: AtomikColorType?
}

public val Atom.enablableAtom: EnablableAtom?
    get() = this.asAtom<EnablableAtom>()

