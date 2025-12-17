import java.util.*;

public class ConvertKilometersToMiles{
    public static void main(String args[]){
	    Scanner kb= new Scanner(System.in);
		
		double kilometer= kb.nextDouble();
		double miles= kilometer*0.621371;
		
		System.out.println(miles);
	}
}