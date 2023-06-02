package com.kevinschildhorn.android.ui.screens.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/*
 * A basic Composable to showcase an ErrorView, will be removed to add more customizable views
 */
@Preview
@Composable
fun DefaultDesignComposable(/*designSystem: DesignSystem? = null*/) {
    ErrorView(text = "Hello World")
/*
    val textState = remember { mutableStateOf(TextFieldValue()) }
    val primaryButton = FluentAtoms.primaryButton

    Column {

        PrimaryButton(
            onClick = {

            }
        )
        /*
        Text(
            "An Error Occurred",
            fontSize = 14.sp,
            color = Color.Black,
            modifier = Modifier
                .background(Color.Red)
                .padding(8.dp)
        )
        Card(elevation = 10.dp) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image_sample),
                    contentDescription = null,
                    modifier = Modifier
                        .width(200.dp)
                        .aspectRatio(1f)
                        .background(Color.Red)
                )
                Text("Title")
                Text("Subtitle")
                Button(
                    colors = primaryButton.buttonColors(),
                    onClick = { }) {
                    Text(text = "Click Here!")
                }
            }
        }
        Spacer(modifier = Modifier.height(25.dp))
        TextField(
            value = textState.value,
            onValueChange = { textState.value = it }
        )
        */
    }*/
}
