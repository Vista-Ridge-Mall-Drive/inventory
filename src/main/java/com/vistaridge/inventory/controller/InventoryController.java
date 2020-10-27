package com.vistaridge.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vistaridge.inventory.entities.Inventory;
import com.vistaridge.inventory.exception.InventoryNotFoundException;
import com.vistaridge.inventory.repository.InventoryRepository;

@RestController
public class InventoryController {

	
	@Autowired
	InventoryRepository inventoryRepository;	
	

	@GetMapping("/inventory")
	List<Inventory> all() {
	    return (List<Inventory>) inventoryRepository.findAll();
	}	
	
	@PostMapping("/inventory")
	Inventory newInventoryItem(@RequestBody Inventory newItem) {
		return inventoryRepository.save(newItem);
	}	

	@DeleteMapping("/inventory/{id}")
	void deleteInventoryItem(@PathVariable Long id) {
		inventoryRepository.deleteById(id);
	}	
	
	@GetMapping("/inventory/{id}")
	Inventory getItem(@PathVariable Long id) {
		return inventoryRepository.findById(id)
	    .orElseThrow(() -> new InventoryNotFoundException(id));
	}	
	
	@PutMapping("/inventory/{id}")
	Inventory replaceInventoryItem(@RequestBody Inventory inventoryItem, @PathVariable Long id) {

		return inventoryRepository.findById(id)
	      .map(item -> {
	    	  item.setName(inventoryItem.getName());
	    	  item.setCode(inventoryItem.getCode());
	    	  item.setDesc(inventoryItem.getDesc());
	    	  item.setDiscontinued(inventoryItem.getDiscontinued());
	    	  item.setQty_in_stock(inventoryItem.getQty_in_stock());
	    	  item.setReorder_level(inventoryItem.getReorder_level());
	    	  item.setReorder_qty(inventoryItem.getReorder_qty());
	    	  item.setReorder_time_in_days(inventoryItem.getReorder_time_in_days());
	    	  item.setUnit_price(inventoryItem.getUnit_price());
	    	  item.setUnit_weight(inventoryItem.getUnit_weight());
	        return inventoryRepository.save(inventoryItem);
	      })
	      .orElseGet(() -> {
	    	  inventoryItem.setId(id);
	        return inventoryRepository.save(inventoryItem);
	      });
	}	

//	@GetMapping("/greeting")
//	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//		return new Greeting(counter.incrementAndGet(), String.format(template, name));
//	}	
	
}
