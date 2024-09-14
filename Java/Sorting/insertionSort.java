

// Having error


package Sorting;

import java.util.Scanner;

public class insertionSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the list");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter "+n+" numbers of elements in the list");
    for(int i = 0; i < n; i++) {
      System.out.print("Enter "+(i+1)+" element:");
      arr[i] = sc.nextInt();
    }
    
    for(int i=1;i<n;i++) {
      int currentElement = arr[i];
      int j = i-1;
      while(j>=0 && currentElement < arr[j]) {
        arr[j+1] = arr[j] ;
      }
      arr[j] = currentElement;
    }

    System.out.println("After sorting:");
    for(int i=0;i<n;i++) {
      System.out.print(arr[i]+"\t");
    }
    sc.close();
  }
}