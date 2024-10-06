package Arrays.One_D;

public class findAllMissingNumber {
  public static void main(String[] args) {
    int[] arr = {4,2,1,5,8,3,7,6};

    int n = arr.length;
    int i =0;
    while (i<n) {
      int correctIndex = arr[i]-1;
      if(arr[i] != i+1) {
        int temp = arr[i];
        arr[i] = arr[correctIndex]; 
        arr[correctIndex] = temp;
      }
      else {
        i++;
      }
    }
    for (int j : arr) {
      System.out.print(arr[j]+" ");
    }
  }
}
