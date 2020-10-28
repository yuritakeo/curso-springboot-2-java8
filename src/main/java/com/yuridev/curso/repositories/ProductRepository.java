package com.yuridev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuridev.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
