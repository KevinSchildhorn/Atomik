pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
        maven("https://jitpack.io")
    }
}

rootProject.name = "Atomik"
include(":atomik")
include(":sample:common")
include(":sample:android")
