
import java.util.*;

public class Result{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0;i<5;i++){
            System.out.print("Enter marks of subject "+(i+1)+": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Total marks: "+sum+"/500");
        float percentage = ((float)sum/500)*100.0f;
        System.out.println("Percentage: "+percentage+"%");
    }
}