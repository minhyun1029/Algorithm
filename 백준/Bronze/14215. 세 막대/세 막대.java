import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sticks = new int[3];
        for(int i=0;i<3;i++){
          sticks[i]=sc.nextInt();
        }        

        Arrays.sort(sticks);

        if(sticks[2]<sticks[1]+sticks[0]){
          System.out.println(sticks[0]+sticks[1]+sticks[2]);
        }else{
          System.out.println(sticks[0]+sticks[1]+sticks[0]+sticks[1]-1);
        }
            
        
    }
}
