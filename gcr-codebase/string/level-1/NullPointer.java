//create NullPointer class to demonstrate null pointer exception.
import java.util.*;
public class NullPointer {
	
	//method to generate null-pointer exception.
	public static void generateException(){
		String text = null;
		
		System.out.println(text.length());
	}
	
	//method to handle exception
	public static void handleException(){
		String text = null;
		
		try{
			System.out.println(text.length());
		} catch (NullPointerException e){
			System.out.println("NullPointerException caught!!");
			System.out.println("Reason: try to access method in a null object");
		}
	}
	
	public static void main(String[] args){
		//generate the exception
        System.out.println("Generating NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException()");
        }

        //Handle the exception.
        System.out.println("\nHandling NullPointerException:");
        handleException();
	}
	
}