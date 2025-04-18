import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
      Scanner sc =new Scanner(System.in);
      int X =sc.nextInt();
      
      int n=1;
      int sum=0;
       
      while(sum + n<X){
        sum+=n;
        n++;
      }

      int position = X-sum;
      int a=0;
      int b=0;
      if(n%2==0){
        a = position;
        b = n-position+1;
      }else{
        a = n-position+1;
        b = position;
      }
      System.out.println(a+"/"+b);


    }
}
