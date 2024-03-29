//
//  AtomikSampleApp.swift
//  AtomikSample
//
//  Created by Kevin Schildhorn on 9/7/22.
//

import SwiftUI
import AtomikSampleShared

@main
struct AtomikSampleApp: App {

    @State var toggle: Bool = false

    init() {
        /*
        DesignSystemKt.designSystem.fontFamily =
            AtomikAtomikFontFamily(uiFonts: [
                .bold: UIFont(name: "Quicksand-Bold", size: 12)!,
                .light: UIFont(name: "Quicksand-Light", size: 12)!,
                .medium: UIFont(name: "Quicksand-Medium", size: 12)!,
                .normal: UIFont(name: "Quicksand-Regular", size: 12)!,
                .semibold: UIFont(name: "Quicksand-SemiBold", size: 12)!
            ])
         */
    }

    var body: some Scene {
        WindowGroup {
            VStack {
                TopBar(value: $toggle)
                if !toggle {
                    HStack {
                        ErrorView(text: "Hello World")
                        Spacer()
                    }
                } else {
                    UIKitWrapper()
                }
                Spacer()
            }
            .frame(maxWidth: .infinity, maxHeight: .infinity)
        }
    }
}
