import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
}

group = "de.rubixdev"
version = "1.0"

repositories {
    mavenCentral()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}