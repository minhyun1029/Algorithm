

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int d =sc.nextInt();
        int e =sc.nextInt();
        int f =sc.nextInt();
        
        int x = (c*e-b*f)/(a*e-b*d);
        int y = (c*d-a*f)/(b*d-e*a);

        System.out.println(x+" "+y);


    }    
}
