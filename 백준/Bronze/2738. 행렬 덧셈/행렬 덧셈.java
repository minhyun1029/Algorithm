import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
      Scanner sc =new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[][] result1 = new int[N][M];
      int[][] result2 = new int[N][M];
      int[][] result3 = new int[N][M];
      
      for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
          result1[i][j]=sc.nextInt();
        }
      } 
      for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
          result2[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
          result3[i][j]=result1[i][j]+result2[i][j];
        }
      }
      for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
          System.out.print(result3[i][j]+" ");
        }
        System.out.println();
      }
    }

    
    

}

