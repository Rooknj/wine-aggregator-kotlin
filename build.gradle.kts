import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val JAVA_VERSION: String by project
val KOTLIN_VERSION: String by project
val KTLINT_VERSION: String by project

plugins {
    java
    kotlin("jvm") apply false
    id("com.diffplug.spotless")
}

allprojects {
    apply {
        plugin("kotlin")
        plugin("com.diffplug.spotless")
    }

    repositories {
        mavenCentral()
    }

    java {
        sourceCompatibility = JavaVersion.toVersion(JAVA_VERSION)
    }

    spotless {
        kotlin {
            ktlint(KTLINT_VERSION)
            targetExclude("build/**")
        }
        kotlinGradle {
            ktlint(KTLINT_VERSION)
        }
    }
}

subprojects {
    tasks {
        withType<KotlinCompile> {
            kotlinOptions {
                jvmTarget = JAVA_VERSION
                allWarningsAsErrors = true
            }
        }
    }
}
