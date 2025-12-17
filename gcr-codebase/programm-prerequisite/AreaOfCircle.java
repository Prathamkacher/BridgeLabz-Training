import java.util.*;
import java.lang.Math;

public class AreaOfCircle{
    public static void main(String args[]){
	    Scanner kb= new Scanner(System.in);
		
		double radius= kb.nextDouble();
		double area= Math.PI * radius*radius;
		
		System.out.println(area);
	}
}
		