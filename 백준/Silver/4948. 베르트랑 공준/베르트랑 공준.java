import java.util.*;

public class Main {
    public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      
      while(true){

        int n =sc.nextInt();
        if(n==0) break;
        int count=0;
        for(int i=n+1;i<=2*n;i++){
          if(sosu(i)){
            count++;
          }
          
        }
        System.out.println(count);
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


