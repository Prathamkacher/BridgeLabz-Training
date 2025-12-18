//Create a class VolumeOfEarth to calculate the volume of Earth.
import java.util.*;
public class VolumeOfEarth {
    public static void main(String[] args) {

        //Create variable to store and calculate the volume of Earth in km^3 and miles^3.
        double radiusInKm = 6378;
        double pi = Math.PI;
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusInKm, 3);
		double volumeMiles = volumeKm * Math.pow(0.62, 3);
		
        // Print statement for output
        System.out.println("The volume of earth in cubic kilometers is "+ volumeKm +" and cubic miles is " + volumeMiles);
	}
}