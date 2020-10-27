package com.yuridev.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.yuridev.curso.entities.User;
import com.yuridev.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "maria" , "maria@gmail.com", "999999","123");	
		User u2 = new User(null, "joao" , "joao@gmail.com", "88888","321");	
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
	
	
}
