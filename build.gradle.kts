plugins {
    `java-library`
    `maven-publish`
}

group = "com.ebay"
version = "1.0.0"

java {
    toolchain { languageVersion.set(JavaLanguageVersion.of(17)) }
}

dependencies {
    api("com.microsoft.kiota:microsoft-kiota-bundle:1.9.2")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-json:1.9.2")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-text:1.9.2")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-form:1.9.2")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-multipart:1.9.2")

    implementation("jakarta.annotation:jakarta.annotation-api:2.1.1")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.19.0")
    implementation("org.slf4j:slf4j-api:2.0.17")

    testImplementation("org.junit.jupiter:junit-jupiter:5.12.2")
    testImplementation("com.squareup.okhttp3:mockwebserver:4.12.0")
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            groupId = "com.ebay"
            artifactId = "communication-java-sdk"
            version = "1.0.0"
        }
    }
}
