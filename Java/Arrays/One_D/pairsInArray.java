package Arrays.One_D;

import java.util.Scanner;

public class pairsInArray {
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
    int k=1;
    for(int i=0;i<n-1;i++) {
      for(int j=i+1;j<n;j++) {
        System.out.println("Pair "+k+ " is ("+arr[i]+","+arr[j]+")");
        k++;
      }
    }
    sc.close();
  }
}
