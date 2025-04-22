import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        Set<String> set = new HashSet<>();

        int N=sc.nextInt();
        int M=sc.nextInt();

        String[] nstr = new String[N];
        String[] mstr = new String[M];

        for(int i=0;i<N;i++){
          nstr[i]=sc.next();
        }
        for(String str:nstr){
          set.add(str);
        }
        
        for(int i=0;i<M;i++){
          mstr[i]=sc.next();
        }
        int count=0;
        for(String str:mstr){
          if(set.contains(str)){
            count++;
          }
        }
        System.out.println(count);
        
    }
   
}
