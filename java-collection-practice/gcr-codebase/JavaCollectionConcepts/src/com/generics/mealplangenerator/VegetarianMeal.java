package com.generics.mealplangenerator;

public class VegetarianMeal implements MealPlan {
	
	@Override
	public String getMealName() {
		return "Vegeterial Meal";
	}
	
	@Override
	public int getCalories() {
		return 600;
	}
	
	@Override
	public int getProtein() {
		return 25;
	}
}