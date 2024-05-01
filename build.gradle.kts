plugins {
    //trick: for the same plugin versions in all sub-modules
    val idVersions = "7.4.1"
    val kotlinVersions = "1.8.0"
    id("com.android.application").version(idVersions).apply(false)
    id("com.android.library").version(idVersions).apply(false)
    kotlin("android").version(kotlinVersions).apply(false)
    kotlin("multiplatform").version(kotlinVersions).apply(false)
//    id("org.jetbrains.kotlin.android") version "1.8.20-Beta" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
