import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] arr =new int[a+1];
        for(int i=1;i<=a;i++){
          arr[i]=i;
        }
        int tmp=0;
        for(int i=1;i<=b;i++){
          int c=sc.nextInt();
          int d=sc.nextInt();
          tmp=arr[c];
          arr[c]=arr[d];
          arr[d]=tmp;
        }
        for(int i=1;i<=a;i++){
          System.out.print(arr[i]+" ");
        }
    }
}
