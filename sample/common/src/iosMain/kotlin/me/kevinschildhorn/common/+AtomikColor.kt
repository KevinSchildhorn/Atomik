package me.kevinschildhorn.common

import me.kevinschildhorn.atomik.color.base.AtomikColor
import platform.UIKit.UIColor

@Suppress("unused")
val AtomikColor.uiColor: UIColor
    get() = UIColor(
        red = r.toDouble() / 255,
        green = g.toDouble() / 255,
        blue = b.toDouble() / 255,
        alpha = a.toDouble()
    )
