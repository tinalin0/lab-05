plugins {
    alias(libs.plugins.android.application)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.lab5_starter"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.lab5_starter"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
//    implementation(platform("com.google.firebase:firebase-bom:34.8.0"))
//    implementation("com.google.firebase:firebase-analytics")
    // Source - https://stackoverflow.com/a/51596806
// Posted by Alex Mamo
// Retrieved 2026-02-03, License - CC BY-SA 4.0
    implementation("com.google.firebase:firebase-firestore:17.0.4")
    implementation("com.google.firebase:firebase-core:16.0.1")
    implementation("com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava")

}
