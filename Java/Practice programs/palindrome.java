public class palindrome {
  public static boolean isPalindrome(int n) {
    int r = 0; // reverse number
    int num = n;
    while (n > 0) {
      r = r * 10 + n % 10;
      n /= 10;
    }
    return num==r;
  }
  public static void main(String[] args) {
    System.out.println(isPalindrome(141));
  }
}
