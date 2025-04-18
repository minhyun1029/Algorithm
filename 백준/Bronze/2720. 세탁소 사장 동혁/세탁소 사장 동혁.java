import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
      Scanner sc =new Scanner(System.in);
      int T =sc.nextInt();

      int[][] result = new int[T][4];
      for(int i=0;i<T;i++){
        int change =sc.nextInt();
        int q = change/25;
        int d = (change%25)/10;
        int n = ((change%25)%10)/5;
        int p = (((change%25)%10)%5)/1;
        result[i][0]=q;
        result[i][1]=d;
        result[i][2]=n;
        result[i][3]=p;
      }
      for(int i=0;i<T;i++){
        for(int j=0;j<4;j++){
          System.out.print(result[i][j]+" ");
        }
        System.out.println();
      }




    }
}

