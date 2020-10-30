package com.yuridev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuridev.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
