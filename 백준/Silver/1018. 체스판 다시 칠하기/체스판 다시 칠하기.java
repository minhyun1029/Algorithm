

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M =sc.nextInt();
        int N =sc.nextInt();
        sc.nextLine();
        
        char[][] chess = new char[M][N];

        for(int i=0;i<M;i++){
          String line = sc.nextLine();
          for(int j=0; j<N; j++){
            chess[i][j]=line.charAt(j);
          }
        }
        int min = Integer.MAX_VALUE;

        for(int i=0;i<=M-8;i++){
          for(int j=0;j<=N-8;j++){
            min=Math.min(min,repair(chess, i, j));
          }
        }
        System.out.println(min);
    }

    public static int repair(char[][] chess, int x,int y){
      int repairW=0;
      int repairB=0;

      for(int i=x;i<x+8;i++){
        for(int j=y;j<y+8;j++){
          char expectedW=((i+j)%2==0)?'W':'B';
          char expectedB=((i+j)%2==0)?'B':'W';

          if(chess[i][j]!=expectedW)repairW++;
          if(chess[i][j]!=expectedB)repairB++;
        }
      }
      return Math.min(repairW, repairB);
    }    
}
