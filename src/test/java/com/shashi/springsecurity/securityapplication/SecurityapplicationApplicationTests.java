package com.shashi.springsecurity.securityapplication;

import com.shashi.springsecurity.securityapplication.entities.User;
import com.shashi.springsecurity.securityapplication.services.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecurityapplicationApplicationTests {

	@Autowired
	private JwtService jwtService;

	@Test
	void contextLoads() {

		User user = new User(4L,"shashi","shashi@gmail.com","1234");

		String token = jwtService.generateToken(user);

		System.out.println(token);

		Long id = jwtService.getUserIdFromToken(token);

		System.out.println(id);
	}

}
