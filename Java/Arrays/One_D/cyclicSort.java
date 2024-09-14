package Arrays.One_D;
// import java.util.*;

public class cyclicSort {
  public static void main(String[] args) {
    int[] arr = {5,1,7,9,2,4,3,6,8};
    int n = arr.length;
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the number of elements");
    // int n = sc.nextInt();
    // arr = new int[n];
    // System.out.println("Enter the elements");
    // for(int i = 0; i < n; i++) {
    //   arr[i] = sc.nextInt();
    // }
    // System.out.println("After sorting");
    int i = 0;
    while (i < n) {
      int correctIndex = arr[i] -1;
      if (arr[i] != i + 1) {
        // Swap arr[i] with the element at the position it should be
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
      } 
      else {
        i++;
      }
    }

    for (int j = 0; j < n; j++) {
      System.out.print(arr[j] + " ");
    }
    // sc.close();
  }
}