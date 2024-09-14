package Arrays.ArrayList;
import java.util.*;

public class add {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char n;
    n='y';
    // Create an empty ArrayList
    java.util.ArrayList<Integer> list = new ArrayList<Integer>();
    while(n=='y') {
      list.add(sc.nextInt());
      System.out.print("To add more enter y else n");
      n =  sc.next().charAt(0);
    }
    System.out.println("ArrayList: " + list);
    sc.close();
  }
}
