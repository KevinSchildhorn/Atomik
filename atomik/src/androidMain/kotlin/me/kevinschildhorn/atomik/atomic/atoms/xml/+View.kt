package me.kevinschildhorn.atomik.atomic.atoms.xml

import android.graphics.Color
import android.os.Build
import android.view.View
import androidx.annotation.RequiresApi
import me.kevinschildhorn.atomik.atomic.atoms.interfaces.ColorAtom
import me.kevinschildhorn.atomik.color.base.hexColor

fun View.applyColorAtom(colorAtom: ColorAtom?) {
    colorAtom?.let {
        setBackgroundColor(it.color.hexColor)
    }
}