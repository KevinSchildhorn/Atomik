// ktlint-disable filename
package me.kevinschildhorn.atomik.atomic.atoms

import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.ColorAtom
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.ConstrainedAtom

/**
 * Modifier extension to apply a Color Atom to a composable
 * @param colorAtom the ColorAtom that you are applying to the composable
 * @return returns a modifier
 */
@Suppress("SpellCheckingInspection")
public fun Modifier.atomikColor(colorAtom: ColorAtom): Modifier =
    this.background(colorAtom.color.composeColor)
