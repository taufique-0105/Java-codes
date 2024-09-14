public class Even {
  public static boolean isEven(int num) {
    if(num%2==0) return true;
    else return false;
  }
  public static void main(String[] args) {
    boolean result = isEven(21);
    System.out.println(result);
  }
}
