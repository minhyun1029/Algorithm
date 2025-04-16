import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
      Scanner sc =new Scanner(System.in);
      String word = sc.nextLine().toUpperCase();

      int[] count=new int[26];

      for(int i=0;i<word.length();i++){
        char c = word.charAt(i);
        count[c-'A']++;
      }

      int maxCount=-1;
      char maxChar='?';

      for(int i=0;i<count.length;i++){
        if(count[i]>maxCount){
          maxCount=count[i];
          maxChar=(char)(i+'A');
        }
      }
      boolean isDuplicate = false;
      for(int i=0;i<count.length;i++){
        if(count[i]==maxCount&&(char)(i+'A')!=maxChar){
          isDuplicate=true;
          break;
        }
      }
      System.out.println(isDuplicate ? "?":maxChar);
      
    }
}

