import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        


        for(int i=0;i<num;i++){
          int repeat = sc.nextInt();
          String test = sc.next();
          StringBuilder result = new StringBuilder();

          for(int j=0;j<test.length();j++){
            char c = test.charAt(j);
            for(int k=0;k<repeat;k++){
              result.append(c);
              
            }
            
          }
          System.out.println(result.toString());
        }
        
        
    }
        
        
    
}

