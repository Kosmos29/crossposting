package org.octocode

import org.joda.time.DateTime

class Blog extends Entity {
    String name
    String host
    int port
    String login
    String password
    Boolean isActive = true

    DateTime dateCreated
    DateTime lastUpdated

    static hasMany = [projects: Project]
    static constraints = {
        name blank: false
        host blank: false
        login blank: false
        password blank: false
    }
}
