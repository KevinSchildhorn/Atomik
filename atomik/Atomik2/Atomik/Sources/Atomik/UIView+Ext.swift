//
//  UIView+Ext.swift
//  Atomik
//
//  Created by Kevin Schildhorn on 3/13/23.
//

import UIKit
import AtomikShared

extension UIView {
    func applyColorAtom(colorAtom: ColorAtom?) {
        if let colorAtom {
            backgroundColor = colorAtom.color.uiColor
        }
    }
}

extension UILabel {
    func applyTextAtom(textAtom: TextAtom?) {
        if let textAtom {
            self.textColor = textAtom.textColor.uiColor
            self.font = self.font.withSize(Double(textAtom.typography.typography.size))
        }
    }
}
