package org.octocode

import org.jadira.usertype.dateandtime.joda.PersistentLocalDate
import org.joda.time.LocalDate

class Project extends VirtualDeletable {
    String name
    String description
    Boolean isActive = true

    LocalDate dateCreated
    LocalDate lastUpdated
    LocalDate activationDate

    static belongsTo = Blog
    static hasMany = [links: Link, promotionTexts: Post, promotingSites: Blog]

    static constraints = {
        name blank: false
        description blank: false,  maxSize: 4096
        dateCreated type: PersistentLocalDate
        lastUpdated type: PersistentLocalDate
        activationDate nullable: true, type: PersistentLocalDate
    }
}
