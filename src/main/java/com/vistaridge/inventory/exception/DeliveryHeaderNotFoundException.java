package com.vistaridge.inventory.exception;

public class DeliveryHeaderNotFoundException extends RuntimeException  {

	public DeliveryHeaderNotFoundException(Long id) {
		super("Could not find delivery header " + id);
	}		
	
}
