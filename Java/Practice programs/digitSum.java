public class digitSum {
  public static int dSum(int n) {
    int sum=0;
    while (n != 0){
      sum = sum + n % 10;
      n = n / 10;
    }
    return sum;
  }
  public static void main(String[] args) {
    System.out.println(dSum(23));
  }
}
