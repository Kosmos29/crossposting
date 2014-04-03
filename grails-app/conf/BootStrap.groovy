import org.joda.time.DateTime
import org.joda.time.LocalDate
import org.octocode.Project

class BootStrap {

    def init = { servletContext ->
        environments {
            test {
                createTestData()
            }
            development {
                createTestData()
            }
            production {}
        }
    }

    def destroy = {
    }

    int count = 32
    def createTestData() {
        count.times { i ->
            new Project(
                    name: "project (${i})",
                    description: "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                    created: LocalDate.now().minusDays(count - i),
                    modified: LocalDate.now().plusDays(i)
            ).save(failOnError: true, flush: true)
        }
    }
}
