package com.generics.mealplangenerator;

public class VeganMeal implements MealPlan {

	@Override
	public String getMealName() {
		return "Vegan Meal";
	}
	
	@Override
	public int getCalories() {
		return 400;
	}
	
	@Override
	public int getProtein() {
		return 20;
	}
}
