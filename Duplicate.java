public class Duplicate{
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor ^= arr[i];
        }
        System.out.print("Element which is not in pair: "+xor);
    }
}