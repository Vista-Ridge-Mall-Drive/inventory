package com.vistaridge.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vistaridge.inventory.entities.DeliveryHeader;

@Repository
public interface DeliveryHeaderRepository extends CrudRepository<DeliveryHeader, Long> {}
