package me.kevinschildhorn.atomik.typography

import me.kevinschildhorn.atomik.typography.base.AtomikTypography
import me.kevinschildhorn.atomik.typography.base.TypographySet
import me.kevinschildhorn.atomik.typography.base.TypographyType

@Suppress("unused", "usedFromiOS")
actual class PlatformTypographySet actual constructor(typographySet: DefaultTypographySet) :
    TypographySet {
    val largeTitle: AtomikTypography = typographySet.h1 ?: typographySet.fallbackTypography
    val title: AtomikTypography = typographySet.h2 ?: typographySet.fallbackTypography
    val title2: AtomikTypography = typographySet.h3 ?: typographySet.fallbackTypography
    val title3: AtomikTypography = typographySet.h4 ?: typographySet.fallbackTypography
    val headline: AtomikTypography = typographySet.h5 ?: typographySet.fallbackTypography
    val subheadline: AtomikTypography = typographySet.subtitle ?: typographySet.fallbackTypography
    val body: AtomikTypography = typographySet.body
    val callout: AtomikTypography = typographySet.button ?: typographySet.fallbackTypography
    val caption: AtomikTypography = typographySet.caption ?: typographySet.fallbackTypography
    val caption2: AtomikTypography = caption
    val footnote: AtomikTypography = typographySet.footnote ?: typographySet.fallbackTypography

    override val fallbackTypography: AtomikTypography
        get() = body

    override fun getTypography(type: TypographyType): AtomikTypography =
        when (type) {
            TypographyType.LargeTitle -> largeTitle
            TypographyType.Title -> title
            TypographyType.Title2 -> title2
            TypographyType.Title3 -> title3
            TypographyType.Headline -> headline
            TypographyType.Subheadline -> subheadline
            TypographyType.Body -> body
            TypographyType.Callout -> callout
            TypographyType.Caption -> caption
            TypographyType.Caption2 -> caption2
            TypographyType.Footnote -> footnote
            else -> fallbackTypography
        }
}
