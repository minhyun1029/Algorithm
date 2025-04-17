import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
      Scanner sc =new Scanner(System.in);
      int num=sc.nextInt();
      boolean[][] paper =new boolean[100][100]; 
      int width=0;
      for(int i=0;i<num;i++){
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int j=x;j<x+10;j++){
          for(int k=y;k<y+10;k++){
            if(!paper[j][k]){
              paper[j][k]=true;
              width++;
            }
          }

        }
      }
      System.out.println(width);
    }
}

