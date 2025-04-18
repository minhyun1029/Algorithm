import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M =sc.nextInt();
        int N =sc.nextInt();

        int sum=0;
        int min = Integer.MAX_VALUE;
        boolean found = false;
        for(int i=M;i<=N;i++){
          int count=0;
          for(int j=1;j<=i;j++){
            if(i%j==0){
              count++;
            }
          }
          if(count==2){
            sum+=i;
            if(i<min){
              min=i;
            }
            found = true;
          }
        }
        if(found){
          System.out.println(sum);
          System.out.println(min);
        }else{
          System.out.println(-1);
        }
        
    }
}
