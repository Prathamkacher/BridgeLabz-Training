package com.generics.mealplangenerator;

public class Meal<T extends MealPlan> {

	private T mealPlan;
	
	public Meal(T mealPlan) {
		this.mealPlan = mealPlan;
	}
	
	public T getMealPlan() {
		return mealPlan;
	}
	
	public void showNutrition() {
		System.out.println(mealPlan.getMealName() + " Calories: " + mealPlan.getCalories() + " Protein: " + mealPlan.getProtein());
	}
}
