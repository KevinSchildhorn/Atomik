import org.jetbrains.compose.ComposeCompilerKotlinSupportPlugin
import org.jetbrains.kotlin.gradle.plugin.mpp.Framework.BitcodeEmbeddingMode.BITCODE

plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
    id("com.github.ben-manes.versions")
    id("org.jetbrains.compose")
    id("org.jlleitschuh.gradle.ktlint")
}

// Exclude compose from iOS
plugins.removeAll { it is ComposeCompilerKotlinSupportPlugin }
class ComposeNoNativePlugin : org.jetbrains.kotlin.gradle.plugin.KotlinCompilerPluginSupportPlugin by ComposeCompilerKotlinSupportPlugin() {
    override fun isApplicable(kotlinCompilation: org.jetbrains.kotlin.gradle.plugin.KotlinCompilation<*>): Boolean {
        return when (kotlinCompilation.target.platformType) {
            org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType.native -> false
            else -> ComposeCompilerKotlinSupportPlugin().isApplicable(kotlinCompilation)
        }
    }
}
apply<ComposeNoNativePlugin>() // Re-adding Compose Compilers only for non-native environments


group = "com.kevinschildhorn"
version = "0.0.2"

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

    jvmToolchain(15)

    android()
    ios()
    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation("co.touchlab:kermit:1.2.2")
                implementation("co.touchlab:kermit-koin:1.2.2")
                implementation(compose.runtime)
                api(project(":atomik"))
                //api("io.github.kevinschildhorn:atomik:0.0.6")
            }
        }
    }
}

android {
    namespace = "com.kevinschildhorn.atomiksampleshared"

    compileSdk = 33
    @Suppress("UnstableApiUsage")
    defaultConfig {
        minSdk = 26
        targetSdk = 33
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_15
        targetCompatibility = JavaVersion.VERSION_15
    }

    sourceSets {
        named("main") {
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
            res.srcDirs("src/androidMain/res")
        }
    }
}
