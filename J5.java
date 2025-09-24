import java.util.*;

public class J5{
    // Implement a function to find the nth Fibonacci number using dynamic programming.
    public static void fibonacci(int n, int prev, int next){
        int ans;
        if(n == 1 || n == 0){
            ans = 0;
        } else {
            ans = prev+next;
            System.out.print(ans + " ");
            fibonacci(n-1, next, ans);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int prev = 0;
        int next = 1;
        if(n==0){
            System.out.println("Enter number greater than 0");
        } else if(n==1){
            System.out.println("0");
        } else {
            System.out.print("0 1 ");
            fibonacci(n-1, prev, next);
        }
    }
}