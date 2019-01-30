package com.sssm.functionalinterfaces;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;

public class Supplier {

	public static void main(String[] args) {
		MySupplier<String> mySupplier = () -> "Return this string";
		print(mySupplier);

		System.out.println("4 > 5 ? = " + isGreater(4, 5));

		System.out.println("4 x 5 = " + multiplyBy5(4));
	}

	public static void print(MySupplier<String> s) {
		System.out.println(s.get());
	}

	public static boolean isGreater(int x, int y) {
		BooleanSupplier booleanSupplier = () -> x > y;
		return booleanSupplier.getAsBoolean();
	}

	public static int multiplyBy5(int x) {
		IntSupplier intSupplier = () -> x * 5;
		return intSupplier.getAsInt();
	}

}

// Represents a supplier of results
// There is no requirement that a new or distinct result be returned each time the supplier is invoked
// This is a functional interface whose functional method is get()
@FunctionalInterface
interface MySupplier<T> {
	public T get();
}
