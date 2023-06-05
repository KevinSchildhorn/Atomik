package com.kevinschildhorn.android.ui.screens.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kevinschildhorn.android.ui.screens.compose.scaffolding.subtitle
import com.kevinschildhorn.android.ui.screens.compose.scaffolding.title
import com.kevinschildhorn.atomik.atomic.atoms.atomikColor
import com.kevinschildhorn.atomik.atomic.molecules.colors
import com.kevinschildhorn.common.design.theme.kevinrestart.atoms.ColorSampleAtoms

/*
 * Composable to show samples of ColorAtoms being added to Views
 */
@Preview
@Composable
fun ColorSampleComposable(/*designSystem: DesignSystem? = null*/) {

    var textFieldValue by remember { mutableStateOf("Here is some text") }
    val simpleAtom = ColorSampleAtoms.simplePrimaryAtom
    val textFieldMolecule = ColorSampleAtoms.simpleTextFieldMolecule

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {
        title("Color Samples")
        subtitle("View")
        Box(
            modifier = Modifier
                .atomikColor(simpleAtom)
                .size(50.dp, 50.dp)
        )
        Spacer(modifier = Modifier.size(0.dp, 20.dp))
        subtitle("Text View")
        Text(
            text = "Here is some text",
            color = simpleAtom.color.composeColor
        )
        Spacer(modifier = Modifier.size(0.dp, 20.dp))
        subtitle("Text Field")
        TextField(
            value = textFieldValue,
            onValueChange = { textFieldValue = it },
            colors = textFieldMolecule.colors(),
        )
        Spacer(modifier = Modifier.size(0.dp, 20.dp))
        subtitle("Button")
        Button(onClick = { }) {
            Text(text = "Here is some text")
        }
        Spacer(modifier = Modifier.size(0.dp, 20.dp))
    }
}