package com.sssm.lambdasandstreams.intermediateoperations.map;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

// Stream mapToLong(ToLongFunction mapper) returns a LongStream consisting of the results of applying the given function to the elements of this stream.
// Stream mapToLong(ToLongFunction mapper) is an intermediate operation. 
// These operations are always lazy. 
// Intermediate operations are invoked on a Stream instance and after they finish their processing, they give a Stream instance as output.
public class MapToLong {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		List<Long> squares = numbers.stream().mapToLong(i -> Long.parseLong(String.valueOf(i))).map(i -> i * i).boxed()
				.collect(toList());

		// print to console
		squares.stream().forEach(System.out::println);
	}

}
