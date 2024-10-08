pluginManagement {
    repositories {
        mavenLocal()
        maven {
            url = uri("$rootDir/repository")
        }
        maven { setUrl("https://mirrors.tencent.com/nexus/repository/maven-public/") }
        maven { setUrl("https://jitpack.io") }
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenLocal()
        maven {
            url = uri("$rootDir/repository")
        }
        maven { setUrl("https://mirrors.tencent.com/nexus/repository/maven-public/") }
        maven { setUrl("https://jitpack.io") }
        google()
        mavenCentral()
    }
}

rootProject.name = "plugin"
include(":app")
include(":upload-gradle-plugin")
//includeBuild("upload-gradle-plugin")
