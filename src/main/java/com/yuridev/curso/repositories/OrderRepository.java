package com.yuridev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuridev.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
