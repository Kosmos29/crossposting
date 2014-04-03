package org.octocode

class ProjectController {

    def index() { }

    def list() {
        [list: Project.list()]
    }
}
