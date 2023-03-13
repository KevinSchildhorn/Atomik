import org.jetbrains.kotlin.gradle.plugin.mpp.Framework.BitcodeEmbeddingMode.BITCODE

plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
    id("com.github.ben-manes.versions") version "0.43.0"
    id("org.jlleitschuh.gradle.ktlint") version "11.0.0"
}

group = "me.kevinschildhorn"
version = "1.0"

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "15"
    }
}

kotlin {
    cocoapods {
        summary = "Some description for a Kotlin/Native module"
        homepage = "Link to a Kotlin/Native module homepage"
        framework {
            baseName = "AtomikSampleShared"
            isStatic = false
            embedBitcode(BITCODE)
        }
    }

    android()
    ios()
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation("co.touchlab:kermit:1.2.2")
                implementation("co.touchlab:kermit-koin:1.2.2")
                implementation(project(":atomik:atomik"))
            }
        }
    }
}

android {
    compileSdk = 33
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    @Suppress("UnstableApiUsage")
    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_15
        targetCompatibility = JavaVersion.VERSION_15
    }
}
