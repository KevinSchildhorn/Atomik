// ktlint-disable filename
package me.kevinschildhorn.atomik.typography

import me.kevinschildhorn.atomik.typography.base.AtomikTypographyWeight
import platform.UIKit.UIFontWeight
import platform.UIKit.UIFontWeightBlack
import platform.UIKit.UIFontWeightBold
import platform.UIKit.UIFontWeightMedium
import platform.UIKit.UIFontWeightRegular
import platform.UIKit.UIFontWeightThin
import platform.UIKit.UIFontWeightUltraLight

/**
 * the UIFontWeight based on the common [AtomikTypographyWeight]
 */
@Suppress("SpellCheckingInspection")
internal val AtomikTypographyWeight.fontWeight: UIFontWeight
    get() = when (this) {
        AtomikTypographyWeight.NORMAL -> UIFontWeightRegular
        AtomikTypographyWeight.BOLD -> UIFontWeightBold
        AtomikTypographyWeight.BLACK,
        AtomikTypographyWeight.EXTRABOLD -> UIFontWeightBlack
        AtomikTypographyWeight.MEDIUM,
        AtomikTypographyWeight.SEMIBOLD -> UIFontWeightMedium
        AtomikTypographyWeight.THIN,
        AtomikTypographyWeight.LIGHT -> UIFontWeightThin
        AtomikTypographyWeight.EXTRALIGHT -> UIFontWeightUltraLight
    }
