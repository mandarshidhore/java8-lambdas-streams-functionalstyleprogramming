package com.sssm.functionalinterfaces;

public class Predicate {

	public static void main(String[] args) {
		// String contains test
		MyPredicate<String> predicateString = x -> x.contains("AND");
		// above line can also be written as MyPredicate<String> predicateString = (String x) -> x.contains("AND");
		System.out.println("SAND contains AND = " + predicateString.test("SAND"));
		System.out.println("SUN contains AND = " + predicateString.test("SUN"));

		System.out.println("\n----\n");

		// even number test
		MyPredicate<Integer> predicateInt = x -> (x % 2 == 0);
		System.out.println("is 3 an even number = " + predicateInt.test(3));
		System.out.println("is 4 an even number = " + predicateInt.test(4));
	}

}

// Represents a predicate (boolean-valued function) of one argument.
// This is a functional interface whose functional method is test(Object).
interface MyPredicate<T> {
	public boolean test(T t);
}
