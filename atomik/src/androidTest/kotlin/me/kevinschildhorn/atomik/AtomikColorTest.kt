package me.kevinschildhorn.atomik

import me.kevinschildhorn.atomik.color.base.AtomikColor
import kotlin.test.Test
import kotlin.test.assertEquals

internal class AtomikColorTest {

    @Test
    fun testColorRGB() {
        val color = AtomikColor(255,0,0)
        assertEquals(expected = 1, actual = color.a)
        assertEquals(expected = 255, actual = color.r)
        assertEquals(expected = 0, actual = color.g)
        assertEquals(expected = 0, actual = color.b)
    }
    @Test
    fun testColorNoAlpha() {
        val colorHex = AtomikColor(0xFF0000L)
        val color = AtomikColor(255,0,0)

        assertEquals(expected = colorHex.r, actual = color.r)
        assertEquals(expected = colorHex.g, actual = color.g)
        assertEquals(expected = colorHex.b, actual = color.b)
        assertEquals(expected = colorHex.a, actual = color.a)
        //assertEquals(expected = colorHex.hexColor, actual = color.hexColor)
    }
}