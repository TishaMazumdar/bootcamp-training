import java.util.*;

public class J3{
    // Write a program to find the factorial of a number using recursion.
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("Factorial of "+n+": "+fact);
    }
}