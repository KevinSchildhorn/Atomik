package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom


interface PaddingAtom : AtomInterface {
    val padding: Int?
    val paddingHorizontal: Int?
    val paddingVertical: Int?
    val paddingLeft:Int?
    val paddingRight: Int?
    val paddingTop: Int?
    val paddingBottom: Int?
}

val Atom.paddingAtom: PaddingAtom?
    get() = this.asAtom<PaddingAtom>()