import java.util.*;

public class Main {
    public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      
      
      int N = sc.nextInt();
      for(int i=0;i<N;i++){
        long d=sc.nextLong();
        while(!sosu(d)){
          d++;
        }
        System.out.println(d);
      }
    

      
    } 
    
    public static boolean sosu(long d){
      if(d<2)return false;
      if(d==2)return true;
      if(d%2==0)return false;

      for(long i=3;i*i<=d;i+=2){
        if(d%i==0) return false;
      }
      return true;
    }
    
   
}


