package com.generics.mealplangenerator;

public class MealPlanGenerator {

	public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan, int maxCalories, int maxProtein) {
		
		if(mealPlan.getCalories() <= maxCalories && mealPlan.getProtein() >= maxProtein) {
			return new Meal<>(mealPlan);
		}
		
		throw new IllegalArgumentException("Meal does not meet daily requirements!");
	}
}
