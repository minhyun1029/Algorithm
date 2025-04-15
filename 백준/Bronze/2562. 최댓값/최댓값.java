import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int[] arr=new int[9];
        

        for(int i=0;i<9;i++){
          arr[i]=sc.nextInt();
          
        }
        
        int count=1;
        int big=arr[0];
        for(int i=0;i<9;i++){
          
          if(big<arr[i]){
            big=arr[i];
            count=i+1;
          }
        }
        System.out.println(big);
        System.out.println(count);
    }
}
