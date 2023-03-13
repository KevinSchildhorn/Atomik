//
//  +UIView.swift
//  AtomikSample
//
//  Created by Kevin Schildhorn on 3/12/23.
//

import UIKit
import AtomikSampleShared

extension UIView {
    func applyColorAtom(colorAtom: AtomikColorAtom?) {
        if let colorAtom {
            backgroundColor = colorAtom.color.uiColor
        }
    }
}
/*
extension UILabel {
    func applyTextAtom(textAtom: AtomikTextAtom?) {
        textAtom?.let {
            this.setTextColor(it.textColor.uiColor)
            this.setFont(this.font.fontWithSize(it.typography.typography.size.toDouble()))
        }
    }
}*/
