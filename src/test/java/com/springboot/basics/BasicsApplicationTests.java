package com.springboot.basics;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;

import com.springboot.basics.component.HelloBasics;

@SpringBootTest
class BasicsApplicationTests {

	@Autowired
	private ApplicationContext context;
	
	@Test
	void contextLoads() {
		HelloBasics basics=context.getBean(HelloBasics.class);
		Assert.notNull(basics, "Basics context not found");
		basics.sayHello();
	}

}
