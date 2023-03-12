//
//  +ConstrainedAtom.swift
//  AtomikSample
//
//  Created by Kevin Schildhorn on 3/7/23.
//

import Foundation
import AtomikSampleShared
import SwiftUI

extension AtomikConstrainedAtom {
    var alignmentVertical: VerticalAlignment {
        switch constraintY {
            case AtomikAtomikConstraintY.alignTop: return VerticalAlignment.top
            case AtomikAtomikConstraintY.alignBottom: return VerticalAlignment.bottom
            case AtomikAtomikConstraintY.center: return VerticalAlignment.center
            case AtomikAtomikConstraintY.scale: return VerticalAlignment.center
            default: return VerticalAlignment.center
        }
    }

    var alignmentHorizontal: HorizontalAlignment {
        switch constraintX {
            case AtomikAtomikConstraintX.alignLeft: return HorizontalAlignment.leading
            case AtomikAtomikConstraintX.alignRight: return HorizontalAlignment.trailing
            case AtomikAtomikConstraintX.center: return HorizontalAlignment.center
            case AtomikAtomikConstraintX.scale: return HorizontalAlignment.center
            default: return HorizontalAlignment.center
        }
    }
    var alignment: Alignment {
        Alignment(horizontal: alignmentHorizontal, vertical: alignmentVertical)
    }
}
