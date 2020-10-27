package com.vistaridge.inventory.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vistaridge.inventory.entities.DeliveryHeader;
import com.vistaridge.inventory.exception.DeliveryHeaderNotFoundException;
import com.vistaridge.inventory.repository.DeliveryDetailsRepository;
import com.vistaridge.inventory.repository.DeliveryHeaderRepository;
import com.vistaridge.inventory.repository.InventoryRepository;

@RestController
public class PostingController {

	@Autowired
	InventoryRepository inventoryRepository;		
	
	@Autowired
	DeliveryHeaderRepository deliveryHeaderRepository;		
	
	@Autowired
	DeliveryDetailsRepository deliveryDetailsRepository;	
	
	@GetMapping("/postDeliveryHeader/{id}")
	DeliveryHeader postDeliveryHeader(@PathVariable Long id) {
		DeliveryHeader item = null;
		item = deliveryHeaderRepository.findById(id)
	    .orElseThrow(() -> new DeliveryHeaderNotFoundException(id));
		if (Objects.isNull(item)) {
			throw new DeliveryHeaderNotFoundException(id);
		}
		return item;
	}		
	
}
