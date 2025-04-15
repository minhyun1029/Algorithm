import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = B%10;
    int D = B/10%10;
    int E = B/100;
    System.out.println(A*C);
    System.out.println(A*D);
    System.out.println(A*E);
    System.out.println(A*C+A*D*10+A*E*100);
    
    
  
  }
}
