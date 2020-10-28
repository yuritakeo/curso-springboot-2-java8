package com.yuridev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuridev.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
