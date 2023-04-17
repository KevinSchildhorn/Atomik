// ktlint-disable filename
package me.kevinschildhorn.atomik.atomic.atoms.xml

import android.widget.TextView
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.TextAtom

public fun TextView.applyTextAtom(textAtom: TextAtom?) {
    textAtom?.let {
        setTextColor(it.textColor.viewColor)
        textSize = it.typography.typography.size.toFloat()
    }
}

