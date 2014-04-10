package org.octocode
import org.joda.time.DateTime

class Project extends Entity {
    String name
    String description
    Boolean isActive = true

    DateTime dateCreated
    DateTime lastUpdated
    DateTime activationDate

    static belongsTo = Blog
    static hasMany = [links: Link, promotionTexts: Post, promotingSites: Blog]

    static constraints = {
        name blank: false
        description blank: false,  maxSize: 4096
        activationDate nullable: true
    }
}
