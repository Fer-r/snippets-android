plugins {
    id("com.android.application")
    id("kotlin-android")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.google.firebase.example.analytics"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.google.firebase.example.analytics"
        minSdk = 21
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        multiDexEnabled = true
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("com.google.firebase:firebase-analytics:22.5.0")
    // Ironsource and AppLovin libraries used for ad_impression snippets
    implementation("com.applovin:applovin-sdk:11.5.1")
    implementation("com.ironsource.sdk:mediationsdk:7.2.4.1")

}
