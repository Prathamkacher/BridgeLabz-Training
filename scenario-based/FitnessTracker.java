/*
13. Sandeep’s Fitness Challenge Tracker 🏋️
Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/

import java.util.*;
public class FitnessTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║  Sandeep's Fitness Challenge Tracker ║");
        System.out.println("╚══════════════════════════════════════╝\n");
		
		//taking input from user
		int[] days = new int[7];
		for (int i=0; i<days.length; i++){
			System.out.println("Enter number of Push-Ups in day " + (i+1) + " (0 == Rest day):");
			days[i] = input.nextInt();
		}
		
		int totalPushUps = 0;
		int workoutDays = 0;
		//for-each loop to calculate totalPushUps
		for (int pushUps : days ){
			if (pushUps == 0){
				continue; //rest day
			}
			
			totalPushUps += pushUps; 
			workoutDays ++;
		}
		// calculate average push-ups
		double average = (workoutDays > 0)
			? (double) totalPushUps / workoutDays
			: 0;
			
		// Summary Output
        System.out.println("\n════════════  WEEKLY SUMMARY  ════════════");
        System.out.println(" Total Push-Ups  : " + totalPushUps);
        System.out.println(" Workout Days    : " + workoutDays);
        System.out.printf(" Average/Day      : %.2f%n", average);
        System.out.println("════════════════════════════════════════════");

        System.out.println("\n Keep going, Sandeep! Consistency is the Key!");
	
		input.close();
	}
}