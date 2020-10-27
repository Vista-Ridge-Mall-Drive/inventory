package com.vistaridge.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.vistaridge.inventory.entities.DeliveryHeader;

public interface DeliveryHeaderRepository extends CrudRepository<DeliveryHeader, Long> {}
