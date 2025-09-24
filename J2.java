import java.util.*;

public class J2{
    // Implement a function to check if a given string is a palindrome.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i=0; i<str.length(); i++){
            rev += str.charAt(str.length()-1-i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}