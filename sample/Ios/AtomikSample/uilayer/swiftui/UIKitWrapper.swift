//
//  UIKitWrapper.swift
//  AtomikSample
//
//  Created by Kevin Schildhorn on 3/11/23.
//

import Foundation
import SwiftUI

struct UIKitWrapper: UIViewControllerRepresentable {
    typealias UIViewControllerType = SampleViewController

    func updateUIViewController(_ uiViewController: SampleViewController, context: Context) {
    }

    func makeUIViewController(context: Context) -> SampleViewController {
        return SampleViewController()
    }
}
