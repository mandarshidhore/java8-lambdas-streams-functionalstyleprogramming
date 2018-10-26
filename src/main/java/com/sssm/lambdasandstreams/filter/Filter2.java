package com.sssm.lambdasandstreams.filter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Filter & Truncate
public class Filter2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 4, 3, 4, 5, 2, 4, 2, 6);

		// Find count of unique even numbers
		System.out.println(
				"Count of unique even numbers = " + numbers.stream().filter(i -> i % 2 == 0).distinct().count());

		// Find first four unique even numbers
		System.out.println("\nFirst four unique even numbers unsorted = ");
		// following should print 4 then 2 then 6 since it is unsorted
		numbers.stream().filter(i -> i % 2 == 0).distinct().limit(4).forEach(System.out::println);

		System.out.println("\nFirst two unique even numbers unsorted = ");
		// this line should print 4 then 2 since it is unsorted
		numbers.stream().filter(i -> i % 2 == 0).distinct().limit(2).forEach(System.out::println);

		// if source is sorted, result will be sorted.
		System.out.println("\nFirst two unique even numbers sorted = ");
		// this line should print 2 then 4 since it is sorted
		numbers.stream().filter(i -> i % 2 == 0).distinct().sorted().limit(2).forEach(System.out::println);

		// a given list can also be sorted as below
		// numbers.sort((i1, i2) -> i1.compareTo(i2));

		// if source is sorted, result will be sorted.
		System.out.println("\nFirst three unique even numbers sorted in reverse order = ");
		// following should print 6 then 4 then 2 since it is sorted in reverse order
		numbers.stream().filter(i -> i % 2 == 0).distinct().sorted(Comparator.reverseOrder()).limit(3)
				.forEach(System.out::println);
	}

}