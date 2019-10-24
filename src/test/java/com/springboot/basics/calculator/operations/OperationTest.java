package com.springboot.basics.calculator.operations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

public class OperationTest {

	@Test
	public void testAddition() {
		Addition add=new Addition();
		Assert.isTrue(add.handle('+'),"Unable to find + character");
		Assert.isTrue(!add.handle('-'),"+ cannot be -");
		Assert.isTrue(add.apply(2, 3)==5,"Addition result not correct");
	}
	
	@Test
	public void testSubtraction() {
		Subtraction sub=new Subtraction();
		Assert.isTrue(sub.handle('-'),"Unable to find - character");
		Assert.isTrue(!sub.handle('+'),"- cannot be +");
		Assert.isTrue(sub.apply(3, 2)==1, "Substraction result is not correct");
	}
	
	@Test
	public void testMultiplication() {
		Multiplication multi=new Multiplication();
		Assert.isTrue(multi.handle('*'), "Unable to find * character");
		Assert.isTrue(!multi.handle('+'), "+ cannot be *");
		Assert.isTrue(multi.apply(3, 2)==6, "Multiplication result is not correct");
	}
	
	@Test
	public void testDivision() {
		Divide divide=new Divide();
		Assert.isTrue(divide.handle('/'),"Unable to find / character");
		Assert.isTrue(!divide.handle('*'),"* cannot be /");
		Assert.isTrue(divide.apply(6, 3)==2, "Division result is not correct");
		
	}
	
}
