package pages

import geb.Module

class UserListPage extends ScaffoldPage {

	static url = "user/index"

	static at = {
		title ==~ /User List/
	}

	static content = {
		//newPersonButton(to: CreatePage) { $("a", text: "New User") }
		userTable { $("div.content table", 0) }
		userRow { module UserRow, userRows[it] }
		userRows(required: false) { userTable.find("tbody").find("tr") }
	}
}

class UserRow extends Module {
	static content = {
		cell { $("td", it) }
		cellText { cell(it).text() }
        cellHrefText{ cell(it).find('a').text() }
		firstName { cellText(2) }
		lastName { cellText(3) }
		//showLink(to: ShowPage) { cell(0).find("a") }
	}
}