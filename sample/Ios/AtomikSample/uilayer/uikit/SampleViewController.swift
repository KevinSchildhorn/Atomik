//
//  SampleViewController.swift
//  AtomikSample
//
//  Created by Kevin Schildhorn on 3/11/23.
//

import Foundation
import UIKit
import AtomikSampleShared

class SampleViewController: UIViewController {

    let atom: AtomikFigmaShapeAtom = KevinAtoms.shared.errorViewAtom

    private var label: UILabel = {
        let label = UILabel()
        label.text = "Hello World"
        label.textColor = .black
        label.translatesAutoresizingMaskIntoConstraints = false
        return label
    }()

    init() {
        super.init(nibName: nil, bundle: nil)
    }

    override func viewDidLoad() {
        super.viewDidLoad()
        label.applyColorAtom(colorAtom: atom)

        view.addSubview(label)
        view.translatesAutoresizingMaskIntoConstraints = false
         NSLayoutConstraint.activate([
            label.leadingAnchor.constraint(equalTo: view.leadingAnchor),
            label.topAnchor.constraint(equalTo: view.topAnchor)
         ])
    }

    required init?(coder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }
}
