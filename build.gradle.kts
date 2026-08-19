plugins {
    `java-library`
    `maven-publish`
    id("org.owasp.dependencycheck") version "12.1.3"
}

group = "com.ebay"
version = "0.1.0"

java {
    toolchain { languageVersion.set(JavaLanguageVersion.of(17)) }
}

dependencies {
    api("com.microsoft.kiota:microsoft-kiota-bundle:1.9.3")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-json:1.9.3")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-text:1.9.3")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-form:1.9.3")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-multipart:1.9.3")

    compileOnly("jakarta.annotation:jakarta.annotation-api:2.1.1")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.21.5")
    implementation("org.slf4j:slf4j-api:2.0.17")

}


// SEC-011: CVE scanning
dependencyCheck {
    failBuildOnCVSS = 7.0f
    suppressionFile = "dependency-check-suppressions.xml"
    analyzers {
        assemblyEnabled = false
        ossIndexEnabled = false
    }
    nvd {
        apiKey = System.getenv("NVD_API_KEY") ?: ""
    }
}

// SEC-011: Dependency locking
dependencyLocking {
    lockAllConfigurations()
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
