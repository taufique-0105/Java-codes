package Arrays.Array_2D;

import java.util.Scanner;

public class noOfTimes {
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

    System.out.println("Enter the number you want to check it's repetation in the matrix");
    int key = sc.nextInt();

    int count = 0;
    for(int i = 0;i<row;i++) {
      for(int j =0;j<columns;j++) {
        if(matrix[i][j] == key) {
          count++;
        }
      }
    }

    System.out.println(key+" is repeated "+count+ " times.");

    sc.close();
  }
}