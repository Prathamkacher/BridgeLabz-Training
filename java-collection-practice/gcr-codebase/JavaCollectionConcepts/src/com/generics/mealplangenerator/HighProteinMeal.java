package com.generics.mealplangenerator;

public class HighProteinMeal implements MealPlan {

	@Override
	public String getMealName() {
		return "High Protein Meal";
	}
	
	@Override
	public int getCalories() {
		return 500;
	}
	
	@Override
	public int getProtein() {
		return 50;
	}
}
