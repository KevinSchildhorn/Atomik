buildscript {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.4.2")
        classpath(kotlin("gradle-plugin", "1.8.10"))
    }
}

project.ext {
    set("versionCode",1)
    set("versionName","0.0.1")
    set("namespace","com.kevinschildhorn")
}