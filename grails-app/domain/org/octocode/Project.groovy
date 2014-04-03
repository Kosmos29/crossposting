package org.octocode

import org.jadira.usertype.dateandtime.joda.PersistentLocalDate
import org.joda.time.LocalDate

class Project {
    String name
    String description

    LocalDate created
    LocalDate modified

    static constraints = {
        name nullable: false, blank: false
        description nullable: true, blank: false,  maxSize: 4096
        created nullable: false, type: PersistentLocalDate
        modified nullable: false, type: PersistentLocalDate
    }
}
