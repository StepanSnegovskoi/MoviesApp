plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.moviesapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.moviesapp"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)

    // Работа с интернетом
    implementation(libs.retrofit)

    // Преобразует джейсон в объекты наших классов
    implementation(libs.converter.gson)

    // Многопоточность
    // Адаптер для связи ретрофита и RxJava
    implementation(libs.adapter.rxjava3)
    implementation(libs.rxandroid)
    implementation(libs.rxjava)
    implementation(libs.room.rxjava3)

    // База данных
    implementation(libs.room.runtime)
    annotationProcessor(libs.room.compiler)

    // Вставка картинок по URL
    implementation(libs.glide)

    annotationProcessor(libs.compiler)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}