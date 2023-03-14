package me.kevinschildhorn.atomik.atomic.atoms.xml

import android.view.View
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.ColorAtom
import me.kevinschildhorn.atomik.color.base.hexColor

fun View.applyColorAtom(colorAtom: ColorAtom?) {
    colorAtom?.let {
        setBackgroundColor(it.color.hexColor)
    }
}
