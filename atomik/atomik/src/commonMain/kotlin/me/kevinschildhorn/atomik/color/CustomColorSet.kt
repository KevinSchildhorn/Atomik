package me.kevinschildhorn.atomik.color

import me.kevinschildhorn.atomik.color.base.AtomikColor
import me.kevinschildhorn.atomik.color.base.ColorSet

class CustomColorSet(
    override val fallbackColor: AtomikColor,
    private val colors: Map<String, AtomikColor>
) : ColorSet {
    override fun getColor(name: String): AtomikColor = colors[name] ?: fallbackColor
}

class CustomColorSetTyped<E : Enum<*>>(
    override val fallbackColor: AtomikColor,
    private val colors: Map<E, AtomikColor>
) : ColorSet {
    fun getColor(name: E): AtomikColor = colors.get(name) ?: fallbackColor
    override fun getColor(name: String): AtomikColor = fallbackColor
}
