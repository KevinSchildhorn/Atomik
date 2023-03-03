package me.kevinschildhorn.atomik.color.base

import platform.UIKit.UIColor

actual class AtomikColor {

    var platformColor: UIColor
        private set

    actual constructor(hex: Long) {
        val a = (hex and 0xFF000000 shr 24).toDouble() / 255
        val r = (hex and 0xFF0000 shr 16).toDouble() / 255
        val g = (hex and 0xFF00 shr 8).toDouble() / 255
        val b = (hex and 0xFF).toDouble() / 255
        this.platformColor = UIColor(red = r, green = g, blue = b, alpha = a)
    }
    actual constructor(r: Int, g: Int, b: Int, a:Int) {
        this.platformColor =
            UIColor(red = r / 255.0, green = g / 255.0, blue = b / 255.0, alpha = a / 255.0)
    }
}
