import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int N=sc.nextInt();
        int[] scards = new int[N];
        for(int i=0;i<N;i++){
          scards[i]=sc.nextInt();
        }
        for(int num:scards){
          set.add(num);
        }
        int M =sc.nextInt();
        int[] rcards =new int[M];
        for(int i=0;i<M;i++){
          rcards[i]=sc.nextInt();
        }
        for(int num:rcards){
          if(set.contains(num)){
            System.out.print(1+" ");
          }else{
            System.out.print(0+" ");
          }
        }

        
    }
   
}
