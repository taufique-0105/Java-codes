import java.util.Scanner;

/**
 * average
 */
public class average {

  public static double calculate(double a,double b, double c) {
    return (a+b+c)/3;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers:");
    double num1 = sc.nextInt();
    double num2 = sc.nextInt();
    double num3 = sc.nextInt();
    double average = calculate(num1,num2,num3);
    System.out.println("The average of " +num1+ ", " +num2+ ", " +num3+ " is " +average);
    sc.close();
  }
}