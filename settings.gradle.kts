pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
        maven("https://jitpack.io")
    }
    plugins {
        val kotlinVersion = "1.8.10"
        kotlin("android").version(kotlinVersion).apply(false)
        kotlin("multiplatform").version(kotlinVersion).apply(false)
        kotlin("native.cocoapods").version(kotlinVersion).apply(false)

        val agpVersion = "7.4.2"
        id("com.android.application").version(agpVersion).apply(false)
        id("com.android.library").version(agpVersion).apply(false)

        id("com.github.ben-manes.versions").version("0.43.0").apply(false)
        id("org.jetbrains.compose").version("1.3.1").apply(false)
        id("org.jetbrains.dokka").version("1.7.10").apply(false)
        id("org.jlleitschuh.gradle.ktlint").version("11.3.1").apply(false)
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
        maven("https://androidx.dev/storage/compose-compiler/repository/")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://plugins.gradle.org/m2/")
    }
}


rootProject.name = "Atomik"
include(":atomik")
include(":sample:common")
include(":sample:android")