import java.util.*;
import java.lang.Math;

public class PowerCalculation{
    public static void main(String args[]){
	    Scanner kb= new Scanner(System.in);
		
		int base= kb.nextInt();
		int exponent= kb.nextInt();
		double power= Math.pow(base,exponent);
		System.out.println(power);
	}
}