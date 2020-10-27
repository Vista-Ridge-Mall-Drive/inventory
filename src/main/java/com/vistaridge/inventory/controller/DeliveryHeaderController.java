package com.vistaridge.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vistaridge.inventory.entities.DeliveryHeader;
import com.vistaridge.inventory.exception.DeliveryHeaderNotFoundException;
import com.vistaridge.inventory.repository.DeliveryDetailsRepository;
import com.vistaridge.inventory.repository.DeliveryHeaderRepository;
import com.vistaridge.inventory.repository.InventoryRepository;

@RestController
public class DeliveryHeaderController {

	
	@Autowired
	InventoryRepository inventoryRepository;		
	
	@Autowired
	DeliveryHeaderRepository deliveryHeaderRepository;		
	
	@Autowired
	DeliveryDetailsRepository deliveryDetailsRepository;
	
	@GetMapping("/deliveryheader")
	List<DeliveryHeader> all() {
	    return (List<DeliveryHeader>) deliveryHeaderRepository.findAll();
	}	
	
	@GetMapping("/deliveryheader/{id}")
	DeliveryHeader one(@PathVariable Long id) {
		return deliveryHeaderRepository.findById(id)
	    .orElseThrow(() -> new DeliveryHeaderNotFoundException(id));
	}	
	
	@PostMapping("/deliveryheader")
	DeliveryHeader newInventoryItem(@RequestBody DeliveryHeader newItem) {
		return deliveryHeaderRepository.save(newItem);
	}	
	
	@DeleteMapping("/deliveryheader/{id}")
	void deleteDeliveryHeader(@PathVariable Long id) {
		deliveryHeaderRepository.deleteById(id);
	}	
	
}
