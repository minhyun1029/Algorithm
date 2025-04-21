import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String s = String.valueOf(num);
        String[] ns = s.split("");
        int[] nn = new int[ns.length];
        for(int i=0;i<ns.length;i++){
          nn[i]=Integer.parseInt(ns[i]);
        }
        Arrays.sort(nn);
        for(int i=nn.length-1;i>=0;i--){
          System.out.print(nn[i]);
        }
    }
   
}
