package com.github.yyt231.mvvmplugin.services

import com.intellij.openapi.project.Project
import com.github.yyt231.mvvmplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
