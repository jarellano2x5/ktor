val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val exposed_version: String by project

plugins {
    kotlin("jvm") version("1.8.0")
    kotlin("plugin.serialization") version("1.8.0")
    id("io.ktor.plugin") version("2.2.4")
}

group = "com.tutorial"
version = "0.0.1"

application {
    mainClass.set("com.tutorial.ApplicationKt")
}

/*sourceSets {
    main.kotlin.srcDirs = main.java.srcDirs = ["src"]
    test.kotlin.srcDirs = test.java.srcDirs = ["test"]
    main.resources.srcDirs = ["resources"]
    test.resources.srcDirs = ["testresources"]
}*/

repositories {
    mavenCentral()
    //jcenter()
    //maven { url 'https://kotlin.bintray.com/ktor' }
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-netty-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-resources:$ktor_version")
    implementation("io.ktor:ktor-server-content-negotiation:$ktor_version")
    implementation("io.ktor:ktor-serialization-gson:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("org.jetbrains.exposed:exposed-core:$exposed_version")
    implementation("org.jetbrains.exposed:exposed-dao:$exposed_version")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposed_version")
    implementation("org.postgresql:postgresql:42.7.0")
    testImplementation("io.ktor:ktor-server-tests-jvm:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}
