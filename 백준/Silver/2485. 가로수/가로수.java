import java.util.*;

public class Main {
    public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      
      
      int N = sc.nextInt();
      
      long[] d = new long[N];
      for(int i=0;i<N;i++){
        d[i]=sc.nextLong();
      }
      Arrays.sort(d);

      long[] gap =new long[N-1];
      for(int i=0;i<N-1;i++){
        gap[i]=d[i+1]-d[i];
      }
      long gcdAll=gap[0];
      for(int i=1;i<gap.length;i++){
        gcdAll = gcd(gcdAll, gap[i]);
      }

      long count=0;
      for(long g : gap){
        count += (g/gcdAll)-1;
      }
      System.out.println(count);
    } 
    public static long gcd(long a, long b){
      if(b==0) return a;
      return gcd(b,a%b);
    }
    
   
}


