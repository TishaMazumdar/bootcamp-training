import  java.util.*;

public class J1{
    // Write a program to reverse a string without using library functions.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i=0; i<str.length(); i++){
            rev += str.charAt(str.length()-1-i);
        }
        System.out.println("Reversed string: "+rev);
    }
}