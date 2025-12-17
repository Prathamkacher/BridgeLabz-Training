import java.util.*;

public class CalculateSimpleInterest{
    public static void main(String args[]){
	    Scanner kb= new Scanner(System.in);
		
		int principal = kb.nextInt();
		double rate = kb.nextDouble();
		double time = kb.nextDouble();
		
		double simpleInterest= (principal*rate*time)/100;
		System.out.println(simpleInterest);
	}
}
		