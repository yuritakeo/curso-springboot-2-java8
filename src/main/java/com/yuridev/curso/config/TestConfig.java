package com.yuridev.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.yuridev.curso.entities.Order;
import com.yuridev.curso.entities.User;
import com.yuridev.curso.repositories.OrderRepository;
import com.yuridev.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		salvar_User_Order_Para_Teste();
	}
	
	private void salvar_User_Order_Para_Teste() {
		User u1 = new User(null, "maria" , "maria@gmail.com", "999999","123");	
		User u2 = new User(null, "joao" , "joao@gmail.com", "88888","321");	
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T19:53:07Z"),u1);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
}