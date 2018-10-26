package com.sssm.lambdasandstreams.filter;

import java.util.Arrays;
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
		// this line should print 4 followed by 2 followed by 6 since it is unsorted
		numbers.stream().filter(i -> i % 2 == 0).distinct().limit(4).forEach(System.out::println);
		
		System.out.println("\nFirst two unique even numbers unsorted = ");
		// this line should print 4 followed by 2 since it is unsorted
		numbers.stream().filter(i -> i % 2 == 0).distinct().limit(2).forEach(System.out::println);

		// sort the list
		numbers.sort((i1, i2) -> i1.compareTo(i2));
		
		// if source is sorted, result will be sorted.
		System.out.println("\nFirst two unique even numbers sorted = ");
		// this line should print 2 followed by 4 since it is sorted
		numbers.stream().filter(i -> i % 2 == 0).distinct().limit(2).forEach(System.out::println);
	}

}