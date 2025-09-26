import java.util.*;

public class Squares{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int i = 1;
        while(Math.pow(i,2)<=n){
            System.out.print((int)Math.pow(i,2)+" ");
            i++;
        }
    }
}