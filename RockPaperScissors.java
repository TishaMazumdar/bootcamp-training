import java.util.*;

public class RockPaperScissors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\t\tRock | Paper | Scissors");
        System.out.println("\tChoose 0 for Rock");
        System.out.println("\tChoose 1 for Paper");
        System.out.println("\tChoose 2 for Scissors");
        System.out.println("\tChoose 3 to Exit");
        int comp_score = 0;
        int player_score = 0;

        System.out.print("Enter your choice [0/1/2/3]: ");
        int player_choice = sc.nextInt();
        int comp_choice = random.nextInt(0,3);
        System.out.println("Computer chose: "+comp_choice);
        while(player_choice!=3){
            if(player_choice==0 && comp_choice==2){
                player_score += 1;
            } else if(player_choice==1 && comp_choice==0){
                player_score += 1;
            } else if(player_choice==2 && comp_choice==1){
                player_score += 1;
            } else if(player_choice == 4){
                break;
            } else {
                comp_score += 1;
            }
            System.out.println("Enter your choice [0/1/2/3]: ");
            player_choice = sc.nextInt();
            comp_choice = random.nextInt(0,3);
            System.out.println("Computer chose: "+comp_choice);
        }

        System.out.println("Player Score: "+player_score);
        System.out.println("Computer Score: "+comp_score);
        if(player_score > comp_score){
            System.out.println("YOU WIN!");
        } else {
            System.out.println("YOU LOST!");
        }
    }
}