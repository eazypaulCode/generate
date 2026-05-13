plugins {
    kotlin("jvm") version "2.3.20"
    id("com.gradleup.shadow") version "9.4.1"
    application
}

group = "es.paulcod"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.ajalt.clikt:clikt:5.0.1")
    implementation("com.github.ajalt.clikt:clikt-markdown:5.0.1")
}

kotlin {
    jvmToolchain(24)
}

application {
    mainClass.set("es.paulcod.generate.MainKt")
}

tasks {
    shadowJar {
        mergeServiceFiles()
    }
}