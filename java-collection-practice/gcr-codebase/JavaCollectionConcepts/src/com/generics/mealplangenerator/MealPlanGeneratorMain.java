package com.generics.mealplangenerator;

public class MealPlanGeneratorMain {

	public static void main(String[] args) {
		
		try {
			Meal<KetosisMeal> ketoMeal = MealPlanGenerator.generateMealPlan(new KetosisMeal(), 100, 30);
			ketoMeal.showNutrition();
			
			Meal<VegetarianMeal> vegMeal = MealPlanGenerator.generateMealPlan(new VegetarianMeal(), 500, 20);
			vegMeal.showNutrition();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
