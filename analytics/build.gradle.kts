// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id("com.android.application") version "8.11.0" apply false
    id("com.android.library") version "8.11.0" apply false
    id("org.jetbrains.kotlin.android") version "2.2.0" apply false
    id("com.google.gms.google-services") version "4.4.3" apply false
}

allprojects {
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        maven("https://android-sdk.is.com/")
    }
}

tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}
