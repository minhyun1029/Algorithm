import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        int[] arr=new int[a];
        

        for(int i=0;i<a;i++){
          arr[i]=sc.nextInt();
        }
        
        int small=arr[0];
        int big=arr[0];
        for(int i=0;i<a;i++){
          if(small>arr[i]){
            small=arr[i];
          }
          if(big<arr[i]){
            big=arr[i];
          }
        }
        System.out.println(small+" "+big);
    }
}
