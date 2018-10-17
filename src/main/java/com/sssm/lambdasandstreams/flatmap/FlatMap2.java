package com.sssm.lambdasandstreams.flatmap;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

// Challenge ->
// 		Given two lists of numbers, return all pairs of numbers whose sum is divisible by 3.
//		e.g. given a list [1, 2, 3] and a list [3, 4], return [(2,4), (3,3)]

public class FlatMap2 {

	public static void main(String[] args) {
		List<Integer> firstList = Arrays.asList(1, 2, 3);
		List<Integer> secondList = Arrays.asList(3, 4);

		List<int[]> pairs = firstList.stream()
				.flatMap(i -> secondList.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[] { i, j }))
				.collect(toList());

		// print to console
		pairs.stream().forEach(i -> System.out.println(Arrays.toString(i)));
	}

}
