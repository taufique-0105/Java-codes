package String;

import java.util.Scanner;

/**
 * palindrome
 */
public class palindrome {

  public static void main(String[] args) {
    String str = new String();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string to check palindrome:");
    str = sc.nextLine();

    boolean result = isPalindrome(str);
    if(result == true) {
      System.out.println("Entered string is palindrome");
    }
    else {
      System.out.println("Entered string is not palindrome");
    }
    sc.close();
  }

  public static boolean isPalindrome(String str) {
    int n = str.length();
    for(int i=0; i<n/2; i++) {
      if(str.charAt(i) == str.charAt(n-i-1)) {
        continue;
      }
      else {
        return false;
      }
    }
    return true;
  }
}