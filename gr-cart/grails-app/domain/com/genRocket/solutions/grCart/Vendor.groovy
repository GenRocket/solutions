package com.genRocket.solutions.grCart

class Vendor {
	String name

	static constraints = {
		name nullable: false, blank: false, maxSize: 50
	}
}