//Create a class ConvertKmToMile to convert distance in kilometers to miles.
import java.util.*;
public class ConvertKmToMile{
	public static void main(String agrs[]){
	
		//Create variable to store the distance in kilometer and convert in mile.
		Scanner input = new Scanner(System.in);
		double distanceInKm = input.nextDouble();
		double mile = distanceInKm * 0.62137;
		
		//Display the distance from kilometer to mile
		System.out.println("The distance " + distanceInKm + "km in miles is " + mile);
	}
}