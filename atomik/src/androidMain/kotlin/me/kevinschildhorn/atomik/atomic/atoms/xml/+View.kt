package me.kevinschildhorn.atomik.atomic.atoms.xml

import android.view.View
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.ColorAtom

fun View.applyColorAtom(colorAtom: ColorAtom?) {
    colorAtom?.let {
        setBackgroundColor(it.color.viewColor)
    }
}
