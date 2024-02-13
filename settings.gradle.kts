rootProject.name = "wine-aggregator"

include("app")

pluginManagement {
    val KOTLIN_VERSION: String by settings
    val SPOTLESS_PLUGIN_VERSION: String by settings

    plugins {
        kotlin("jvm") version KOTLIN_VERSION
        id("com.diffplug.spotless") version SPOTLESS_PLUGIN_VERSION
    }
}
