import java.util.*;

public class GuessNumber{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 1-10:");
        int comp_input = random.nextInt(1,11);
        int user_input = 0;
        while(user_input!=comp_input){
            System.out.print("Enter your guess: ");
            user_input = sc.nextInt();
            if(user_input<comp_input){
                System.out.println("Your guess is lower than the actual number.");
            } else if(user_input>comp_input){
                System.out.println("Your guess is higher than the actual number.");
            } else {
                System.out.println("Congratulations, you win!");
            }
        }
    }
}