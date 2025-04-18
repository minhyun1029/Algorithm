import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x==y&&y==z&&z==60){
          System.out.println("Equilateral");
        }else if(x+y+z==180 && x==y | y==z | x==z){
          System.out.println("Isosceles");
        }else if(x+y+z==180){
          System.out.println("Scalene");
        }else{
          System.out.println("Error");
        }
    }
}