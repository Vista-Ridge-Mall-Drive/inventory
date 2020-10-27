package com.vistaridge.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vistaridge.inventory.entities.DeliveryDetails;
import com.vistaridge.inventory.entities.DeliveryHeader;
import com.vistaridge.inventory.exception.DeliveryHeaderNotFoundException;
import com.vistaridge.inventory.repository.DeliveryDetailsRepository;
import com.vistaridge.inventory.repository.DeliveryHeaderRepository;
import com.vistaridge.inventory.repository.InventoryRepository;

@RestController
public class DeliveryDetailsController {

	@Autowired
	InventoryRepository inventoryRepository;		
	
	@Autowired
	DeliveryHeaderRepository deliveryHeaderRepository;		
	
	@Autowired
	DeliveryDetailsRepository deliveryDetailsRepository;
	
	@GetMapping("/deliverydetails")
	List<DeliveryDetails> all() {
	    return (List<DeliveryDetails>) deliveryDetailsRepository.findAll();
	}	
	
	@GetMapping("/deliverydetails/{id}")
	DeliveryDetails one(@PathVariable Long id) {
		return deliveryDetailsRepository.findById(id)
	    .orElseThrow(() -> new DeliveryHeaderNotFoundException(id));
	}	
	
	@PostMapping("/deliverydetails")
	DeliveryDetails newItem(@RequestBody DeliveryDetails newItem) {
		return deliveryDetailsRepository.save(newItem);
	}	
	
	@DeleteMapping("/deliverydetails/{id}")
	void deleteItem(@PathVariable Long id) {
		deliveryDetailsRepository.deleteById(id);
	}	
	
}
