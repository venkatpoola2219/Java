package Java.Mouritech.Venkat1;

import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (N): ");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int repeatedElement = 0;

        for (int i = 0; i < size; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][size - 1 - i];
        }
        if (size % 2 != 0) {
            int centerIndex = size / 2;
            repeatedElement = matrix[centerIndex][centerIndex];
        }
        int totalSum = primaryDiagonalSum + secondaryDiagonalSum - repeatedElement;
        System.out.println("Sum of diagonals: " + totalSum);
    }
}
