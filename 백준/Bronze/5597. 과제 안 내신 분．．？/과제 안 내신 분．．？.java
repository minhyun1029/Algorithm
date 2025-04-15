import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[30];
        int[] arr1=new int[28];
        for(int i=0;i<30;i++){
          arr[i]=i+1;
        }
        for(int i=0;i<28;i++){
          arr1[i]=sc.nextInt();
        }
        Set<Integer> set2=new HashSet<>();
        for(int num:arr1){
          set2.add(num);
        }
        for(int num:arr){
          if(!set2.contains(num)){
            System.out.println(num+" ");
          }
        }
    
      }
}
