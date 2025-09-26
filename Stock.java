import java.util.*;

public class Stock{
    public static void main(String[] args){
        int[] arr = {5,1,6,2,7,6,3};
        int cost = 0;
        int profit = 0;
        int mini = arr[0];
        for(int i=1;i<arr.length;i++){
            mini = Math.min(mini, arr[i]);
            cost = arr[i] - mini;
            profit = Math.max(profit, cost);
        }
        System.out.println("Maximum Profit: "+profit);
    }
}