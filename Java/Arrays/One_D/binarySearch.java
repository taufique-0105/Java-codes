package Arrays.One_D;

import java.util.Scanner;

public class binarySearch {
  public static void main(String[] args) {
    int arr[];
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n =sc.nextInt();
    arr=new int[n];
    System.out.println("Enter elements of array in increasing order:");
    for (int i=0;i<n;i++) {
      System.out.print("Element "+(i+1)+": ");
      arr[i] =sc.nextInt();
    }
    System.out.println("Enter the element to search");
    int search = sc.nextInt();

    int low=0;
    int high=n-1;
    int mid=(low+high)/2;

    while(low<high) {
      mid = (low+high)/2;
      if(arr[mid]==search) {
        System.out.println("Element found at index " + mid);
      }
      else if(arr[mid] > search) {
        high = mid-1;
      }
      else if(arr[mid] < search) {
        low = mid+1;
      }
      else {
        System.out.println("Element not found.");
      }
    }
    sc.close();
  }
}
