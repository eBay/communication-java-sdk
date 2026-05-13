plugins {
    `java-library`
    `maven-publish`
}

group = "com.ebay"
version = "1.0.0"

java {
    toolchain { languageVersion.set(JavaLanguageVersion.of(17)) }
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://ebaycentral.qa.ebay.com/content/repositories/central")
        credentials {
***REMOVED***
***REMOVED***
        }
    }
    maven {
        url = uri("https://ebaycentral.corp.ebay.com/content/groups/aggregator/")
        credentials {
***REMOVED***
***REMOVED***
        }
    }
}

dependencies {
    // REST: Kiota runtime
    api("com.microsoft.kiota:microsoft-kiota-bundle:1.4.+")

    // Kiota serialization libraries (not included in bundle)
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-json:1.4.+")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-text:1.4.+")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-form:1.4.+")
    implementation("com.microsoft.kiota:microsoft-kiota-serialization-multipart:1.4.+")

    // Jakarta annotations (required by Kiota-generated code)
    implementation("jakarta.annotation:jakarta.annotation-api:2.1.1")

    // HTTP: OkHttp (shared by Kiota adapter; kiota-bundle already pulls it in)
    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    // JSON for DynamicGraphQLClient escape hatch
    implementation("com.fasterxml.jackson.core:jackson-databind:2.18.+")

    // Optional: SLF4J for diagnostic logging
    implementation("org.slf4j:slf4j-api:2.0.+")

    testImplementation("org.junit.jupiter:junit-jupiter:5.11.+")
    testImplementation("com.squareup.okhttp3:mockwebserver:4.12.0")
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}
