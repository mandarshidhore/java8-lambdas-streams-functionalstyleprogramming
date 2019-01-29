package com.sssm.functionalinterfaces;

import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;

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
		System.out.println("\nInteger value of String \"1\" = " + myFunc3.apply("1"));
		
		MyBiFunction<String, String, Integer> myBiFunction = (x, y) -> Integer.valueOf(x) + Integer.valueOf(y);
		System.out.println("\nSum of 3 and 4 is " + myBiFunction.apply("3", "4"));
		
		// DoubleToIntFunction in JDK
		DoubleToIntFunction doubleToIntFunction = i -> {return ((int)i * 3);};
		System.out.println("\nInteger value of 1.8 x 3 = " + doubleToIntFunction.applyAsInt(1.8));
		
		// IntToDoubleFunction in JDK
		IntToDoubleFunction intToDoubleFunction = i -> {return (i * 3);};
		System.out.println("\nDouble value of 2 x 3 = " + intToDoubleFunction.applyAsDouble(2));
		
		// DoubleFunction in JDK
		DoubleFunction<Integer> doubleFunction = i -> {return ((int)i * 3);};
		System.out.println("\nInteger value of 3 x 3 = " + doubleFunction.apply(3.0));
		
		// ToDoubleBiFunction in JDK
		ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (i, j) -> {return (i + j);};
		System.out.println("\nDouble value of 3 + 3 = " + toDoubleBiFunction.applyAsDouble(3, 3));
		
		// ToDoubleFunction in JDK
		ToDoubleFunction<Integer> toDoubleFunction = (i) -> {return (i + 2);};
		System.out.println("\nDouble value of 2 + 2 = " + toDoubleFunction.applyAsDouble(2));
	}

}

// Represents a function that accepts one argument and produces a result
// This is a functional interface whose functional method is apply(Object)
interface MyFunction<T, R> {
	R apply(T t);
}

// Represents a function that accepts two arguments and produces a result
//This is a functional interface whose functional method is apply(Object, Object)
interface MyBiFunction<T, U, R> {
	R apply(T t, U u);
}
