package org.octocode

import org.jadira.usertype.dateandtime.joda.PersistentLocalDate
import org.joda.time.LocalDate

class Blog extends VirtualDeletable {
    String name
    String host
    int port
    String login
    String password
    Boolean isActive = true

    LocalDate dateCreated
    LocalDate lastUpdated

    static hasMany = [projects: Project]
    static constraints = {
        name blank: false
        host blank: false, unique: true
        login blank: false
        password blank: false
        dateCreated type: PersistentLocalDate
        lastUpdated type: PersistentLocalDate
    }
}
