//
//  TopBar.swift
//  AtomikSample
//
//  Created by Kevin Schildhorn on 3/11/23.
//

import SwiftUI

struct TopBar: View {

    @Binding var value: Bool

    var body: some View {
        HStack {
            Toggle("SwiftUI", isOn: $value).foregroundColor(.black)
            Text("UIKit")
        }.frame(height: 44.0).background(.gray)
    }
}
