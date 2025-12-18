//Create AveragePercentage Class to calculate Average Percentage marks obtained in PCM
import java.util.*;
public class AveragePercentage{
	public static void main(String agrs[]){
		
		//Create Variable to store and Calculate average in percentage
		int maths = 94, physics = 95, chemistry = 96;
		int obtainedMark = maths + physics + chemistry;
		int totalMark = 300;
		double averagePercentage = (obtainedMark*100.0)/totalMark;
		
		//Display the average percentage of Sam's mark in PCM
		System.out.println("Sam’s average mark in PCM is " + (averagePercentage) + "%");
	}
}