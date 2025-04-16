import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        
        int a=num1/100;
        int b=(num1%100)/10;
        int c=num1%10;
        int d=num2/100;
        int e=(num2%100)/10;
        int f=num2%10;
        int newNum1=c*100+b*10+a;
        int newNum2=f*100+e*10+d;
        System.out.println(Math.max(newNum1, newNum2));
        
    }
    
        
        
    
}

