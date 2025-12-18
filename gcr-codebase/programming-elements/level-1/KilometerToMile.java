//Create KilometerToMile Class to convert distance from KM to M
import java.util.*;
public class KilometerToMile{
	public static void main(String agrs[]){
	
		//Singleline Variable to store the distance in kilometer
		double distanceInKm = 10.8;
		//Singleline Variable to convert the kilometer to mile
		double mile = ((distanceInKm) * (1.6));
		//Display the distance from kilometer to mile
		System.out.println("The distance " + (distanceInKm)+ "km in miles is " + (mile));
	}
}