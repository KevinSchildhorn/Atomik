//
//  ScreenTitleTextField.swift
//  AtomikSample
//
//  Created by Kevin Schildhorn on 12/16/22.
//

import SwiftUI
import AtomikSampleShared

struct SampleText: View {

    let atom =
    DesignSystemKt.designSystem.atoms[Atoms.errortextview.name] as? AtomikTextViewAtom

    let text: String

    var font: Font? {
         var font: Font?
         if let uiFont: UIFont = atom?.uiFont {
             font = Font(uiFont)
         }
         return font
     }

    var body: some View {

        Text(text)
            .foregroundColor(Color(atom!.textColor.platformColor))
            .font(font)
    }
}

struct SampleText_Previews: PreviewProvider {
    static var previews: some View {
        SampleText(text: "Hello")
    }
}
