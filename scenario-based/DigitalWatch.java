/*
16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/

import java.util.*;

public class DigitalWatch {
	public static void main(String[] args){
		System.out.println("\nDigital Watch Started...\n");
		//outer loop for hours
		for (int hour=0; hour<24; hour++){
			//inner loop for minutes
			for (int minute=0; minute<60; minute++){
				
				System.out.println(hour + ":" + minute);
				//condition for stopping/power cut
				if (hour == 13 && minute == 0){
					System.out.println("Power cut!!!, Watch Stopped.");
					break;
				}
			}
			
			if (hour == 13){
				break;
			}
		}
	}
}