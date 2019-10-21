package com.springboot.basics.calculator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.basics.calculator.operations.Operation;

@Service
public class Calculator {
	
	private List<Operation> operations;
	
	public Calculator() {}
	
	@Autowired
	public Calculator(List<Operation> operations) {
		this.operations=operations;
	}
	
	public int calculate(final int lhs,final int rhs,char ops) {
		return operations.stream()
		.filter(o -> o.handle(ops))
		.map(op -> op.apply(lhs, rhs))
		.findFirst().get();
	}

}
