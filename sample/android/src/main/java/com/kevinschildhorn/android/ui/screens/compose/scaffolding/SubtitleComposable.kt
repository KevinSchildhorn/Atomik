package com.kevinschildhorn.android.ui.screens.compose.scaffolding

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevinschildhorn.atomik.atomic.atoms.textStyle
import com.kevinschildhorn.common.design.theme.kevinrestart.ScaffoldingAtoms

@Preview
@Composable
fun subtitle(text:String) {
    val headerAtom = ScaffoldingAtoms.headerSubtitle
    Text(
        text = text,
        color = headerAtom.textColor.composeColor,
        fontFamily = headerAtom.fontFamily?.fontFamily,
        style = headerAtom.textStyle,
        modifier = Modifier.padding(bottom = 20.dp),
    )
}