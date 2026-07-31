mport java.io.*; 
import java.util.*; 

public class JavaStringTokens { 

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in); 
		String s = scan.nextLine().split(); 
		String[] p = s.split("[^A-Za-z]+"); 
		
		if(s.isEmpty()){ 
			System.out.println(0); 
		} 
		else{ 
			System.out.println(p.length); 
			for (String token : p){ 
				System.out.println(token); 
			} 
		} 
		scan.close(); 
	} 
}