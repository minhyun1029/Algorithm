import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
      Scanner sc =new Scanner(System.in);
      String[][] strArray = new String[5][15];
      for(int i=0;i<5;i++){
        String str =sc.nextLine();
        
        for(int j=0;j<str.length();j++){
          strArray[i][j]=String.valueOf(str.charAt(j));
        }
      }
      for(int j=0;j<15;j++){
        for(int i=0;i<5;i++){
          if(strArray[i][j]!=null){
            System.out.print(strArray[i][j]);
          }
        }
      }
    }
}

