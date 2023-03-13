package me.kevinschildhorn.android.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TabBar(buttons: Map<String, () -> Unit>) {
    Row(
        modifier =
        Modifier
            .height(55.dp)
            .background(Color.Black)
    ) {

        buttons.forEach { (title, onClick) ->
            Button(
                onClick = onClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1f)
                    .padding(horizontal = 5.dp, vertical = 5.dp)
                    .clip(RoundedCornerShape(10.dp))
            ) {
                Text(title)
            }
        }
    }
}

@Preview
@Composable
fun TabBarPreview() {
    TabBar(
        buttons = mapOf<String, () -> Unit>(
            "A" to {},
            "B" to {},
            "C" to {},
        )
    )
}