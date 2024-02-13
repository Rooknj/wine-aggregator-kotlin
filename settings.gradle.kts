rootProject.name = "wine-aggregator"

include("app")

pluginManagement {
    val KOTLIN_VERSION: String by settings
    val SPOTLESS_PLUGIN_VERSION: String by settings
    val SPRING_BOOT_VERSION: String by settings
    val KOTLIN_PLUGIN_SPRING_VERSION: String by settings

    plugins {
        kotlin("jvm") version KOTLIN_VERSION
        id("com.diffplug.spotless") version SPOTLESS_PLUGIN_VERSION
        id("org.springframework.boot") version SPRING_BOOT_VERSION
        // automatically opens classes and methods annotated or meta-annotated with Spring annotations.
        kotlin("plugin.spring") version KOTLIN_PLUGIN_SPRING_VERSION
        // generates no-arg constructors for any class annotated with @Entity, @MappedSuperclass or @Embeddable.
        //  kotlin("plugin.jpa") version KOTLIN_PLUGIN_SPRING_VERSION
    }
}
