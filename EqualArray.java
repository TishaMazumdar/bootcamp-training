public class EqualArray{
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,0,5};
        int[] arr2 = {5,0,1,2,4};
        int xor = 0;
        if(arr1.length == arr2.length){
            for(int i=0; i<arr1.length; i++){
                xor ^= arr1[i];
                xor ^= arr2[i];
            }
            if(xor == 0){
                System.out.println("Equal");
            } else {
                System.out.println("Not equal");
            }
        } else {
            System.out.println("Not equal");
        }

    }
}