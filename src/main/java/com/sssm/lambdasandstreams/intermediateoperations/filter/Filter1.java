package com.sssm.lambdasandstreams.intermediateoperations.filter;

import java.util.ArrayList;
import java.util.List;

// Filter
public class Filter1 {

	public static void main(String[] args) {
		List<Dish> dishes = new ArrayList<>();
		dishes.add(new Dish(100, true));
		dishes.add(new Dish(200, false));
		dishes.add(new Dish(300, true));
		dishes.add(new Dish(400, false));
		dishes.add(new Dish(500, true));

		// Given a list of Dishes, find number of dishes with calories < 300
		System.out.println(
				"Number of dishes with calories < 300 = " + dishes.stream().filter(d -> d.getCalories() < 300).count());

		// Given a list of Dishes, find number of vegetarian dishes
		System.out.println("Number of vegetarian dishes = " + dishes.stream().filter(Dish::isVegetarian).count());
	}

}

class Dish {
	private int calories;
	private boolean isVegetarian;

	Dish(int calories, boolean isVegetarian) {
		this.calories = calories;
		this.isVegetarian = isVegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public boolean isVegetarian() {
		return isVegetarian;
	}

}
