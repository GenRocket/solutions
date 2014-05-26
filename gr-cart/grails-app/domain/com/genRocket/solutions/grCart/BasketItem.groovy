package com.genRocket.solutions.grCart

class BasketItem {
	Float price = 0.0
	Integer quantity = 0
	Product product

	static belongsTo = [basketHeader: BasketHeader]

	static constraints = {
		price nullable: false
		quantity nullable: false
		product nullable: false
		basketHeader nullable: false
	}
}