//Create a class CopyArray to copy a 2D array into a 1D array.
import java.util.*;
public class CopyArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Read number of rows and columns
        int row = input.nextInt();
        int column = input.nextInt();
		
		//create 2D array matrix.
		int[][] matrix = new int[row][column];
		
		//read 2d array.
		for (int i=0; i<row; i++){
			for (int j=0; j<column; j++){
				matrix[i][j] = input.nextInt();
			}
		}
		
		//create 1D array matrix
		int[] array = new int[row*column];
		
			//Copy elements from 2D array to 1D array
		int index = 0;
		for (int i=0; i<row; i++){
			for (int j=0; j<column; j++){
				array[index] = matrix[i][j];
				index++;
			}
		}
			
		//print 1D array
		System.out.println("Elements in the 1D array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		//print 2D array
		System.out.println("Elements in the 2D array:");
		for (int i=0; i<row; i++){
			for (int j=0; j<column; j++){
				System.out.print(matrix[i][j] + " ");
			}
		}
    }
}