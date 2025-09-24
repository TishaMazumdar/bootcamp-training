import java.util.*;

public class J4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("Greatest: "+a);
            } else {
                System.out.println("Greatest: "+c);
            }
        } else {
            if(b>c){
                System.out.println("Greatest: "+b);
            } else {
                System.out.println("Greatest: "+c);
            }
        }
    }
}