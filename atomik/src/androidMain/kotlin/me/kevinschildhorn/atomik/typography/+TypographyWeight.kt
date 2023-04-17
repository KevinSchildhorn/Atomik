// ktlint-disable filename
package me.kevinschildhorn.atomik.typography

import androidx.compose.ui.text.font.FontWeight
import me.kevinschildhorn.atomik.typography.base.AtomikTypographyWeight

public val AtomikTypographyWeight.fontWeight: FontWeight
    get() = when (this) {
        AtomikTypographyWeight.BOLD -> FontWeight.Bold
        else -> FontWeight.Normal
    }

