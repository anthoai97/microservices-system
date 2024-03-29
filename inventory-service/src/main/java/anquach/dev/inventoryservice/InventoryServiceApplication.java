package anquach.dev.inventoryservice;

import anquach.dev.inventoryservice.model.Inventory;
import anquach.dev.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return  args -> {
			Inventory inventory = new Inventory();
			inventory.setQuantity(10);
			inventory.setSkuCode("Iphone-11");

			Inventory inventory2 = new Inventory();
			inventory2.setQuantity(100);
			inventory2.setSkuCode("Iphone-14");

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory2);
		};
	}
}
