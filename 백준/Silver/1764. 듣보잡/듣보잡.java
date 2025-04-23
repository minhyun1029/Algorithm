import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        Set<String> set =new HashSet<>();
        
        for(int i=0;i<N;i++){
          set.add(sc.next());
        }
        
        int count=0;
        int a=0;
        
        List<String> list = new ArrayList<>();
        
        
        for(int i=0;i<M;i++){
          String bodo = sc.next();
          if(set.contains(bodo)){
            list.add(bodo);
          }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(String l : list){
          System.out.println(l);
        }
        
    }
    
   
}


