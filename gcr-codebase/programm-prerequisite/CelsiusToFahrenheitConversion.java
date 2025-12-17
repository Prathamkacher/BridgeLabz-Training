import java.util.*;

public class CelsiusToFahrenheitConversion{
    public static void main(String args[]){
	    Scanner kb= new Scanner(System.in);
		
		float celcius= kb.nextFloat();
		float fahrenheit= (celcius * 9/5) +32;
		
		System.out.println(fahrenheit);
	}
}
		