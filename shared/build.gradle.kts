plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidKotlinMultiplatformLibrary)
    alias(libs.plugins.mokkery)
}

kotlin {
    androidLibrary {
        namespace = "com.tezov.shared"
        compileSdk = 36
        minSdk = 24
        withHostTestBuilder {
        }
    }
    val xcfName = "sharedKit"
    iosArm64 {
        binaries.framework {
            baseName = xcfName
        }
    }
    iosSimulatorArm64 {
        binaries.framework {
            baseName = xcfName
        }
    }
    sourceSets {
        commonTest {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }
    }

}