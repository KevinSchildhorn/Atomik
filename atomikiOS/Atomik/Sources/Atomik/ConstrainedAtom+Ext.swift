//
//  ConstrainedAtom+Ext.swift
//  Atomik
//
//  Created by Kevin Schildhorn on 3/13/23.
//

import AtomikShared
import SwiftUI

extension ConstrainedAtom {
    var alignmentVertical: VerticalAlignment {
        switch constraintY {
            case AtomikConstraintY.alignTop: return VerticalAlignment.top
            case AtomikConstraintY.alignBottom: return VerticalAlignment.bottom
            case AtomikConstraintY.center: return VerticalAlignment.center
            case AtomikConstraintY.scale: return VerticalAlignment.center
            default: return VerticalAlignment.center
        }
    }

    var alignmentHorizontal: HorizontalAlignment {
        switch constraintX {
            case AtomikConstraintX.alignLeft: return HorizontalAlignment.leading
            case AtomikConstraintX.alignRight: return HorizontalAlignment.trailing
            case AtomikConstraintX.center: return HorizontalAlignment.center
            case AtomikConstraintX.scale: return HorizontalAlignment.center
            default: return HorizontalAlignment.center
        }
    }
    var alignment: Alignment {
        Alignment(horizontal: alignmentHorizontal, vertical: alignmentVertical)
    }
}
