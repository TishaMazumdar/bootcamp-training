import java.util.*;

public class Escalator{
    // Runs: 25 steps | 15 s
    // Walks: 15 steps | 25 s
    // To find number of steps in the escalator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter steps taken while running: ");
        int r_steps = sc.nextInt();
        System.out.print("Enter time taken while running: ");
        int r_time = sc.nextInt();
        System.out.print("Enter steps taken while walking: ");
        int w_steps = sc.nextInt();
        System.out.print("Enter time taken while walking: ");
        int w_time = sc.nextInt();

        // float step_diff = Math.abs(r_steps - w_steps);
        // float time_diff = Math.abs(r_time - w_time);
        // float time_per_step = step_diff / time_diff;

        // float steps = r_steps + (r_time * time_per_step);

        // System.out.println("Number of steps by linear function: "+steps);

        // Using ratio
        float N;
        float time_ratio = (float)r_time / (float)w_time;
        System.out.println("Time ratio: "+time_ratio);
        N = (r_steps - (w_steps*time_ratio)) / (1-time_ratio);
        System.out.println("Number of steps by ratio method: "+N);
    }
}