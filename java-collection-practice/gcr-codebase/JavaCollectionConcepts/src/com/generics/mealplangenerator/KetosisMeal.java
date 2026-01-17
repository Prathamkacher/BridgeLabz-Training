package com.generics.mealplangenerator;

public class KetosisMeal implements MealPlan{

	@Override
	public String getMealName() {
		return "Keto Meal";
	}
	
	@Override
	public int getCalories() {
		return 200;
	}
	
	@Override
	public int getProtein() {
		return 40;
	}
}
