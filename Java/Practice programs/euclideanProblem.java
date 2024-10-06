/*
Euclidean algorithm for finding the GCD of two  numbers.

Steps to find GCD using Euclidean method:
> If A = 0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can stop.
> If B = 0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can stop.
> Write A in quotient remainder form (A = B⋅Q + R)
> Find GCD(B,R) using the Euclidean Algorithm since GCD(A,B) = GCD(B,R)

GCD of two numbers is the largest number that divides both of them.
A simple way to find GCD is to factorize both numbers and multiply common prime factors.
The algorithm is based on the below facts.

If we subtract a smaller number from a larger one (we reduce a larger number), GCD doesn’t change.
So if we keep subtracting repeatedly the larger of two, we end up with GCD.
Now instead of subtraction, if we divide the larger number, the algorithm stops when we find the remainder 0.
*/

import java.util.*;
public class euclideanProblem {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to find the GCD");
        int a,b;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b = sc.nextInt();
        int result = GCD(a,b);
        System.out.println("The GCD is " + result);
        sc.close();
    }
    public static int GCD(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}
