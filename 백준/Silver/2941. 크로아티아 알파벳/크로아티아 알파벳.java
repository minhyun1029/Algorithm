import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
      Scanner sc =new Scanner(System.in);
      String word = sc.nextLine();
      String[] correct ={"c=","c-","dz=","d-","lj","nj","s=","z="};

      int count=0;
      

      for(int i=0;i<word.length(); ){
        boolean found=false;
        for(String c:correct){
          if(word.startsWith(c,i)){
            count++;
            i+=c.length();
            found=true;
            break;
          }
        }
        if(!found){
          count++;
          i++;
        }
      }
      System.out.println(count);
      


      
    }
}

