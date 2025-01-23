plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.lagradost.cloudstream3.gradle") version "2.0"
}

android {
    compileSdk = 33
    
    defaultConfig {
        minSdk = 21
        targetSdk = 33
        manifestPlaceholders["CLOUDSTREAM_API_KEY"] = "0123456789"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
} 