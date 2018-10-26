package com.sssm.functionalinterfaces;

public class Function {

	public static void main(String[] args) {
		// takes in an Integer and produces a String
		MyFunction<Integer, String> myFunc1 = x -> "String concatenated with " + x;
		System.out.println(myFunc1.apply(4));

		// takes in an Integer and produces a Boolean
		MyFunction<Integer, Boolean> myFunc2 = x -> (x % 2 == 0);
		System.out.println("\nis 4 an even number = " + myFunc2.apply(4));
		System.out.println("is 9 an even number = " + myFunc2.apply(9));

		// takes in a String and produces an Integer
		MyFunction<String, Integer> myFunc3 = x -> Integer.valueOf(x);
		System.out.println("\ninteger value of String \"1\" = " + myFunc3.apply("1"));
	}

}

// Represents a function that accepts one argument and produces a result.
// This is a functional interface whose functional method is apply(Object).
interface MyFunction<T, R> {
	R apply(T t);
}
