package me.kevinschildhorn.atomik.color.base

import platform.UIKit.UIColor

val AtomikColor.uiColor: UIColor
    get() = UIColor(
        red = r.toDouble() / 255,
        green = g.toDouble() / 255,
        blue = b.toDouble() / 255,
        alpha = a.toDouble()
    )
