package me.kevinschildhorn.atomik.color.base

import androidx.compose.ui.graphics.Color

actual class AtomikColor {
    actual val hexString: String
    actual val r: Int
    actual val g: Int
    actual val b: Int
    actual val a: Float

    /*
     * hex code for color (#AARRGGBB) (alpha optional)
     */
    private val androidHexColor: String

    /*
     * viewColor using parseColor
     * https://developer.android.com/reference/android/graphics/Color#parseColor(java.lang.String)
     * #RRGGBB
     * #AARRGGBB
     */
    val viewColor: Int
        get() = android.graphics.Color.parseColor(androidHexColor)
    val composeColor: Color

    actual constructor(hex: Long) {
        val data = AtomikColorData(hex)
        this.hexString = data.cssHexString
        this.androidHexColor= data.hexString
        this.r = data.r
        this.g = data.g
        this.b = data.b
        this.a = data.a
        this.composeColor = Color(
            red = r.toFloat() / 255,
            green = g.toFloat() / 255,
            blue = b.toFloat() / 255,
            alpha = this.a
        )
    }

    actual constructor(r: Int, g: Int, b: Int, a: Float?) {
        val data = AtomikColorData(r, g, b, a)
        this.hexString = data.cssHexString
        this.androidHexColor= data.hexString
        this.r = data.r
        this.g = data.g
        this.b = data.b
        this.a = data.a
        this.composeColor = Color(
            red = r.toFloat() / 255,
            green = g.toFloat() / 255,
            blue = b.toFloat() / 255,
            alpha = this.a
        )
    }
}


