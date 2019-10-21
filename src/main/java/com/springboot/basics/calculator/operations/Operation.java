package com.springboot.basics.calculator.operations;

public interface Operation {
	
	public boolean handle(char ops);
	public int apply(int lhs,int rhs);
	

}
