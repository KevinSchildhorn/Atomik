package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom

interface ConstrainedAtom : AtomInterface {
    val constraintX: AtomikConstraintX
    val constraintY: AtomikConstraintY
}

enum class AtomikConstraintX {
    CENTER,
    ALIGN_LEFT,
    ALIGN_RIGHT,
    SCALE
}

enum class AtomikConstraintY {
    CENTER,
    ALIGN_TOP,
    ALIGN_BOTTOM,
    SCALE,
}

val Atom.constrainedAtom: ConstrainedAtom?
    get() = this.asAtom<ConstrainedAtom>()
