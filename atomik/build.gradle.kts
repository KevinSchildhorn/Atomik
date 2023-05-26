import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.compose.ComposeCompilerKotlinSupportPlugin
import com.vanniktech.maven.publish.KotlinMultiplatform
import com.vanniktech.maven.publish.JavadocJar

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("com.github.ben-manes.versions")
    id("org.jetbrains.compose")
    id("org.jetbrains.dokka")
    id("org.jlleitschuh.gradle.ktlint")
    id("com.vanniktech.maven.publish")
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

group = "io.github.kevinschildhorn"
version = "0.0.3"

mavenPublishing {
    coordinates("io.github.kevinschildhorn", "atomik", "0.0.3")

    pom {
        name.set("Atomik")
        description.set("Atomik is a Kotlin Multiplatform library that acts as an implementation of a design system in your shared code.")
        inceptionYear.set("2023")
        url.set("https://github.com/KevinSchildhorn/Atomik/")
        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }
        developers {
            developer {
                id.set("kevinschildhorn")
                name.set("Kevin Schildhorn")
                url.set("https://github.com/KevinSchildhorn/")
            }
        }
        scm {
            url.set("https://github.com/KevinSchildhorn/Atomik/")
            connection.set("scm:git:git://github.com/KevinSchildhorn/Atomik.git")
            developerConnection.set("scm:git:ssh://git@github.com/KevinSchildhorn/Atomik.git")
        }
    }

    publishToMavenCentral(SonatypeHost.S01, true)
    signAllPublications()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "15"
    }
}

kotlin {
    explicitApi()
    android()
    ios {
        binaries {
            framework {
                baseName = "atomik"
            }
        }
    }
    jvmToolchain(15)
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
            dependsOn(commonMain)
            dependencies {
                api("androidx.appcompat:appcompat:1.6.1")
                api("androidx.core:core-ktx:1.10.1")
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.ui)
            }
        }
        val iosMain by getting {
            dependsOn(commonMain)
            dependencies {
            }
        }
    }
}

@Suppress("UnstableApiUsage")
android {
    namespace = "com.kevinschildhorn.atomik"

    compileSdk = 33

    defaultConfig {
        minSdk = 26
        targetSdk = 33
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_15
        targetCompatibility = JavaVersion.VERSION_15
    }

    buildFeatures {
        compose = true
    }
    sourceSets {
        named("main") {
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
            res.srcDirs("src/androidMain/res")
        }
    }
}
