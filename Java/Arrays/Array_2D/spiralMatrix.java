package Arrays.Array_2D;

import java.util.Scanner;

public class spiralMatrix {

  public static void printSpiral(int matrix[][], int row, int columns) {
    int startRow = 0;
    int startColumn = 0;
    int endRow = row - 1;
    int endColumn = columns - 1;
    while (startColumn <= endColumn && startRow <= endRow) {
      for (int j = startColumn; j < endColumn + 1; j++) {
        System.out.print(matrix[startRow][j] + " ");
      }
      // System.out.println();
      for (int i = startColumn + 1; i < endRow + 1; i++) {
        System.out.print(matrix[i][endColumn] + " ");
      }
      // System.out.println();
      for (int j = endColumn - 1; j >= startColumn; j--) {
        if (startRow != endRow) {
          System.out.print(matrix[endRow][j] + " ");
        }
      }
      // System.out.println();
      for (int i = endRow - 1; i > startRow; i--) {
        if (startColumn != endColumn) {
          System.out.print(matrix[i][startColumn] + " ");
        }
      }
      // System.out.println();
      startRow++;
      startColumn++;
      endRow--;
      endColumn--;
    }
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

    for(int i = 0; i < row; i++) {
    for(int j = 0; j < columns; j++) {
    System.out.print("Matrix ("+i+","+j+") = ");
    matrix[i][j] = sc.nextInt();
    }
    }

    printSpiral(matrix, row, columns);
    sc.close();
  }
}
