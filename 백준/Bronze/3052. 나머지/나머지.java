import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> remainderSet = new HashSet<>();

        for(int i=0;i<10;i++){
          int num=sc.nextInt();
          remainderSet.add(num%42);
        }
        System.out.println(remainderSet.size());
      }
}