import java.util.*;
public class War{
    // Two countries are at war
    // Size of arrays are same
    // Compare each soldier's power with each other - A[0] vs B[0] ...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of arrays: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter power of A: ");
            arr1[i] = sc.nextInt();
            System.out.print("Enter power of B: ");
            arr2[i] = sc.nextInt();
        }

        int arr1_count = 0;
        int arr2_count = 0;

        for(int j=0; j<n; j++){
            if(arr1[j]>arr2[j]){
                arr1_count++;
            } else if(arr2[j]>arr1[j]){
                arr2_count++;
            } else {
                continue;
            }
        }

        if(arr1_count > arr2_count){
            System.out.print("A wins");
        } else if(arr1_count < arr2_count){
            System.out.print("B wins");
        } else {
            System.out.print("It's a tie");
        }
    }
}