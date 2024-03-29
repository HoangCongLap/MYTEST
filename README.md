# GUIDELINE

## 1. ANDROID STUDIO (VERSION HEDGEHOG 2023.11)

## 2. FIREBASE (VERSION 10.7.1)

## 3. plugins {

    id("com.android.application") version "8.1.2" apply false

}

## 4. android {

    namespace = "com.example.mytest"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mytest"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

## 5. compileOptions {

        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
