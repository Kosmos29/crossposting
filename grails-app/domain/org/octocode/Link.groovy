package org.octocode

import org.joda.time.DateTime

class Link extends Entity {
    String link
    int probability

    DateTime dateCreated
    DateTime lastUpdated

    static constraints = {
        link url: true, blank: false
        probability range: 0..100
    }
    static hasMany = [anchors: Anchor]
    static belongsTo = [project: Project]
}
