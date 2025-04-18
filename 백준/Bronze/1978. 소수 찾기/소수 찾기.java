import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        
        int result=0;
        for(int i=0;i<num;i++){
          int sosu = sc.nextInt();
          int count=0;
          for(int j=1;j<=sosu;j++){
            
            if(sosu%j==0){
              count++;
            }
            
          }
          if(count==2){
            result++;
          }
        }
        System.out.println(result);
    }
}
