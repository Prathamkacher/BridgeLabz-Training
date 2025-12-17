import java.util.*;

public class PerimeterOfRectangle{
    public static void main(String args[]){
	    Scanner kb= new Scanner(System.in);
		
		double length= kb.nextDouble();
		double width= kb.nextDouble();
		double perimeter= 2*(length+width);
		System.out.println(perimeter);
	}
}