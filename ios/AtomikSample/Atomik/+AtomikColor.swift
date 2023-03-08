//
//  +AtomikColor.swift
//  AtomikSample
//
//  Created by Kevin Schildhorn on 3/7/23.
//

import Foundation
import AtomikSampleShared
import SwiftUI

extension AtomikAtomikColor {
    var swiftUIColor: Color {
        let cl = platformColor
        var red: CGFloat = 0
        var green: CGFloat = 0
        var blue: CGFloat = 0
        var alpha: CGFloat = 0
        cl.getRed(&red, green: &green, blue: &blue, alpha: &alpha)

        return Color(platformColor)
    }
}
