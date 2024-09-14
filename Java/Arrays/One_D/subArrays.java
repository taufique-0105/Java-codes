package Arrays.One_D;

import java.util.Scanner;

public class subArrays {
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
    int l=1;
    for(int i=0;i<n;i++) {
      for(int j=i;j<n;j++) {
        System.out.print("Subarray "+l+":");
        for(int k=i;k<=j;k++) {
          System.out.print(arr[k]+" ");
        }
        l++;
        System.out.println();
      }
    }
    sc.close();
  }
}
