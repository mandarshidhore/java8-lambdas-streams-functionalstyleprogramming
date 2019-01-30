package com.sssm.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjLongConsumer;

public class Consumer {

	public static void main(String[] args) {
		List<String> myList1 = Arrays.asList("1", "2", "3");

		MyConsumer<String> myConsumer = s -> System.out.println("next element in list = " + s);
		myList1.forEach(element -> myConsumer.accept(element));
		System.out.println();

		MyBiConsumer<List<String>, List<String>> myBiConsumer = (a, b) -> {
			if (a.size() != b.size()) {
				System.out.println("lists are not equal");
				return;
			} else {
				for (int i = 0; i < a.size(); i++) {
					if (!(a.get(i).equalsIgnoreCase(b.get(i)))) {
						System.out.println("lists are not equal");
						return;
					}
				}
			}
			System.out.println("lists are equal");
		};

		List<String> myList2 = Arrays.asList("1", "2", "3");
		myBiConsumer.accept(myList1, myList2);

		List<String> myList3 = Arrays.asList("4", "5", "6");
		myBiConsumer.accept(myList1, myList3);

		System.out.println();

		// IntConsumer in JDK
		IntConsumer intConsumer = i -> System.out.println(i + " * 3 = " + (i * 3));
		intConsumer.accept(5);
		List<Integer> integers = Arrays.asList(1, 2, 3);
		integers.forEach(element -> intConsumer.accept(element));

		// ObjLongConsumer in JDK
		ObjLongConsumer<Integer> objLongConsumer = (i, j) -> System.out
				.println("\nInteger " + i + " + Long " + j + " = Long " + (i + j));
		objLongConsumer.accept(5, 5);

		// ObjDoubleConsumer in JDK
		ObjDoubleConsumer<Integer> objDoubleConsumer = (i, j) -> System.out
				.println("\nInteger " + i + " + Double " + j + " = Double " + (i + j));
		objDoubleConsumer.accept(5, 5);
	}

}

// Represents an operation that accepts a single input argument and returns no result
// This is a functional interface whose functional method is accept(Object)
@FunctionalInterface
interface MyConsumer<T> {
	public void accept(T t);
}

// Represents an operation that accepts two input arguments and returns no result
// This is a functional interface whose functional method is accept(Object, Object)
@FunctionalInterface
interface MyBiConsumer<T, U> {
	public void accept(T t, U u);
}
