buildscript {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.2")
        classpath(kotlin("gradle-plugin", "1.8.10"))
    }
}

project.ext {
    set("versionCode",1)
    set("versionName","0.0.2")
    set("namespace","com.kevinschildhorn")
}