

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for(int i=0;i<5;i++){
          num[i]=sc.nextInt();
        }
        Arrays.sort(num);

        int avg = (num[0]+num[1]+num[2]+num[3]+num[4])/5;
        System.out.println(avg);
        System.out.println(num[2]);
        
    }
   
}
