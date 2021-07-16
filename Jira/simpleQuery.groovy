import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.issue.search.SearchProvider
import com.atlassian.jira.jql.parser.JqlQueryParser
import com.atlassian.jira.web.bean.PagerFilter

def jqlQueryParser = ComponentAccessor.getComponent(JqlQueryParser)
def searchProvider = ComponentAccessor.getComponent(SearchProvider)
def issueManager = ComponentAccessor.getIssueManager()
def user = ComponentAccessor.getJiraAuthenticationContext().getUser()

// edit this query to suit
def query = jqlQueryParser.parseQuery("project = JRA and assignee = currentUser()")

def results = searchProvider.search(query, user, PagerFilter.getUnlimitedFilter())

log.debug("Total issues: ${results.total}")

results.getIssues().each {documentIssue ->
    log.debug(documentIssue.key)

    // if you need a mutable issue you can do:
    def issue = issueManager.getIssueObject(documentIssue.id)

    // do something to the issue...
    log.debug(issue.summary)
}