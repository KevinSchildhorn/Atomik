package me.kevinschildhorn.atomik.typography.base


public data class AtomikTypography(
    val weight: AtomikTypographyWeight = AtomikTypographyWeight.NORMAL,
    val size: Int,
    val fontName: String? = null,
)
