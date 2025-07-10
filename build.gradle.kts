plugins {
    application
}

group = "com.example"
version = "1.0"

repositories {
    mavenCentral()
}

application {
    mainClass.set("animalshelter.Main")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

