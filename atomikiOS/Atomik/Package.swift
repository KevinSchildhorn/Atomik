// swift-tools-version: 5.7
// The swift-tools-version declares the minimum version of Swift required to build this package.

import PackageDescription

let package = Package(
    name: "Atomik",
    products: [
        .library(
            name: "Atomik",
            targets: ["Atomik"]),
    ],
    dependencies: [],
    targets: [
        // Targets are the basic building blocks of a package. A target can define a module or a test suite.
        // Targets can depend on other targets in this package, and on products in packages this package depends on.
        .target(
            name: "Atomik",
            dependencies: []),
        .testTarget(
            name: "AtomikTests",
            dependencies: ["Atomik"]),
        .binaryTarget(
            name: "AtomikShared",
            path: "../../atomik/atomik/build/cocoapods/framework/AtomikShared.framework"
        ),
    ]
)
