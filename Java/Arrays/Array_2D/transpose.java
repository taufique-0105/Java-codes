package Arrays.Array_2D;

import java.util.Scanner;

public class transpose {
  public static int[][] transpose(int matrix[][], int rows, int columns) {
    int[][] matrix2 = new int[columns][rows];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        matrix2[j][i] = matrix[i][j];
      }
    }
    return matrix2;
  }

  public static void main(String[] args) {
    int matrix[][];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns:");
    System.out.print("Rows:");
    int row = sc.nextInt();
    System.out.print("Colomns:");
    int columns = sc.nextInt();

    matrix = new int[row][columns];

    System.out.println("Enter the values in the matrix:");

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print("Matrix (" + i + "," + j + ") = ");
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("Entered matrix is:");
    for(int i=0;i<row;i++) {
      for(int j=0;j<columns;j++) {
        System.out.print(matrix[i][j]+"\t");
      }
      System.out.println();
    }
    int[][] trans =transpose(matrix, row, columns);
    System.out.println("\nTransposed Matrix is:\n");
    for(int i=0;i<columns;i++) {
      for(int j=0;j<row;j++) {
        System.out.print(trans[i][j]+"\t");
      }
      System.out.println();
    }
  }
}
