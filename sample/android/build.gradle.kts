plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jlleitschuh.gradle.ktlint")
    id("org.jetbrains.compose")
}

group = "com.kevinschildhorn"
version = "0.0.2"

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "15"
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation(project(":sample:common"))
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.6.1")
    implementation(compose.runtime)
    implementation(compose.foundation)
    implementation(compose.material)
    implementation(compose.preview)
    implementation(compose.ui)
    implementation("androidx.activity:activity-compose:1.7.0")

    debugImplementation("androidx.customview:customview:1.2.0-alpha02")
    debugImplementation("androidx.customview:customview-poolingcontainer:1.0.0")
    implementation("androidx.cardview:cardview:1.0.0")
}

@Suppress("UnstableApiUsage")
android {

    compileSdk = 33
    defaultConfig {
        applicationId = "com.kevinschildhorn.sampleandroid"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        viewBinding = true
        compose = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_15
        targetCompatibility = JavaVersion.VERSION_15
    }
}
