plugins {
    alias(libs.plugins.runique.android.feature.ui)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.plcoding.run.presentation"
}

dependencies {
    implementation(libs.coil.compose)
    implementation(libs.google.maps.android.compose)
    implementation(libs.androidx.activity.compose)
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.run.domain)
}