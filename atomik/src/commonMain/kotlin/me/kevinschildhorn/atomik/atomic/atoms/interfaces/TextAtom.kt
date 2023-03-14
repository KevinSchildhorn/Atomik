package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom
import me.kevinschildhorn.atomik.color.base.AtomikColor
import me.kevinschildhorn.atomik.typography.base.AtomikFontFamily
import me.kevinschildhorn.atomik.typography.base.AtomikTypographyType

interface TextAtom : AtomInterface {
    val textColor: AtomikColor
    val typography: AtomikTypographyType
    val fontFamily: AtomikFontFamily?
}

val Atom.textAtom: TextAtom?
    get() = this.asAtom<TextAtom>()
