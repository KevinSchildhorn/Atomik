// ktlint-disable filename
package com.kevinschildhorn.atomik.atomic.atoms.xml

import android.widget.TextView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import com.kevinschildhorn.atomik.atomic.atoms.interfaces.TextAtom

/**
 * Applies a [TextAtom] to a [TextView], setting the text color and size
 *
 * @param textAtom the [TextAtom] that will be applied to the [TextView]
 */
public fun TextView.applyTextAtom(textAtom: TextAtom?) {
    textAtom?.let {
        setTextColor(it.textColor.viewColor)
        textSize = it.typography.typography.size.toFloat()
    }
}
