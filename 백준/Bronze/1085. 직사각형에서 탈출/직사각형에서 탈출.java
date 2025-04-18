import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int x = Math.abs(A-C);
        int y = Math.abs(B-D);
       
        int[] num={A,B,x,y};
        int small=num[0];
        for(int i=0;i<4;i++){
          if(small>num[i]){
            small=num[i];
          }
        }
        System.out.println(small);
        
        
    }
}
