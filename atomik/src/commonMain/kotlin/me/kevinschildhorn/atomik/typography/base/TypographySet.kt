package me.kevinschildhorn.atomik.typography.base

/**
 * A set of typohraphies to be used in the project
 *
 * Is an interface that is used to hold the typographies used in the project. Implemented in [PlatformTypographySet] and [CustomTypographySet] and [DefaultTypographySet]
 *
 * @property[fallbackTypography] the Typography that is passed if the requested color cannot be found
 */
interface TypographySet {
    val fallbackTypography: AtomikTypography

    /**
     * Gets the color based on a name
     * @param[type] The type of typograpnhy you want to get
     * @return the [AtomikTypography] based on the type passed
     */
    fun getTypography(type: AtomikTypographyType): AtomikTypography
}
