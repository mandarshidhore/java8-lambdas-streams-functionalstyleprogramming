package com.sssm.lambdasandstreams.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Stream noneMatch(Predicate predicate) returns whether no elements of this stream match the provided predicate. 
// It may not evaluate the predicate on all elements if not necessary for determining the result. 
// This is a short-circuiting terminal operation. 
// A terminal operation is short-circuiting if, when presented with infinite input, it may terminate in finite time.
public class NoneMatch {

	public static void main(String[] args) {
		// noneMatch example
		List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
		// Stream noneMatch(Predicate predicate)
		boolean answer = list.stream().noneMatch(n -> (n % 2 == 0));
		System.out.println(answer);

		// DoubleStream anyMatch example
		DoubleStream doubleStream = DoubleStream.of(1.2, 2.3, 3.4, 4.5, 5.6, 6.7);
		// Stream anyMatch(DoublePredicate predicate)
		answer = doubleStream.noneMatch(num -> (num - 5) > 6);
		System.out.println(answer);

		// IntStream anyMatch example
		IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6);
		// Stream anyMatch(Predicate predicate)
		answer = intStream.noneMatch(num -> (num - 1) < 0);
		System.out.println(answer);

		// Creating a Stream of Strings
		Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks", "CSe");
		// Using Stream noneMatch(Predicate predicate)
		answer = stream.noneMatch(str -> Character.isUpperCase(str.charAt(1)) && Character.isLowerCase(str.charAt(2))
				&& str.charAt(0) == 'f');
		System.out.println(answer);
	}

}
