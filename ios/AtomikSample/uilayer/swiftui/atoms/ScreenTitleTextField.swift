//
//  ScreenTitleTextField.swift
//  AtomikSample
//
//  Created by Kevin Schildhorn on 12/16/22.
//

import SwiftUI
import AtomikSampleShared

struct ScreenTitleTextField: View {

    let text: String
    var body: some View {
        Text(text)
    }
}

struct ScreenTitleTextField_Previews: PreviewProvider {
    static var previews: some View {
        ScreenTitleTextField(text: "Hello")
    }
}
