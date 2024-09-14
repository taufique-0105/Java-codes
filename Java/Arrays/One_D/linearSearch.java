package Arrays.One_D;
import java.util.Scanner;
public class linearSearch {
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
    System.out.println("Enter the element to search");
    int search = sc.nextInt();
    for(int i=0;i<n;i++) {
      if(arr[i]==search) {
        System.out.println("Element found at index :"+(i+1));
      }
    }
    sc.close();
  }
}
