plugins {
    id("com.android.application")
    id("kotlin-android")
    id("com.google.gms.google-services")
}

android {
    namespace = "devrel.firebase.google.com.functions"
    compileSdk = 36

    defaultConfig {
        applicationId = "devrel.firebase.google.com.functions"
        minSdk = 21
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    // Import the BoM for the Firebase platform
    implementation(platform("com.google.firebase:firebase-bom:33.16.0"))

    // Add the dependency for the Cloud Functions library
    // When using the BoM, you don't specify versions in Firebase library dependencies
    // TODO(thatfiredev): remove the pinned dependency version when
    //   https://github.com/firebase/firebase-android-sdk/issues/6522 is fixed
    implementation("com.google.firebase:firebase-functions:21.0.0")

    // For streaming callable Cloud Functions
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactive:1.10.2")
}
