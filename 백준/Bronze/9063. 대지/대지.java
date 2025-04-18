import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<2){
          System.out.println(0);
          return;
        }
        
        int[] x = new int[N];
        int[] y = new int[N];
        for(int i=0;i<N;i++){
          x[i] =sc.nextInt();
          y[i] =sc.nextInt();
        }
        int minX = x[0];
        int maxX = x[0];
        int minY = y[0];
        int maxY = y[0];

        for(int i = 1; i < N; i++) {
            if(x[i] < minX) minX = x[i];
            if(x[i] > maxX) maxX = x[i];
            if(y[i] < minY) minY = y[i];
            if(y[i] > maxY) maxY = y[i];
        }

        if (N == 1) {
            System.out.println(0); 
        } else {
            System.out.println((maxX - minX) * (maxY - minY));
        }
    }
}