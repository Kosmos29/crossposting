package org.octocode

import org.joda.time.DateTime

class Anchor extends Entity {
    String text
    AnchorType anchorType
    int probability

    DateTime dateCreated
    DateTime lastUpdated

    static constraints = {
        text blank: false, maxSize: 1024
        anchorType blank: false
        probability range: 0..100
    }
    static belongsTo = [link: Link]
    static mapping = {
        anchorType enumType: 'ordinal'
    }
}
