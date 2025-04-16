import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String[] strArr =new String[num];
        for(int i=0;i<num;i++){
          strArr[i] = sc.nextLine();
        }
        for(int i=0;i<num;i++){
          System.out.print(strArr[i].charAt(0));
          System.out.println(strArr[i].charAt(strArr[i].length()-1));
        }
        
    }
}

