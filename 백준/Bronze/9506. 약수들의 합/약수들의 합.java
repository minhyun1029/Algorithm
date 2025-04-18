import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
          int num = sc.nextInt();
          if(num == -1) break;

          int sum=0;
          ArrayList<Integer> divide =new ArrayList<>();

          for(int i=1;i<num;i++){
            if(num%i==0){
              sum+=i;
              divide.add(i);
            }
          }

          if(sum == num){
            System.out.print(num +" = ");
            for(int i=0;i<divide.size();i++){
              System.out.print(divide.get(i));
              if(i != divide.size()-1){
                System.out.print(" + ");
              }
            }
            System.out.println();
          }else{
            System.out.println(num + " is NOT perfect.");
          }
            
        }
        
    }
}
