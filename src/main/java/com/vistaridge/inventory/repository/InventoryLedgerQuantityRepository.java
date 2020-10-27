package com.vistaridge.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.vistaridge.inventory.entities.InventoryLedgerQuantity;

public interface InventoryLedgerQuantityRepository extends CrudRepository<InventoryLedgerQuantity, Long> {}
