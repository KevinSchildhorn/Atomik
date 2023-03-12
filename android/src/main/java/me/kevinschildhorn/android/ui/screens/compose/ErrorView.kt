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
import me.kevinschildhorn.atomik.color.base.composeColor
import me.kevinschildhorn.common.design.theme.kevinrestart.KevinAtoms

@Preview
@Composable
fun ErrorView(text:String, molecule: FigmaShapeAtom = KevinAtoms.errorViewAtom) {
    Box(
        contentAlignment = molecule.alignment,
        modifier = Modifier.atomikColor(molecule)
    ){
        molecule.subComponents.mapNotNull { it.asAtom<FigmaTextAtom>() }.forEach { atom ->
                ErrorViewText(text = text, atom = atom)
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