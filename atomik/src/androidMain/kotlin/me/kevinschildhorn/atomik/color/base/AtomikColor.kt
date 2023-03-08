package me.kevinschildhorn.atomik.color.base

import androidx.compose.ui.graphics.Color

val AtomikColor.composeColor: Color
    get() = Color(red = r.toFloat(), green = g.toFloat(), blue = b.toFloat(), alpha = a.toFloat())

val AtomikColor.hexColor: Int
    get() = android.graphics.Color.parseColor(hexString)