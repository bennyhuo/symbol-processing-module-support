import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    java
}

dependencies {
    implementation(kotlin("stdlib"))

    api(project(":common-module-support"))

    compileOnly("androidx.room:room-compiler-processing:2.5.2")
    compileOnly("com.google.devtools.ksp:symbol-processing-api:1.8.20-1.0.11")
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        freeCompilerArgs = listOf(
            "-Xjvm-default=all",
            "-Xopt-in=androidx.room.compiler.processing.ExperimentalProcessingApi"
        )
    }
}