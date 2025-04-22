import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<N;i++){
          int num=sc.nextInt();
          map.put(num,map.getOrDefault(num,0)+1);
        }

        int M =sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<M;i++){
          int target =sc.nextInt();
          sb.append(map.getOrDefault(target, 0)).append(" ");
        }

        System.out.println(sb.toString());
       
        
    }
    
   
}


