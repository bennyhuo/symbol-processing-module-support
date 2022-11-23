plugins {
    kotlin("jvm")
    java
}

dependencies {
    implementation(kotlin("stdlib"))
    api(project(":common-module-support"))

    compileOnly("com.squareup:javapoet:1.13.0")
}