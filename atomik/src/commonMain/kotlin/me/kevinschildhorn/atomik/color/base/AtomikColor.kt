package me.kevinschildhorn.atomik.color.base

/**
 * A common implementation of a Color
 *
 * This contains platform specific implementations in the actual versions
 */
class AtomikColor {

    val hexString: String
    val r: Int
    val g: Int
    val b: Int
    val a: Float

    /**
     * Constructor with hex variable
     *
     * @constructor Creates a color based on the hex value(i.e. 0xFFFFFF)
     */
    constructor(hex: Long) {
        this.hexString = "#${hex.toString(16)}"

        if (hexString.isLongForm) {
            this.r = (hex and 0xFF0000 shr 24).toInt()
            this.g = (hex and 0xFF00 shr 16).toInt()
            this.b = (hex and 0xFF shr 8).toInt()
            this.a = (hex and 0xFF).toFloat() / 255
        } else {
            this.r = (hex and 0xFF0000 shr 16).toInt()
            this.g = (hex and 0xFF00 shr 8).toInt()
            this.b = (hex and 0xFF).toInt()
            this.a = 1
        }
    }

    /**
     * Constructor with r, g, b, a
     *
     * @constructor Creates a color based on the rgb values. Alpha defaults to 1.
     *  r - Red value (0-255)
     *  g - Green Value (0-255)
     *  b - Blue Value (0-255)
     *  a - Alpha value (0-1)
     */
    constructor(r: Int, g: Int, b: Int, a: Float = 1F) {
        this.r = r
        this.g = g
        this.b = b
        this.a = a
        this.hexString = "#${
            r.asHexString + g.asHexString + b.asHexString + (a * 255).asHexString
        }"
    }


    private val String.isLongForm: Boolean
        get() = this.length == 8 + 1

    private val Int.asHexString: String
        get() = toString(16).padStart(2, '0')
}
