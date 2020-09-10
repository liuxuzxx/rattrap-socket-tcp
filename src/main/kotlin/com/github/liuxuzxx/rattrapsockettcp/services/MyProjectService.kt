package com.github.liuxuzxx.rattrapsockettcp.services

import com.intellij.openapi.project.Project
import com.github.liuxuzxx.rattrapsockettcp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
