// ktlint-disable filename
package me.kevinschildhorn.atomik.atomic.atoms

import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.ColorAtom

public fun Modifier.atomikColor(colorAtom: ColorAtom): Modifier =
    this.background(colorAtom.color.composeColor)

