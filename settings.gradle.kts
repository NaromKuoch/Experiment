

fun includeProject(name: String, filePath: String? = null){
    settings.include(name)
    val project = project(name)
    if(filePath != null) {
        project.projectDir = File(rootDir, filePath)
    }
    project.configureBuildFileName(name)
}

fun ProjectDescriptor.configureBuildFileName(projectName: String) {
    val name = projectName.substringAfterLast(":")
    buildFileName = "$name.gradle"
    if(!buildFile.exists()){
        buildFileName = "$name.gradle.kts"
    }
}

includeProject( ":app")
rootProject.name = "Experiment"

enableFeaturePreview("VERSION_CATALOGS")