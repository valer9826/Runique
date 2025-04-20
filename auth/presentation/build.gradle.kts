plugins {
    alias(libs.plugins.runique.android.feature.ui)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.plcoding.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}