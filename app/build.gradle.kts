plugins {
    id ("com.android.application")
    id ("kotlin-android")
    id ("androidx.navigation.safeargs.kotlin")
    id ("com.google.devtools.ksp") version ("1.8.0-1.0.8")
}
android {
    namespace = "edu.quinnipiac.ser210.guessinggame"
    compileSdk = 34

    defaultConfig {
        applicationId = "edu.quinnipiac.ser210.guessinggame"
        minSdk = 22
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        viewBinding= true
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
    implementation  ("androidx.appcompat:appcompat:$appcompat_version")
    implementation ("androidx.constraintlayout:constraintlayout:$constraintlayout_version")
    implementation ("androidx.core:core-ktx:$core_ktx_version")
    implementation ("com.google.android.material:material: $material_version")

    // Lifecycle libraries
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    // Navigation libraries
    implementation ("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation ("androidx.navigation:navigation-ui-ktx:$nav_version")

    // Room libraries
    implementation ("androidx.room:room-runtime:$room_version")
    implementation ("com.android.support:support-annotations:28.0.0")
    ksp("androidx.room:room-compiler:$room_version")
    implementation ("androidx.room:room-ktx:$room_version")
}