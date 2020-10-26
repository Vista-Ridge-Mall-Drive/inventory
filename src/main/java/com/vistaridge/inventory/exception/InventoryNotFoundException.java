package com.vistaridge.inventory.exception;

public class InventoryNotFoundException extends RuntimeException {

	public InventoryNotFoundException(Long id) {
		super("Could not find inventory item " + id);
	}	
	
}
