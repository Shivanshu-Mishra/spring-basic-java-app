package com.springboot.basics.calculator.operations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Addition implements Operation {
	private Logger logger=LoggerFactory.getLogger(Addition.class);
	private static final String ADDITION_EXPRESSION="{}+{}={}";

	@Override
	public boolean handle(char ops) {
		return '+' == ops;
	}

	@Override
	public int apply(int lhs, int rhs) {
		int sum = lhs + rhs;
		logger.debug(ADDITION_EXPRESSION,lhs,rhs,sum);
		return sum;
		
	}
}
