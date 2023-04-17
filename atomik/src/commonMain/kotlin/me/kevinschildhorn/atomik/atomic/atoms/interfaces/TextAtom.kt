package me.kevinschildhorn.atomik.atomic.atoms.interfaces

import me.kevinschildhorn.atomik.atomic.atoms.Atom
import me.kevinschildhorn.atomik.color.base.AtomikColor
import me.kevinschildhorn.atomik.typography.base.AtomikFontFamily
import me.kevinschildhorn.atomik.typography.base.AtomikTypographyType

public interface TextAtom : AtomInterface {
    public val textColor: AtomikColor
    public val typography: AtomikTypographyType
    public val fontFamily: AtomikFontFamily?
}

public val Atom.textAtom: TextAtom?
    get() = this.asAtom<TextAtom>()

