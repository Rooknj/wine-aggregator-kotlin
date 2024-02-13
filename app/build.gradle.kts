val MOCKK_VERSION: String by project

plugins {
    kotlin("jvm")
}

dependencies {

    testImplementation("io.mockk", "mockk", MOCKK_VERSION)
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
