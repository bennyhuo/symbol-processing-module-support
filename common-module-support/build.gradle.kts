import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    java
}

dependencies {
    implementation(kotlin("stdlib"))
    api(project(":annotations-module-support"))
}