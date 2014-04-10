package org.octocode

import org.joda.time.DateTime

class Post extends Entity {
    String text
    PostState state

    DateTime dateCreated
    DateTime lastUpdated
    DateTime postingDate

    static constraints = {
        text blank: false, maxSize: 8000
        state blank: false
        postingDate nullable: true
    }
    static belongsTo = [project: Project]
    static mapping = {
        state enumType: 'ordinal'
    }
}
