import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
      Scanner sc =new Scanner(System.in);
      int num = sc.nextInt();
      int answer=0;

      for(int i=0;i<num;i++){
        String word = sc.next();
        if(isWord(word)){
          answer++;
        }
      }



      System.out.println(answer);

    }
    public static boolean isWord(String word){
      boolean[] used = new boolean[26];
      char c =0;
      
      for(int i=0;i<word.length();i++){
        char current = word.charAt(i);

        if(current!=c){
          if(used[current-'a']){
            return false;
          }
          used[current-'a']=true;
          c=current;
        }
      }
      return true;
    }
    

}

