package com.yuridev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuridev.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
