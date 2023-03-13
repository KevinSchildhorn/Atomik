package me.kevinschildhorn.atomik.typography

import me.kevinschildhorn.atomik.typography.base.AtomikTypography
import me.kevinschildhorn.atomik.typography.base.TypographySet
import me.kevinschildhorn.atomik.typography.base.AtomikTypographyType

class CustomTypographySet(
    override val fallbackTypography: AtomikTypography,
    private val typographies: Map<AtomikTypographyType, AtomikTypography>
) : TypographySet {

    override fun getTypography(type: AtomikTypographyType): AtomikTypography =
        typographies[type] ?: fallbackTypography
}

class CustomTypographySetTyped<E : Enum<*>>(
    override val fallbackTypography: AtomikTypography,
    private val typographies: Map<E, AtomikTypography>
) : TypographySet {

    fun getTypography(type: E): AtomikTypography = typographies[type] ?: fallbackTypography
    override fun getTypography(type: AtomikTypographyType): AtomikTypography = fallbackTypography
}
