package com.sssm.lambdasandstreams.terminaloperations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Performs an action for each element of this stream.
// This is a terminal operation.
// The behavior of this operation is explicitly nondeterministic. 
// For parallel stream pipelines, this operation does not guarantee to respect the encounter order of the stream, as doing so would sacrifice the benefit of parallelism. 
// For any given element, the action may be performed at whatever time and in whatever thread the library chooses. 
// If the action accesses shared state, it is responsible for providing the required synchronization.
public class ForEach {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 8, 10, 12, 20);
		list.stream().forEach(System.out::println);
		
		System.out.println();

		Map<String, Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.keySet().stream().forEach(System.out::println);
	}

}
