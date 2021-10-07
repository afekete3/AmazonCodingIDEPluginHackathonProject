package com.github.afekete3.amazoncodingidepluginhackathonproject.services

import com.intellij.openapi.project.Project
import com.github.afekete3.amazoncodingidepluginhackathonproject.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
