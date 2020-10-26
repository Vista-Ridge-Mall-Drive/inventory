package com.vistaridge.inventory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import com.vistaridge.inventory.entities.Inventory;
import com.vistaridge.inventory.entities.User;
import com.vistaridge.inventory.repository.InventoryRepository;
import com.vistaridge.inventory.repository.UserRepository;

import org.slf4j.LoggerFactory;

@SpringBootApplication
public class InventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}

	Logger logger = LoggerFactory.getLogger(InventoryApplication.class);

    @Bean
    public CommandLineRunner run(UserRepository userRepository, InventoryRepository inventoryRepository) throws Exception {
        return (String[] args) -> {
          logger.info("CommandLineRunner run...start");
          User user1 = new User("John", "john@domain.com");
          User user2 = new User("Julie", "julie@domain.com");
          userRepository.save(user1);
          userRepository.save(user2);
          userRepository.findAll().forEach(user -> System.out.println(user.getName()));
          Inventory item1 = new Inventory("MealOne", "Meal One", "Beef noodle");
          inventoryRepository.save(item1);
          inventoryRepository.findAll().forEach(item -> System.out.println(item.getName()));
          logger.info("CommandLineRunner run...done");
        };
    }	
    
}
