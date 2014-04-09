package org.octocode

import org.jadira.usertype.dateandtime.joda.PersistentLocalDate
import org.joda.time.LocalDate

class Post extends VirtualDeletable {
    String text
    PostState state

    LocalDate dateCreated
    LocalDate lastUpdated
    LocalDate postingDate

    static constraints = {
        text blank: false, maxSize: 8000
        state blank: false
        dateCreated type: PersistentLocalDate
        lastUpdated type: PersistentLocalDate
        postingDate nullable: true, type: PersistentLocalDate
    }
    static belongsTo = [project: Project]
    static mapping = {
        state enumType: 'ordinal'
    }
}
