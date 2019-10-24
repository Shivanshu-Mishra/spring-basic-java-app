package com.springboot.basics.calculator.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.basics.calculator.operations.Operation;

@Service
public class Calculator {
	
	private List<Operation> operations;
	private static final Logger LOGGER=LoggerFactory.getLogger(Calculator.class);
	
	public Calculator() {}
	
	@Autowired
	public Calculator(List<Operation> operations) {
		this.operations=operations;
	}
	
	public int calculate(final int lhs,final int rhs,char ops) {
		return operations.stream()
		.filter(o -> o.handle(ops))
		.peek(supportedops -> LOGGER.debug("{}  operation is supported by calculator", ops))
		.map(op -> op.apply(lhs, rhs))
		.findFirst().get();
	}

}
