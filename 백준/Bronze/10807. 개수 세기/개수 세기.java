import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr=new int[a];
        int count=0;

        for(int i=0;i<a;i++){
          arr[i]=sc.nextInt();
        }

        int num=sc.nextInt();
        for(int i=0;i<a;i++){
          if(arr[i]==num){
            count++;
          }
        }
        System.out.println(count);
    }
}
