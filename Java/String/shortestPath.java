package String;

import java.util.Scanner;

public class shortestPath {
  public static void main(String[] args) {
    System.out.println("Enter the path with north as N, south as S, east as E, west as W");

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    int x=0;
    int y=0;

    for(int i=0;i<str.length();i++) {
      if(str.charAt(i) == 'N') {
        y++;
      }
      else if(str.charAt(i) == 'S') {
        y--;
      }
      else if(str.charAt(i) == 'E') {
        x++;
      }
      else if(str.charAt(i) == 'W') {
        x--;
      }
    }
    double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

    System.out.println("The shortest distance is " + distance);
    sc.close();
  }
}
