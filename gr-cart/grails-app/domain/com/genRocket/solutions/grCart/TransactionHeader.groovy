package com.genRocket.solutions.grCart

class TransactionHeader {
	Date transactionDate
	Float total = 0.0

	static belongsTo = [user: User]

	static hasMany = [transactionDetails: TransactionDetail]

	static constraints = {
		transactionDate nullable: false
		total nullable: false
		user nullable: false
	}
}