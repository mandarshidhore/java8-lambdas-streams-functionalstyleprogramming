package com.sssm.lambdasandstreams.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Returns an Optional describing some element of the stream, or an empty Optional if the stream is empty.
// This is a short-circuiting terminal operation.
// The behavior of this operation is explicitly nondeterministic; it is free to select any element in the stream. 
// This is to allow for maximal performance in parallel operations; the cost is that multiple invocations on the same source may not return the same result. (If a stable result is desired, use findFirst() instead.).
public class FindAny {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 8, 10, 12, 20);

		// invocation multiple times may return different answers
		for (int i = 0; i < 100; i++) {
			Optional<Integer> answer = list.stream().parallel().filter(n -> (n % 2 == 0)).findAny();
			System.out.println(answer.isPresent() ? answer.get() : null);
		}
	}

}
