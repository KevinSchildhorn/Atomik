package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom

public interface ConstrainedAtom : AtomInterface {
    public val constraintX: AtomikConstraintX
    public val constraintY: AtomikConstraintY
}

public enum class AtomikConstraintX {
    CENTER,
    ALIGN_LEFT,
    ALIGN_RIGHT,
    SCALE
}

public enum class AtomikConstraintY {
    CENTER,
    ALIGN_TOP,
    ALIGN_BOTTOM,
    SCALE,
}

public val Atom.constrainedAtom: ConstrainedAtom?
    get() = this.asAtom<ConstrainedAtom>()

