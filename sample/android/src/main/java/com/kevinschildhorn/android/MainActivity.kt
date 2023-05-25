package com.kevinschildhorn.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.kevinschildhorn.android.ui.TabBar
import com.kevinschildhorn.android.ui.screens.DesignScaffolding
import com.kevinschildhorn.android.ui.screens.Screen
import com.kevinschildhorn.android.ui.screens.compose.DefaultDesignComposable
import com.kevinschildhorn.android.ui.screens.xml.DefaultDesignView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme(
                // colors = UIDesign.composeColors(isSystemInDarkTheme()),
                // typography = UIDesign.composeTypography(fontFamily)
            ) {
                App()
            }
        }
    }

    @Preview
    @Composable
    fun App() {
        val screenState = remember { mutableStateOf(Screen.A) }
        Scaffold(
            bottomBar = {
                TabBar(
                    buttons = mapOf(
                        "A" to { screenState.value = Screen.A },
                        "B" to { screenState.value = Screen.B },
                        "C" to { screenState.value = Screen.C }
                    )
                )
            }
        ) { _ ->
            when (screenState.value) {
                Screen.A -> DesignScaffolding(
                    composeView = { DefaultDesignComposable() },
                    androidView = { DefaultDesignView(it) }
                )
                Screen.B -> DesignScaffolding(
                    composeView = { DefaultDesignComposable() },
                    androidView = { DefaultDesignView(it) }
                )
                Screen.C -> DesignScaffolding(
                    composeView = { DefaultDesignComposable() },
                    androidView = { DefaultDesignView(it) }
                )
            }
        }
    }
}
/*
val fontFamily = FontFamily(
    Font(R.font.quicksand_regular),
    Font(R.font.quicksand_bold, FontWeight.Bold),
    Font(R.font.quicksand_light, FontWeight.Light),
    Font(R.font.quicksand_medium, FontWeight.Medium),
    Font(R.font.quicksand_semibold, FontWeight.SemiBold),
)*/
