public class MissingElement{
    public static int xor(){
        int[] arr = {1,2,4,5};
        int xor = 0;
        int n = arr.length+1;
        for(int i=0; i<=n; i++){
            xor ^= i;
            System.out.println("XOR1: "+xor);
        }
        System.out.print("\n");
        for(int i=0; i<arr.length; i++){
            xor ^= arr[i];
            System.out.println("XOR2: "+xor);
        }
        System.out.println("---------------------------------------------------");
        return xor;
    }

    public static int diff(){
        int[] arr = {1,2,4,5};
        int len = arr.length;
        int ans = 0;
        for(int i=0; i<len-1; i++){
            if(arr[i+1]-arr[i] != 1){
                ans = arr[i]+1;
                break;
            }
        }
        return ans;
    }

    public static int sum_logic(){
        int arr[] = {1,2,4,5};
        int n_sum = 5*(5+1)/2;
        int arr_sum = 0;
        for(int i=0;i<arr.length;i++){
            arr_sum += arr[i];
        }
        return n_sum-arr_sum;
    }

    public static void main(String[] args){
        int xor_ans = xor();
        System.out.println("Missing Element by XOR: "+xor_ans);

        int diff_ans = diff();
        System.out.println("Missing Element by Difference: "+diff_ans);

        int sum_logic_ans = sum_logic();
        System.out.println("Missing Element by Sum of N Natural Numbers Logic: "+sum_logic_ans);
    }
}