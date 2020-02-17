plugins {
    kotlin("js") version "1.3.61"
}

group = "com.github.sakebook"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

kotlin {
    target {
        nodejs()
        browser {
            this.webpackTask {
                this.destinationDirectory = File("src/main/resources")
            }
        }
    }
    sourceSets["main"].dependencies {
        implementation(npm("dayjs", "^1.8.20"))
    }
}

tasks {
    compileKotlinJs {
        kotlinOptions {
            moduleKind = "umd"
        }
    }
}
