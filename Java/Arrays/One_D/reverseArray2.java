package Arrays.One_D;

public class reverseArray2 {
  public static void main(String[] args) {
    int[] arr = {54 ,44, 78, 95, 12, 5};
    int[] reversed = reverseArray(arr);
    for(int i=0; i<reversed.length;i++) {
      System.out.print(reversed[i] + " ");
    }
  }
  static int[] reverseArray(int[] array) {
    int n = array.length;
    int i = 0;
    while(i<n) {
      int temp = array[i];
      array[i] = array[n-1];
      array[n-1] = temp;
      i++;
      n--;
    }
    return array;
  }
}
