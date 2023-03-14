package me.kevinschildhorn.atomik.atomic.atoms.xml

import android.widget.TextView
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.TextAtom
import me.kevinschildhorn.atomik.color.base.hexColor

fun TextView.applyTextAtom(textAtom: TextAtom?) {
    textAtom?.let {
        setTextColor(it.textColor.hexColor)
        textSize = it.typography.typography.size.toFloat()
    }
}
