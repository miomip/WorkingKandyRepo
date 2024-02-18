plugins {
    application
    kotlin("jvm") version "1.9.22"
}

group = "me.miomip"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kandy-lets-plot:0.5.0")
}

application {
    mainClass.set("me.miomip.MainKt")
}

kotlin {
    jvmToolchain(21)
}