package com.vistaridge.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.vistaridge.inventory.entities.DeliveryDetails;

public interface DeliveryDetailsRepository extends CrudRepository<DeliveryDetails, Long> {

}
