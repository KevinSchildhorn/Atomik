//
//  SampleViewController.swift
//  AtomikSample
//
//  Created by Kevin Schildhorn on 3/11/23.
//

import Foundation
import UIKit

class SampleViewController: UIViewController {

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
