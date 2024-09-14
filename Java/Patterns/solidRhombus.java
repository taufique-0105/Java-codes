package Patterns;

public class solidRhombus {
  public static void main(String[] args) {
    for(int i=5;i>0;i--) {
      for(int j=1;j<i+4;j++) {
        if(j<i) {
          System.out.print("  ");
        }
        else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
