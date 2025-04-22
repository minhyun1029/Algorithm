import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        
        int[] original = new int[N];
        int[] newone = new int[N];

        for(int i=0;i<N;i++){
          original[i]=sc.nextInt();
          newone[i]=original[i];
        }

        Arrays.sort(newone);
        Map<Integer, Integer> map = new HashMap<>();

        int rank = 0;
        for(int i=0;i<N;i++){
          if(!map.containsKey(newone[i])){
            map.put(newone[i],rank++);
          }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
          sb.append(map.get(original[i])).append(" ");
        }

        System.out.println(sb);

        
    }
   
}
