import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();
        
        int totalTime=toTime(word);
        System.out.println(totalTime);
        
        
    }
    private static int toTime(String word){
      int totalTime=0;
      for(int i=0;i<word.length();i++){
        char c = word.charAt(i);
        int time =toNum(c);
        totalTime+=time;
      }
      return totalTime;
    }
    private static int toNum(char c){
      if(c>='A'&&c<='C'){
        return 3;
      }else if(c>='D'&&c<='F'){
        return 4;
      }else if(c>='G'&&c<='I'){
        return 5;
      }else if(c>='J'&&c<='L'){
        return 6;
      }else if(c>='M'&&c<='O'){
        return 7;
      }else if(c>='P'&&c<='S'){
        return 8;
      }else if(c>='T'&&c<='V'){
        return 9;
      }else if(c>='W'&&c<='Z'){
        return 10;
      }else{
        return 0;
      }
    }
    
        
        
    
}

