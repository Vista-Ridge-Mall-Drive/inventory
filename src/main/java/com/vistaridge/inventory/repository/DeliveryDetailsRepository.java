package com.vistaridge.inventory.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vistaridge.inventory.entities.DeliveryDetails;


@Repository
public interface DeliveryDetailsRepository extends CrudRepository<DeliveryDetails, Long> {
	
//	@Modifying
//    @Query("select f from delivery_details f where f.inventory_id=:id")
//	ArrayList<DeliveryDetails> getDeliveryDetailsByInventoryId(@Param("id") long inventory_id);
	
	ArrayList<DeliveryDetails> findByinventoryId(long inventory_id);
	
}
