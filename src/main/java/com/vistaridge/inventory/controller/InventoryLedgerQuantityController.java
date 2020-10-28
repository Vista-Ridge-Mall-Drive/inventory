package com.vistaridge.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vistaridge.inventory.entities.DeliveryHeader;
import com.vistaridge.inventory.entities.InventoryLedgerQuantity;
import com.vistaridge.inventory.repository.DeliveryDetailsRepository;
import com.vistaridge.inventory.repository.DeliveryHeaderRepository;
import com.vistaridge.inventory.repository.InventoryLedgerQuantityRepository;
import com.vistaridge.inventory.repository.InventoryRepository;

@RestController
public class InventoryLedgerQuantityController {

	@Autowired
	InventoryRepository inventoryRepository;		
	
	@Autowired
	DeliveryHeaderRepository deliveryHeaderRepository;		
	
	@Autowired
	DeliveryDetailsRepository deliveryDetailsRepository;

	@Autowired
	InventoryLedgerQuantityRepository inventoryLedgerQuantityRepository;
	
	@GetMapping("/deliveryheader")
	List<InventoryLedgerQuantity> all() {
	    return (List<InventoryLedgerQuantity>) inventoryLedgerQuantityRepository.findAll();
	}
	
}
