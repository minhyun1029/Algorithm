import java.util.*;
class Solution {
  public String solution(String X, String Y) {
      StringBuilder answer =new StringBuilder();

      int[] xCount =new int[10];
      int[] yCount =new int[10];

      for(String x: X.split("")){
        xCount[Integer.parseInt(x)]++;    
      }
      for(String y: Y.split("")){
        yCount[Integer.parseInt(y)]++;    
      }

      for(int i=9;i>=0;i--){
        while(xCount[i]>0 && yCount[i]>0){
          answer.append(i);
          xCount[i]--;
          yCount[i]--;
        }
      }

      if("".equals(answer.toString())){
        return "-1";
      }
      if("0".equals(answer.toString().substring(0,1))){
        return "0";
      }


      return answer.toString();
  }
}