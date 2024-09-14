package Arrays.One_D;

import java.util.Scanner;

public class reverseArray {
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

    int low = 0;
    int high = n-1;
    while(low<=high) {
      if(low < high) {
        arr[low] = arr[low] + arr[high];
        arr[high] = arr[low] - arr[high];
        arr[low] = arr[low] - arr[high];
      }
      else if(low == high) {
        break;
      }
      low++;
      high--;
    }

    for(int i=0;i<n;i++) {
      System.out.println(arr[i]+" ");
    }
    sc.close();
  }
}
