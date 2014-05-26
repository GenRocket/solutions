import spock.lang.*
import geb.spock.*

import pages.*

@Stepwise
class UserSpec extends GebReportingSpec {
	
	def "there are no users"() {
		when:
		to UserListPage
		then:
		userRows.size() == 0
	}
}
