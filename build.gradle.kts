// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("org.jetbrains.kotlin.jvm") version "1.9.23"
    id("com.google.devtools.ksp") version "2.0.21-1.0.26" apply false
    id("com.google.dagger.hilt.android") version "2.52" apply false
}