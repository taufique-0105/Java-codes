package Arrays.One_D;

import java.util.Scanner;

public class trappingRainWater {
  public static void main(String[] args) {
    int arr[];
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of bars:");
    int n =sc.nextInt();
    arr=new int[n];
    System.out.println("Enter the values of the bars");
    for (int i=0;i<n;i++) {
      System.out.print("Bar "+(i+1)+": ");
      arr[i] =sc.nextInt();
    }
    int left_max;
    int right_max;
    int water_level;
    int trapped_water=0;

    for(int i=0;i<n;i++) {
      left_max = arr[i];
      right_max = arr[i];
      for(int j=i+1;j<n;j++) {
        if(arr[j]>right_max) {
          right_max = arr[j];
        }
      }
      for(int j = i;j>=0;j--) {
        if(arr[j]>left_max) {
          left_max = arr[j];
        }
      }
      water_level = left_max>right_max ? right_max : left_max;

      trapped_water += water_level - arr[i];

    }
    System.out.println("Total amount of water that can be stored is "+trapped_water);
    sc.close();
  }
}
