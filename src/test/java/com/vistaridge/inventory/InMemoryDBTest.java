package com.vistaridge.inventory;




import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vistaridge.inventory.entities.Inventory;
import com.vistaridge.inventory.entities.User;
import com.vistaridge.inventory.repository.InventoryRepository;
import com.vistaridge.inventory.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InMemoryDBTest {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	InventoryRepository inventoryRepository;

	@Before
	public void setup()
	{
	}	
	
	@Test
	public void test1() {
        User user1 = new User("John1", "john1@domain.com");
        User user2 = new User("Julie1", "julie1@domain.com");
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.findAll().forEach(user -> System.out.println(user.getName()));	
        
        Inventory item1 = new Inventory("MealOne111", "Meal One111", "Beef noodle111");
        inventoryRepository.save(item1);
        inventoryRepository.findAll().forEach(item -> System.out.println(item.getName()));        
	}
	
}
