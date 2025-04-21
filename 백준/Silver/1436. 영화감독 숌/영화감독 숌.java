

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        int count=0;
        int number=666;
        
        while(true){
          if(String.valueOf(number).contains("666")){
            count++;
            if(count==n){
              System.out.println(number);
              break;
            }
          }
          number++;
        }

    }
   
}
