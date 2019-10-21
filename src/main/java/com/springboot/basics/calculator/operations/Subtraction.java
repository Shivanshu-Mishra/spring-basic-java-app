package com.springboot.basics.calculator.operations;

import org.springframework.stereotype.Component;

@Component
public class Subtraction implements Operation {

	@Override
	public boolean handle(char ops) {
		return '-' == ops;
	}

	@Override
	public int apply(int lhs, int rhs) {
		if(lhs>rhs)
			return lhs-rhs;
		return rhs-lhs;
	}

}
