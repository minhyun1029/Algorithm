import java.util.*;

public class Main {
    public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      
      
      
      
      long a =sc.nextLong();
      long b =sc.nextLong();
      long c =sc.nextLong();
      long d =sc.nextLong();
      long son = a*d+c*b;
      long parent = b*d;
      long g = gcd(son,parent);

      System.out.println(son/g+" "+parent/g);
      
      
       




    }
    public static long gcd(long a, long b){
      if(b==0) return a;
      return gcd(b,a%b);
    }

    public static long lcm(long a, long b){
      return a*b/gcd(a,b);
    }
    
   
}


