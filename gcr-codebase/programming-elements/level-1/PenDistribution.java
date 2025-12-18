//Create a class PenDistribution to distribute the pen among students.
import java.util.*;
public class PenDistribution {
    public static void main(String[] args) {

        //Create variable to store and calculate how many pen each student get
        int totalPens = 14;
        int totalStudents = 3;
        int penDistributed = totalPens/totalStudents;
        int remainingPen = totalPens%totalStudents;
		
        // Print statement for output
        System.out.println("The Pen Per Student is "+ penDistributed +" and the remaining pen not distributed is " + remainingPen);
	}
}