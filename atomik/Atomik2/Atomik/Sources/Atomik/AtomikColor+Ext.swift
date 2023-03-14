//
//  AtomikColor+Ext.swift
//  Atomik
//
//  Created by Kevin Schildhorn on 3/13/23.
//

import SwiftUI
import AtomikShared

extension AtomikColor {
    var swiftUIColor: Color {
        return Color(self.uiColor)
    }
}
