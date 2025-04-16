import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
      Scanner sc =new Scanner(System.in);
      String c="";
      String str=sc.nextLine();
      String[] strArr=str.split("");
      for(int i=strArr.length-1;i>=0;i--){
         c += strArr[i];
      }
      if(str.equals(c)){
        System.out.println(1);
      }else{
        System.out.println(0);
      }


    }
    
}

