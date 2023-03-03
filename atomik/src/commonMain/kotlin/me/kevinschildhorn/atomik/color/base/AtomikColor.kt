package me.kevinschildhorn.atomik.color.base

/**
 * A common implementation of a Color
 *
 * This contains platform specific implementations in the actual versions
 */
expect class AtomikColor {

    /**
     * Constructor with hex variable
     *
     * @constructor Creates a color based on the hex value(i.e. 0xFFFFFF)
     */
    constructor(hex: Long)

    /**
     * Constructor with r, g, b, a
     *
     * @constructor Creates a color based on the rgb values. Alpha defaults to 1.
     *  r - Red value (0-255)
     *  g - Green Value (0-255)
     *  b - Blue Value (0-255)
     */
    constructor(r: Int, g: Int, b: Int, a: Int = 1)
}
