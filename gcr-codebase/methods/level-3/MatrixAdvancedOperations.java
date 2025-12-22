//create a class MatrixAdvancedOperations to perform advanced matrix operations using static methods.
import java.util.*;
public class MatrixAdvancedOperations {

    //create random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(9) + 1;
            }
        }
        return matrix;
    }

    //transpose of matrix.
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    //Determinant of 2x2 matrix
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    //Determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    //Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;
        return inv;
    }

    //Inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    //display matrix.
    public static void printMatrix(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix not invertible.");
            return;
        }
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f\t", value);
            }
            System.out.println();
        }
    }

    //Main method
    public static void main(String[] args) {

        System.out.println("2x2 Matrix:");
        double[][] matrix2 = createRandomMatrix(2, 2);
        printMatrix(matrix2);

        System.out.println("\nTranspose:");
        printMatrix(transpose(matrix2));

        System.out.println("\nDeterminant: " + determinant2x2(matrix2));

        System.out.println("\nInverse:");
        printMatrix(inverse2x2(matrix2));

        System.out.println("\n------------------------------");

        System.out.println("\n3x3 Matrix:");
        double[][] matrix3 = createRandomMatrix(3, 3);
        printMatrix(matrix3);

        System.out.println("\nTranspose:");
        printMatrix(transpose(matrix3));

        System.out.println("\nDeterminant: " + determinant3x3(matrix3));

        System.out.println("\nInverse:");
        printMatrix(inverse3x3(matrix3));
    }
}