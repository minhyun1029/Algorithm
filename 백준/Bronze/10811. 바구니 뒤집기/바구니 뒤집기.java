

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int[] arr=new int[a];

        for(int i=0;i<a;i++){
          arr[i]=i+1;
        }

        for(int i=0;i<b;i++){
          int c=sc.nextInt()-1;
          int d=sc.nextInt()-1;
          while(c<d){
            int tmp=arr[c];
            arr[c]=arr[d];
            arr[d]=tmp;
            c++;
            d--;
          }
        }
        for(int num:arr){
          System.out.print(num+" ");
        }

    }   
}

