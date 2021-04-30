// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
   
    repositories {
        google()
        jcenter()
    }
//    print("${libs.versions.kotlin}")
    dependencies {
        classpath libs.agp
        classpath libs.kotlin

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
}