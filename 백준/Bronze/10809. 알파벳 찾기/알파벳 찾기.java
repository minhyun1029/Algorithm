import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        String[] strArr=new String[str.length()];
        int[] alphabet =new int[26];
          
        for(int i=0;i<26;i++){
          alphabet[i]=-1;
        }

        for(int i=0;i<str.length();i++){
          char c=str.charAt(i);
          int index = c-'a';
          if(alphabet[index]==-1){
            alphabet[index]=i;
          }

        }

        for(int i=0;i<26;i++){
          System.out.print(alphabet[i]+" ");
        }
    }
        
        
    
}

