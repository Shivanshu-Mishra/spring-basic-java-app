package com.springboot.basics.component;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class HelloBasics {

	@PostConstruct
	public void sayHello() {
		System.out.println("Hello basics");
	}
}
