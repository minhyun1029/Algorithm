import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
       
        int N = sc.nextInt();
        int M = sc.nextInt();
       
        String[] str = new String[N+1];

        for(int i=1;i<=N;i++){
          String name = sc.next();
          map.put(name, i);
          str[i]=name;
        }

        for(int i=0;i<M;i++){
          String str2 =sc.next();
          
          if(isNumber(str2)){
            int num=Integer.parseInt(str2);
            System.out.println(str[num]);
          }else{
            System.out.println(map.get(str2));
          }
        }
        
    }
    public static boolean isNumber(String str){
      return str.matches("\\d+");
    }
   
}


