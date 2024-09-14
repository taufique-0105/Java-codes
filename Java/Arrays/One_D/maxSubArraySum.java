package Arrays.One_D;

import java.util.Scanner;

public class maxSubArraySum {
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
    int sum=0;
    int max = Integer.MIN_VALUE;
    int l=1;
    for(int i=0;i<n;i++) {
      for(int j=i;j<n;j++) {
        System.out.print("Subarray "+l+":");
        for(int k=i;k<=j;k++) {
          System.out.print(arr[k]+" ");
          sum = sum + arr[k];
        }
        if(sum > max) {
          max = sum;
        }
        System.out.print(" and sum is "+sum);
        sum=0;
        l++;
        System.out.println();
      }
    }
    System.out.println("The maximum sum is "+max);
    sc.close();
  }
}
