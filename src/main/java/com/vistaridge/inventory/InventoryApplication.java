package com.vistaridge.inventory;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

import org.slf4j.Logger;

import com.vistaridge.inventory.controller.InventoryController;
import com.vistaridge.inventory.entities.DeliveryDetails;
import com.vistaridge.inventory.entities.Inventory;
import com.vistaridge.inventory.entities.User;
import com.vistaridge.inventory.rabbitmq.RabbitMqConfig;
import com.vistaridge.inventory.rabbitmq.RmqRunner;
import com.vistaridge.inventory.rabbitmq.Receiver;
import com.vistaridge.inventory.repository.DeliveryDetailsRepository;
import com.vistaridge.inventory.repository.InventoryRepository;
import com.vistaridge.inventory.repository.UserRepository;

import org.slf4j.LoggerFactory;

@SpringBootApplication
public class InventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}

	Logger logger = LoggerFactory.getLogger(InventoryApplication.class);

	@Autowired
	InventoryController inventoryController;
	
	@Autowired
	DeliveryDetailsRepository deliveryDetailsRepository;

	@Autowired
	Receiver receiver;
	
	@Bean
    public CommandLineRunner run(UserRepository userRepository, InventoryRepository inventoryRepository) throws Exception {
        return (String[] args) -> {
          logger.info("CommandLineRunner run...start");
          User user1 = new User("John0", "john@domain.com");
          User user2 = new User("Julie0", "julie@domain.com");
          userRepository.save(user1);
          userRepository.save(user2);
          userRepository.findAll().forEach(user -> System.out.println(user.getName()));
          Inventory item1 = new Inventory("MealOne0", "Meal One0", "Beef noodle");
          inventoryRepository.save(item1);
          
          Inventory newItem = new Inventory();
          newItem.setId(0);
          newItem.setCode("PadThaiChicken");
          newItem.setName("Pad Thai Chicken");
          newItem.setDesc("Pad Thai Chicken");
          inventoryController.newInventoryItem(newItem);

          
          inventoryRepository.findAll().forEach(item -> System.out.println(item.getName()));
          
          logger.info("getDeliveryDetailsByInventoryId(1)");
          ArrayList<DeliveryDetails> list = deliveryDetailsRepository.findByinventoryId(1);
          
          //ApplicationContext ctx = new AnnotationConfigApplicationContext(RabbitMqConfig.class);
          //RabbitTemplate rabbitTemplate = ctx.getBean(RabbitTemplate.class);
          //RmqRunner r = new RmqRunner(receiver, rabbitTemplate);
          //r.run("Hellow");
          
          logger.info("CommandLineRunner run...done");
        };
    }	
    
}
