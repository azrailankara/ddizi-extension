plugins {
    id("com.android.library") version "7.0.4"
    id("org.jetbrains.kotlin.android") version "1.7.10"
}

android {
    compileSdk = 33

    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.github.Blatzar:NiceHttp:0.4.3")
    implementation("org.jsoup:jsoup:1.15.3")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.1")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.1")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.13.1")

    // cloudstream
    implementation("com.github.recloudstream:cloudstream:pre-release")
}

// cloudstream
apply(from = "https://raw.githubusercontent.com/recloudstream/gradle/master/cloudstream.gradle")
repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
} 