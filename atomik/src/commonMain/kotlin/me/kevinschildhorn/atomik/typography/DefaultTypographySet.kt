package me.kevinschildhorn.atomik.typography

import me.kevinschildhorn.atomik.typography.base.AtomikTypography
import me.kevinschildhorn.atomik.typography.base.TypographySet
import me.kevinschildhorn.atomik.typography.base.TypographyType

data class DefaultTypographySet(
    val h1: AtomikTypography? = null,
    val h2: AtomikTypography? = null,
    val h3: AtomikTypography? = null,
    val h4: AtomikTypography? = null,
    val h5: AtomikTypography? = null,
    val subtitle: AtomikTypography? = null,
    val caption: AtomikTypography? = null,
    val body: AtomikTypography,
    val button: AtomikTypography? = null,
    val footnote: AtomikTypography? = null,
) : TypographySet {
    override val fallbackTypography: AtomikTypography
        get() = body

    override fun getTypography(type: TypographyType): AtomikTypography =
        when (type) {
            TypographyType.H1 -> h1 ?: fallbackTypography
            TypographyType.H2 -> h2 ?: fallbackTypography
            TypographyType.H3 -> h3 ?: fallbackTypography
            TypographyType.H4 -> h4 ?: fallbackTypography
            TypographyType.H5 -> h5 ?: fallbackTypography
            TypographyType.Subtitle -> subtitle ?: fallbackTypography
            TypographyType.Caption -> caption ?: fallbackTypography
            TypographyType.Body -> body
            TypographyType.Button -> button ?: fallbackTypography
            TypographyType.Footnote -> footnote ?: fallbackTypography
            else -> body
        }
}
