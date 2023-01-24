package me.kevinschildhorn.android.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import me.kevinschildhorn.android.fontFamily
import me.kevinschildhorn.atomik.atomic.atoms.TextViewAtom
import me.kevinschildhorn.atomik.typography.asComposeTextStyle
import me.kevinschildhorn.common.design.theme.atoms.Atoms
import me.kevinschildhorn.common.design.theme.designSystem

@Composable
fun SampleText() {
    val atom: TextViewAtom = designSystem.atoms[Atoms.ErrorTextView.name] as TextViewAtom
    Text(
        text = "Hello",
        color = atom.textColor.platformColor,
        style = atom.typography.asComposeTextStyle(fontFamily)
    )
}
