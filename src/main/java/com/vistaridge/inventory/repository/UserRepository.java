package com.vistaridge.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vistaridge.inventory.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
