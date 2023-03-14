
plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("com.github.ben-manes.versions") version "0.43.0"
    id("org.jlleitschuh.gradle.ktlint") version "11.0.0"
    id("org.jetbrains.dokka") version "1.7.10"
}

group = "me.kevinschildhorn"
version = "1.0"

kotlin {
    /*
    cocoapods {
        summary = "Some description for a Kotlin/Native module"
        homepage = "Link to a Kotlin/Native module homepage"
        name = "AtomikShared"
        framework {
            baseName = "AtomikShared"
            isStatic = false
            embedBitcode(BITCODE)
        }
    }*/

    android()
    ios()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation("co.touchlab:kermit:1.2.2")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependencies {
                api("androidx.appcompat:appcompat:1.6.1")
                api("androidx.core:core-ktx:1.9.0")
                implementation("androidx.compose.ui:ui:1.3.3")
                implementation("androidx.compose.foundation:foundation:1.3.1")
                implementation("androidx.compose.material:material:1.3.1")
                implementation("androidx.compose.runtime:runtime:1.3.3")
            }
        }
        val iosMain by getting {
            dependencies {
            }
        }
    }
}

@Suppress("UnstableApiUsage")
android {
    compileSdk = 33
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
