package com.springboot.basics.calculator.operations;

import org.springframework.stereotype.Component;

@Component
public class Addition implements Operation {

	@Override
	public boolean handle(char ops) {
		return '+' == ops;
	}

	@Override
	public int apply(int lhs, int rhs) {
		return lhs+rhs;
	}
}
