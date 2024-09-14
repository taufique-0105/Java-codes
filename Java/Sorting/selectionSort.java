package Sorting;

import java.util.Scanner;

public class selectionSort {
  public static void main(String[] args) {
    int arr[];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the list");
    int n = sc.nextInt();
    arr = new int[n];
    System.out.println("Enter "+n+" numbers of elements in the list");
    for(int i = 0; i < n; i++) {
      System.out.print("Enter "+(i+1)+" element:");
      arr[i] = sc.nextInt();
    }
    int temp;
    int minValue;
    for(int i = 0; i < n-1; i++) {
      minValue = i;
      for(int j = i+1;j<n;j++) {
        if(arr[j] < arr[minValue]) {
          minValue = j;
        }
      }
      temp = arr[i];
      arr[i] = arr[minValue];
      arr[minValue] = temp;
    }
    System.out.println("\nThe sorted array is : ");
    for(int i=0;i<n;i++) {
      System.out.print(arr[i]+"\t");
    }
    sc.close();
  }
}