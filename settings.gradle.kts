pluginManagement {
    repositories {
        maven {
            url = uri("https://artifactory.corp.ebay.com/artifactory/android/")
        }
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        maven {
            url = uri("https://artifactory.corp.ebay.com/artifactory/android/")
        }
        mavenCentral()
    }
}

rootProject.name = "communication-java-sdk"
