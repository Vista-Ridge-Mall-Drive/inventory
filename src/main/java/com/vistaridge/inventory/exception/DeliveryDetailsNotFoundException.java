package com.vistaridge.inventory.exception;

public class DeliveryDetailsNotFoundException extends RuntimeException  {

	public DeliveryDetailsNotFoundException(Long id) {
		super("Could not find delivery detail " + id);
	}		
	
}
