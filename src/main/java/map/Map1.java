package map;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

// Challenge ->
// 		Given a list of numbers, return squares of those numbers.
//		e.g. given a list [1, 2, 3, 4, 5], return [1, 4, 9, 16, 25]

public class Map1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> squares = numbers.stream().map(i -> i * i).collect(toList());

		// print to console
		squares.stream().forEach(System.out::println);
	}

}
