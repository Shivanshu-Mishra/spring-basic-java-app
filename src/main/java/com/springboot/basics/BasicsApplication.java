package com.springboot.basics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.springboot.basics.calculator.service.Calculator;

@SpringBootApplication
public class BasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicsApplication.class, args);
	}

	/**
	 * @param calculator
	 * @return ApplicationRunner is an interface which can be used to run some code
	 *         after start up of Spring boot application.
	 */
	@Bean
	public ApplicationRunner calculationRunner(Calculator calculator,
			@Value("${lhs}") int lhs,
			@Value("${rhs}") int rhs,
			@Value("${op}") char op) {
		return args -> {
			calculator.calculate(lhs, rhs, op);
		};
	}

}
