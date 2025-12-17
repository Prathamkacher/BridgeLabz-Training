import java.util.*;

public class CalculateAverageOfThreeNumbers{
    public static void main(String args[]){
	    Scanner kb= new Scanner(System.in);
		
		int first= kb.nextInt();
		int second= kb.nextInt();
		int third=kb.nextInt();
		int sum= first+second+third;
		double average= sum/3.0;
		
		System.out.println(average);
	}
}