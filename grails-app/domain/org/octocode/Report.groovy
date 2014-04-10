package org.octocode

import org.joda.time.DateTime

class Report {
    DateTime dateCreated
    static belongsTo = [project: Project, post: Post, blog: Blog, link: Link, anchor: Anchor]
}
