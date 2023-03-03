package me.kevinschildhorn.android.ui.screens.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import me.kevinschildhorn.atomik.atomic.atoms.FigmaShapeAtom
import me.kevinschildhorn.atomik.atomic.atoms.FigmaTextAtom
import me.kevinschildhorn.atomik.atomic.atoms.alignment
import me.kevinschildhorn.atomik.atomic.atoms.atomikColor
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.textAtom
import me.kevinschildhorn.atomik.atomic.atoms.textStyle
import me.kevinschildhorn.common.design.theme.kevinrestart.errorViewAtom

@Preview
@Composable
fun ErrorView(text:String, molecule: FigmaShapeAtom = errorViewAtom) {
    Box(
        contentAlignment = molecule.alignment,
        modifier = Modifier.atomikColor(molecule)
    ){
        molecule.subComponents.forEach { atom ->
            (atom as? FigmaTextAtom)?.let {
                ErrorViewText(text = text, atom = it)
            }
        }
    }
}

@Composable
fun ErrorViewText(text:String, atom: FigmaTextAtom) {
    atom.textAtom?.textColor
    atom.textAtom?.typography?.typography
    Text(
        text = text,
        color = atom.textColor.composeColor,
        fontFamily = atom.fontFamily?.fontFamily,
        style = atom.textStyle
    )
}