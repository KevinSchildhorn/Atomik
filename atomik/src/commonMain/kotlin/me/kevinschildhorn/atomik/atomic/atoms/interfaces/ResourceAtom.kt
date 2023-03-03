package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom

interface ResourceAtom<T> : AtomInterface {
    val image: T
}