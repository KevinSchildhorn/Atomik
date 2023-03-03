package me.kevinschildhorn.atomik.color.base

import android.os.Build
import androidx.annotation.ColorInt
import androidx.annotation.RequiresApi
import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorLong


actual class AtomikColor {

    val composeColor: Color
    val hexColor: Int
    private val hexString: String

    private val r: Int
    private val g: Int
    private val b: Int
    private val a: Int

    actual constructor(hex: Long) {
        this.composeColor = Color(hex)
        this.r = (hex and 0xFF0000 shr 16).toInt()
        this.g = (hex and 0xFF00 shr 8).toInt()
        this.b = (hex and 0xFF).toInt()
        this.a = 1
        this.hexString = "#${hex.toString(16)}"
        this.hexColor = android.graphics.Color.parseColor(hexString)
    }

    actual constructor(r: Int, g: Int, b: Int, a: Int) {
        this.composeColor = Color(r / 255f, g / 255f, b / 255f, a.toFloat())
        this.r = r
        this.g = g
        this.b = b
        this.a = a
        this.hexString = "#${
            r.toString(16).padStart(2, '0') +
                    g.toString(16).padStart(2, '0') +
                    b.toString(16).padStart(2, '0')
                    // + "ff"//a.toString(16)
        }"
        this.hexColor = android.graphics.Color.parseColor(hexString)
    }
}
