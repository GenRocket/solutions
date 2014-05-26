package com.genRocket.solutions.grCart

class Product  {
	String name
	Float price = 0.0
	Vendor vendor

	static constraints = {
		name nullable: false, blank: false, maxSize: 50
		price nullable: false
		vendor nullable: false
	}
}
