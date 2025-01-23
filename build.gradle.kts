plugins {
    id("com.android.library") version "7.0.4" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
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

buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://jitpack.io")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.4")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
        classpath("com.github.recloudstream:gradle:master-SNAPSHOT")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.github.Blatzar:NiceHttp:0.4.3")
    implementation("org.jsoup:jsoup:1.15.3")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.1")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.1")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.13.1")
}

cloudstream {
    description = "DDizi.im için Cloudstream eklentisi"
    authors = listOf("azrailankara")
    language = "tr"
    status = 1
    tvTypes = listOf("TvSeries")
} 