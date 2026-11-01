// Top-level build file
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    // KSP version must match the Kotlin version (Kotlin 2.0.21 -> KSP 2.0.21-1.0.27)
    id("com.google.devtools.ksp") version "2.0.21-1.0.27" apply false
}
