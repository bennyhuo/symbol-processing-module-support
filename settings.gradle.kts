pluginManagement {
    repositories {
        maven("https://mirrors.tencent.com/nexus/repository/maven-public")
        gradlePluginPortal()
    }
}

include(":apt-module-support")
include(":common-module-support")
include(":ksp-module-support")
include(":xprocessing-module-support")
include(":annotations-module-support")