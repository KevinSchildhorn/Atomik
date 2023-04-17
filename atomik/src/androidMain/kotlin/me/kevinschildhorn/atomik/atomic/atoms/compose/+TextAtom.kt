// ktlint-disable filename
package me.kevinschildhorn.atomik.atomic.atoms

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.TextAtom
import me.kevinschildhorn.atomik.typography.fontWeight

public val TextAtom.textStyle: TextStyle
    get() {
        return TextStyle(
            fontFamily = this.fontFamily?.fontFamily,
            fontWeight = this.typography.typography.weight.fontWeight,
            fontSize = this.typography.typography.size.sp,
            color = this.textColor.composeColor
        )
    }

public fun TextAtom.textStyle(fontFamily: FontFamily): TextStyle =
    TextStyle(
        fontFamily = fontFamily,
        fontWeight = this.typography.typography.weight.fontWeight,
        fontSize = this.typography.typography.size.sp,
        color = this.textColor.composeColor
    )

