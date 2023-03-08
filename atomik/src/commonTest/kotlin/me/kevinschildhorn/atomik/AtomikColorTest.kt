package me.kevinschildhorn.atomik

import me.kevinschildhorn.atomik.color.base.AtomikColor
import kotlin.test.Test
import kotlin.test.assertEquals

internal class AtomikColorTest {

    data class ColorTest(
        val hexColor: Long,
        val hexColorString: String,
        val r: Int,
        val g: Int,
        val b: Int,
        val a: Float = 1F,
    )

    private val colorTestNoAlpha = ColorTest(
        hexColor = 0xa63028,
        hexColorString = "#a63028",
        r = 166,
        g = 48,
        b = 40,
    )

    private val colorTestAlpha = ColorTest(
        hexColor = 0xa63028DE,
        hexColorString = "#a63028DE",
        r = 166,
        g = 48,
        b = 40,
        a = 0.87F
    )

    @Test
    fun testColorRGB() {
        val color = AtomikColor(colorTestNoAlpha.r, colorTestNoAlpha.g, colorTestNoAlpha.b)
        assertEquals(expected = colorTestNoAlpha.a, actual = color.a)
        assertEquals(expected = colorTestNoAlpha.r, actual = color.r)
        assertEquals(expected = colorTestNoAlpha.g, actual = color.g)
        assertEquals(expected = colorTestNoAlpha.b, actual = color.b)
        assertEquals(expected = colorTestNoAlpha.hexColorString, actual = color.hexString)
        assertAll(colorTestNoAlpha, color)
    }

    @Test
    fun testColorRGBA() {
        val color = AtomikColor(
            colorTestAlpha.r,
            colorTestAlpha.g,
            colorTestAlpha.b,
            colorTestAlpha.a
        )
        assertAll(colorTestAlpha, color)
    }


    private fun assertAll(ColorTest: ColorTest, color: AtomikColor){
        assertEquals(expected = ColorTest.a, actual = color.a)
        assertEquals(expected = ColorTest.r, actual = color.r)
        assertEquals(expected = ColorTest.g, actual = color.g)
        assertEquals(expected = ColorTest.b, actual = color.b)
        assertEquals(expected = ColorTest.hexColorString, actual = color.hexString)
    }
}