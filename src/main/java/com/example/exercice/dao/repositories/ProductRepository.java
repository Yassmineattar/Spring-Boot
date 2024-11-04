package com.example.exercice.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exercice.dao.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{


    
}
