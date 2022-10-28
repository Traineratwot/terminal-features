package com.github.traineratwot.terminalfeatures.services

import com.github.traineratwot.terminalfeatures.MyBundle
import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project

@Service
class ProjectService(private val myProject: Project) {
    init {

    }
}