import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        
        Set<String> set = new HashSet<>();
        for(int i=0;i<N;i++){
          set.add(sc.nextLine());
        }

        List<String> list = new ArrayList<>(set);

        list.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

        for(String word:list){
          System.out.println(word);
        }
    }
   
}
