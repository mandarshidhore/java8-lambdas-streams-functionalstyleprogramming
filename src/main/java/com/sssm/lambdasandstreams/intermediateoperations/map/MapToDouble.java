package com.sssm.lambdasandstreams.intermediateoperations.map;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

// Returns a DoubleStream consisting of the results of applying the given function to the elements of this stream.
// This is an intermediate operation. 
// These operations are always lazy. 
// Intermediate operations are invoked on a Stream instance and after they finish their processing, they give a Stream instance as output.
public class MapToDouble {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> squares = numbers.stream().mapToDouble(i -> Double.parseDouble(String.valueOf(i))).map(i -> i * i)
				.boxed().collect(toList());
		squares.stream().forEach(System.out::println);
		
		System.out.println("");
		
		IntStream intStream = IntStream.of(1, 2, 4, 6);
		DoubleStream doubleStream = intStream.mapToDouble(i -> Double.parseDouble(String.valueOf(i)));
		List<Double> doubles = doubleStream.boxed().collect(toList());
		doubles.forEach(System.out::println);
	}

}
