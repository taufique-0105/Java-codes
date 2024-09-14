package Arrays.One_D;
import java.util.Scanner;

public class maxValue {
  public static void main(String[] args) {
    int arr[];
    int largest = Integer.MIN_VALUE;
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
      if(arr[i]>largest) {
        largest=arr[i];
      }
    }
    System.out.println("The largest element in the given array is "+largest);
    sc.close();
  }
}
