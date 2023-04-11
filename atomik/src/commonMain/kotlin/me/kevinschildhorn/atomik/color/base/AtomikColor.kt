package me.kevinschildhorn.atomik.color.base

import kotlin.math.roundToInt

/**
 * A common implementation of a Color
 *
 * This contains platform specific implementations in the actual versions
 */
expect class AtomikColor {

    /*
     * hex code for color (#RRGGBBAA) (alpha optional)
     */
    val hexString: String
    val r: Int
    val g: Int
    val b: Int
    val a: Float

    /**
     * Constructor with hex variable
     *
     * @constructor Creates a color based on the hex value(i.e. 0xFFFFFF)
     * @param hex - The Hex Value of the color (#RRGGBBAA)
     */
    constructor(hex: Long)

    /**
     * Constructor with r, g, b, a
     *
     * @constructor Creates a color based on the rgb values. Alpha defaults to 1.
     *  @param r - Red value (0-255)
     *  @param g - Green Value (0-255)
     *  @param b - Blue Value (0-255)
     *  @param a - Alpha value (0-1)
     */
    constructor(r: Int, g: Int, b: Int, a: Float? = null)
}
