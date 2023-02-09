package me.kevinschildhorn.common.design.theme.fluent

import me.kevinschildhorn.atomik.typography.CustomTypographySet
import me.kevinschildhorn.atomik.typography.base.AtomikTypography
import me.kevinschildhorn.atomik.typography.base.AtomikTypographyWeight
import me.kevinschildhorn.atomik.typography.base.TypographyType

val fluentTypographyMap: Map<TypographyType, AtomikTypography> = mapOf(
    TypographyType.Caption to AtomikTypography(AtomikTypographyWeight.NORMAL, 12, "roboto"),
    TypographyType.Body2 to AtomikTypography(AtomikTypographyWeight.MEDIUM, 14, "roboto"),
    TypographyType.Body to AtomikTypography(AtomikTypographyWeight.NORMAL, 14, "roboto"),
    TypographyType.Subheadline2 to AtomikTypography(AtomikTypographyWeight.MEDIUM, 16, "roboto"),
    TypographyType.Subheadline to AtomikTypography(AtomikTypographyWeight.NORMAL, 16, "roboto"),
    TypographyType.Heading to AtomikTypography(AtomikTypographyWeight.NORMAL, 18, "roboto"),
    TypographyType.Title2 to AtomikTypography(AtomikTypographyWeight.NORMAL, 20, "roboto"),
    TypographyType.Title to AtomikTypography(AtomikTypographyWeight.MEDIUM, 20, "roboto"),
    TypographyType.Headline to AtomikTypography(AtomikTypographyWeight.LIGHT, 28, "roboto"),
)

val fluentTypographySet = CustomTypographySet(
    fallbackTypography = AtomikTypography(size = 14),
    typographies = fluentTypographyMap,
)