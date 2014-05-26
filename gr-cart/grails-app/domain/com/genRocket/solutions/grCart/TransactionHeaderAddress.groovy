package com.genRocket.solutions.grCart

class TransactionHeaderAddress{
	TransactionHeader transactionHeader
	Address address

	boolean equals(other) {
    	if (!(other instanceof TransactionHeaderAddress)) {
      		return false
    	}

    	other.address?.id == address?.id &&
      		other.transactionHeader?.id == transactionHeader?.id
  	}

  	int hashCode() {
    	def builder = new HashCodeBuilder()
    	if (address) builder.append(address.id)
    	if (transactionHeader) builder.append(transactionHeader.id)
    	builder.toHashCode()
  	}

	static constraints = {
		transactionHeader nullable: false
		address nullable: false
	}

	static mapping = {
    	id composite: ['transactionHeader', 'address']
    	version false
  	}
}