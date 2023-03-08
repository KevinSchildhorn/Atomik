package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom
import kotlin.experimental.ExperimentalObjCName
import kotlin.native.ObjCName

interface ConstrainedAtom : AtomInterface {
    val constraintX: AtomikConstraintX
    val constraintY: AtomikConstraintY
}

@OptIn(ExperimentalObjCName::class)
@ObjCName(swiftName = "AtomikConstraintX")
enum class AtomikConstraintX {
    CENTER,
    ALIGN_LEFT,
    ALIGN_RIGHT,
    SCALE
}

@OptIn(ExperimentalObjCName::class)
@ObjCName(swiftName = "AtomikConstraintY")
enum class AtomikConstraintY {
    CENTER,
    ALIGN_TOP,
    ALIGN_BOTTOM,
    SCALE,
}

val Atom.constrainedAtom: ConstrainedAtom?
    get() = this.asAtom<ConstrainedAtom>()