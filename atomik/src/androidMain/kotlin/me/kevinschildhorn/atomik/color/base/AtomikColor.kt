package me.kevinschildhorn.atomik.color.base

import androidx.compose.ui.graphics.Color

val AtomikColor.composeColor: Color
    get() = Color(
        red = r.toFloat() / 255,
        green = g.toFloat() / 255,
        blue = b.toFloat() / 255,
        alpha = a
    )

val AtomikColor.hexColor: Int
    get() = android.graphics.Color.parseColor(hexString)
