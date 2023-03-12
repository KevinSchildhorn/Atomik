//
//  ScreenTitleTextField.swift
//  AtomikSample
//
//  Created by Kevin Schildhorn on 12/16/22.
//

import SwiftUI
import AtomikSampleShared

struct ErrorView: View {

    /*
    var font: Font? {
         var font: Font?
         if let uiFont: UIFont = atom?.uiFont {
             font = Font(uiFont)
         }
         return font
     }*/

    let text: String
    let atom: AtomikFigmaShapeAtom = KevinAtoms.shared.errorViewAtom

    var body: some View {
        ForEach(0..<atom.subComponents.count) { index in
            if let subAtom = atom.subComponents[index] as? AtomikFigmaBaseAtom {
                ErrorViewText(text: text, atom: subAtom)
            }
        }
        .background(atom.color.swiftUIColor)
        // .frame(alignment: Alignment.topLeading)
    }
}

private struct ErrorViewText: View {

    let text: String
    let atom: AtomikFigmaBaseAtom

    var body: some View {
        Text(text)
            .foregroundColor(.red)
    }
}

struct SampleText_Previews: PreviewProvider {
    static var previews: some View {
        ErrorView(text: "Hello World")
    }
}
