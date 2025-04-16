import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] score = new int[num];
        for(int i=0;i<num;i++){
          score[i]=sc.nextInt();
        }
        int max = Arrays.stream(score).max().getAsInt();
        double[] newScore = new double[num];
        for(int i=0;i<num;i++){
          newScore[i]=(double)(score[i]*100)/max;
        }
        double sum=0;
        for(int i=0;i<num;i++){
          sum+=newScore[i];
        }
        System.out.println(sum/(double)num);
    }
}

