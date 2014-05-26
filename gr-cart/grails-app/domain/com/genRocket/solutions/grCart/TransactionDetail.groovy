package com.genRocket.solutions.grCart

class TransactionDetail {
	Float price = 0.0
	Integer quantity = 0
	Product product

	static belongsTo =[ transactionHeader : TransactionHeader ]

	static constraints = {
		price nullable: false
		quantity nullable: false
		product nullable: false
	}
}