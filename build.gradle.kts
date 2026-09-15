import net.ltgt.gradle.errorprone.errorprone

plugins {
    `java-library`
    `maven-publish`
    id("org.owasp.dependencycheck") version "12.1.3"
    id("net.ltgt.errorprone") version "4.3.0"
}

group = "com.ebay"
version = "0.2.0"

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

    errorprone("com.google.errorprone:error_prone_core:2.42.0")
    errorprone("com.uber.nullaway:nullaway:0.12.10")

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
            version = "0.2.0"
        }
    }
}


val lintRequested = gradle.startParameter.taskNames.any { it == "lint" || it.endsWith(":lint") }

tasks.withType<JavaCompile>().configureEach {
    inputs.property("lintRequested", lintRequested)
    options.errorprone {
        isEnabled.set(lintRequested)
        disableWarningsInGeneratedCode.set(true)
        excludedPaths.set(".*/generated/.*")
        error("NullAway")
        option("NullAway:AnnotatedPackages", "com.ebay.communication")
        option("NullAway:UnannotatedSubPackages", "com.ebay.communication.generated")
    }
}

tasks.register("lint") {
    group = "verification"
    description = "Static analysis of handwritten sources (Kiota output excluded)."
    dependsOn("classes")
}
