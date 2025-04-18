import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        int x =0;
        int y =0;

        if(num1==num3){
          x=num5;
        }else if(num3==num5){
          x=num1;
        }else{
          x=num3;
        }
        if(num2==num4){
          y=num6;
        }else if(num2==num6){
          y=num4;
        }else{
          y=num2;
        }
        System.out.println(x+" "+y);
        
    }
}
