package com.springboot.basics.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.springboot.basics.calculator.service.Calculator;

@SpringBootTest
public class CalculatorTest {
	@Autowired
	private Calculator calculator;
	
	@Test
	public void testCalculate() {
		Assert.notNull(calculator, "Failed to autowire calculator");
		Assert.isTrue(3==calculator.calculate(1, 2, '+'));
		Assert.isTrue(10==calculator.calculate(5, 2, '*'));
		Assert.isTrue(3==calculator.calculate(5, 2, '-'));
	}

}
