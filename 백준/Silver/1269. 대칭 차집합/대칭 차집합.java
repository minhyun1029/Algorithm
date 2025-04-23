import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();

        Set<Integer> set =new HashSet<>();
        
        for(int i=0;i<A;i++){
          int a = sc.nextInt();
          set.add(a);
        }
        
        int count=0;

        for(int i=0;i<B;i++){
          int b = sc.nextInt();
          if(set.contains(b)){
            count++;
          }
        }
        
        int x = A-count;
        int y = B-count;
        System.out.println(x+y);
    }
    
   
}


