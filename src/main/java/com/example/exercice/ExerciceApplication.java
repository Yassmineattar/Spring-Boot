package com.example.exercice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.exercice.dao.entities.Product;
import com.example.exercice.dao.repositories.ProductRepository;

@SpringBootApplication
public class ExerciceApplication  implements CommandLineRunner{

	@Autowired
	private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(ExerciceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		Product product = new Product(1, "pc", "pc gamer", 2000.0);
		Product product1 = new Product(2, "p", "pc lap", 20.0);
		List<Product> products = new ArrayList<>();
		products.add(product);
		products.add(product1);
		productRepository.saveAll(products);
	}
}
