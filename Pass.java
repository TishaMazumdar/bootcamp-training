import java.util.*;

public class Pass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0f;
        int fail = 1;

        for(int i=0;i<3;i++){
            System.out.print("Enter marks of subject "+(i+1)+": ");
            float n = sc.nextFloat();
            if(n<=33.0){
                fail = 0;
            } else {
                sum += n;
            }
        }

        if(fail==1){
            if(((sum/300)*100)>40){
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("Fail");
        }
    }
}