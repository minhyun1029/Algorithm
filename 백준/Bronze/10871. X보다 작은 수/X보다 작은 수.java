import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr=new int[a];
        

        for(int i=0;i<a;i++){
          arr[i]=sc.nextInt();
        }
        
        
        for(int i=0;i<a;i++){
          if(arr[i]<b){
            System.out.print(arr[i]+" ");    
          }
        }
        
    }
}
