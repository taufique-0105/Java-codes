package Sorting;

import java.util.Scanner;

public class bubbleSort {
  public static void main(String[] args) {
    int arr[];
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n =sc.nextInt();
    arr=new int[n];
    System.out.println("Enter elements of array:");
    for (int i=0;i<n;i++) {
      System.out.print("Element "+(i+1)+": ");
      arr[i] =sc.nextInt();
    }
    for(int i=0;i<n;i++) {
      for(int j=0;j<n-i-1;j++) {
        if(arr[j] > arr[j+1]) {
          arr[j] = arr[j] + arr[j+1];
          arr[j+1] = arr[j] - arr[j+1];
          arr[j] = arr[j] - arr[j+1];
        }
      }
    }
    System.out.println("After sorting this array:");
    for(int i=0;i<n;i++) {
      System.out.print(arr[i]+"\t");
    }
    sc.close();
  }
}
