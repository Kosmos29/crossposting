package org.octocode

import org.jadira.usertype.dateandtime.joda.PersistentLocalDate
import org.joda.time.LocalDate

class Anchor extends VirtualDeletable {
    String text
    AnchorType anchorType
    float probability

    LocalDate dateCreated
    LocalDate lastUpdated

    static constraints = {
        text blank: false, maxSize: 1024
        anchorType blank: false
        probability range: 0..1
        dateCreated type: PersistentLocalDate
        lastUpdated type: PersistentLocalDate
    }
    static belongsTo = [link: Link]
    static mapping = {
        anchorType enumType: 'ordinal'
    }
}
