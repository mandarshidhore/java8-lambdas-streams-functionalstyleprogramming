package com.sssm.functionalinterfaces;

public class Function {

	public static void main(String[] args) {
		MyFunction<Integer, String> myFunc = x -> "Passed " + x;
		System.out.println(myFunc.apply(4));
		System.out.println(myFunc.apply(16));
	}

}

interface MyFunction<T, R> {
	R apply(T t);
}
