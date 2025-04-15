import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] arr =new int[a];
        for(int i=0;i<a;i++){
          arr[i]=0;
        }
        for(int i=0;i<b;i++){
          int one = sc.nextInt();
          int two = sc.nextInt();
          int three = sc.nextInt();

          for(int j=one-1;j<=two-1;j++){
            arr[j]=three;
          }
        
        }
        
        for(int i=0;i<a;i++){
          System.out.print(arr[i]+" ");
        }

    }
}
