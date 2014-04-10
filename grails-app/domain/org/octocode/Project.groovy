package org.octocode

import org.joda.time.DateTime

class Project {
    String name
    String description

    DateTime created
    DateTime modified

    static constraints = {
        name nullable: false, blank: false
        description nullable: true, blank: false,  maxSize: 4096
        created nullable: false
        modified nullable: false
    }
}
