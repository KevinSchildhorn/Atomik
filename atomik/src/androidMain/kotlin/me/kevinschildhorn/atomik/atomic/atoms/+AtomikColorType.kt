package me.kevinschildhorn.atomik.atomic.atoms

import androidx.compose.ui.graphics.Color
import me.kevinschildhorn.atomik.color.base.AtomikColorType
import me.kevinschildhorn.atomik.color.base.composeColor

val AtomikColorType.composeColor: Color
    get() = color.composeColor