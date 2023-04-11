package me.kevinschildhorn.atomik.color.base

import platform.UIKit.UIColor

actual class AtomikColor {
    actual val hexString: String
    actual val r: Int
    actual val g: Int
    actual val b: Int
    actual val a: Float

    val uiColor: UIColor
        get() = UIColor(
            red = r.toDouble() / 255,
            green = g.toDouble() / 255,
            blue = b.toDouble() / 255,
            alpha = a.toDouble()
        )

    actual constructor(hex: Long) {
        val data = AtomikColorData(hex)
        this.hexString = data.cssHexString
        this.r = data.r
        this.g = data.g
        this.b = data.b
        this.a = data.a
    }

    actual constructor(r: Int, g: Int, b: Int, a: Float?) {
        val data = AtomikColorData(r,g,b,a)
        this.hexString = data.cssHexString
        this.r = data.r
        this.g = data.g
        this.b = data.b
        this.a = data.a
    }
}