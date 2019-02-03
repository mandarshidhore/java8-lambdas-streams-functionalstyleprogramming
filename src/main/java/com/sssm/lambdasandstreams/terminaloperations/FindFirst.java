package com.sssm.lambdasandstreams.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Returns an Optional describing the first element of this stream, or an empty Optional if the stream is empty.
// If the stream has no encounter order, then any element may be returned.
// This is a short-circuiting terminal operation.
public class FindFirst {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 8, 10, 12, 20);

		Optional<Integer> answer = list.stream().findFirst();
		System.out.println(answer.isPresent() ? answer.get() : null);

		answer = list.stream().parallel().filter(n -> (n % 2 == 0)).findFirst();
		System.out.println(answer.isPresent() ? answer.get() : null);
	}

}
