package com.sssm.lambdasandstreams.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

// Stream anyMatch(Predicate predicate) returns whether any elements of this stream match the provided predicate. 
// It may not evaluate the predicate on all elements if not necessary for determining the result. 
// This is a short-circuiting terminal operation. 
// A terminal operation is short-circuiting if, when presented with infinite input, it may terminate in finite time.
public class AnyMatch {

	public static void main(String[] args) {
		// anyMatch example
		List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
		// Stream anyMatch(Predicate predicate)
		boolean answer = list.stream().anyMatch(n -> (n % 2 == 0));
		System.out.println(answer);

		// DoubleStream anyMatch example
		DoubleStream doubleStream = DoubleStream.of(1.2, 2.3, 3.4, 4.5, 5.6, 6.7);
		// Stream anyMatch(DoublePredicate predicate)
		answer = doubleStream.anyMatch(num -> (num - 5) > 0);
		System.out.println(answer);

		// IntStream anyMatch example
		IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6);
		// Stream anyMatch(Predicate predicate)
		answer = intStream.anyMatch(num -> (num - 1) > 0);
		System.out.println(answer);
	}

}
