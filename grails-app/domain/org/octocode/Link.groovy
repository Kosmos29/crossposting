package org.octocode

import org.jadira.usertype.dateandtime.joda.PersistentLocalDate
import org.joda.time.LocalDate

class Link extends VirtualDeletable {
    String link
    float probability

    LocalDate dateCreated
    LocalDate lastUpdated

    static constraints = {
        link url: true, blank: false
        probability range: 0..1
        dateCreated type: PersistentLocalDate
        lastUpdated type: PersistentLocalDate
    }
    static hasMany = [anchors: Anchor]
    static belongsTo = [project: Project]
}
