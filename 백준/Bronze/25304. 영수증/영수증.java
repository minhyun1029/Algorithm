import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int a =sc.nextInt();
      int b =sc.nextInt();
      int price=0;
      for(int i=1;i<=b;i++){
        int c=sc.nextInt();
        int d=sc.nextInt();
        price+=c*d;
      }
      if(a==price){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
      
  }
}