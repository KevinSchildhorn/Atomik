package me.kevinschildhorn.android.ui.screens

import android.content.Context
import android.view.View
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView

@Preview
@Composable
fun <T : View> DesignScaffolding(composeView: @Composable () -> Unit, androidView: (Context) -> T) {
    val checkedState = remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray),
                horizontalArrangement = Arrangement.End,
            ) {
                Text("Compose")
                Switch(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it }
                )
                Text(
                    "XML", modifier = Modifier.padding(end = 5.dp)
                )
            }
        },
        content = { _ ->
            if (checkedState.value) {
                AndroidView(
                    modifier = Modifier.fillMaxSize(),
                    factory = androidView
                )
            } else {
                composeView()
            }
        }
    )
}