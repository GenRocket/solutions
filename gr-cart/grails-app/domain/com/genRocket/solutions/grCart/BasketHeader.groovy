package com.genRocket.solutions.grCart

class BasketHeader {
	Float total = 0.0

	static belongsTo = [user: User]

	static hasMany = [basketItems: BasketItem]

	static constraints = {
		total nullable: false
		user nullable: false
	}
	
}