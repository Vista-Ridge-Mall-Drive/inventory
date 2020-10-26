package com.vistaridge.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vistaridge.inventory.entities.Inventory;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Long> {}
