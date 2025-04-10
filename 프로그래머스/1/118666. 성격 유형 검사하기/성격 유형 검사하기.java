import java.util.HashMap;
import java.util.Map;

class Solution {
  public String solution(String[] survey, int[] choices) {
      Map<Character, Integer>scoreMap=new HashMap<>();

      scoreMap.put('R', 0);
      scoreMap.put('T', 0);
      scoreMap.put('C', 0);
      scoreMap.put('F', 0);
      scoreMap.put('J', 0);
      scoreMap.put('M', 0);
      scoreMap.put('A', 0);
      scoreMap.put('N', 0);

      for(int i=0;i<survey.length;i++){
        char disagree = survey[i].charAt(0);  
        char agree = survey[i].charAt(1);
        int choice = choices[i];
        
        if(choice<4){
          scoreMap.put(disagree, scoreMap.get(disagree)+(4-choice));
        }else if(choice>4){
          scoreMap.put(agree, scoreMap.get(agree)+(choice-4));
        }
      }
      StringBuilder answer = new StringBuilder();

      answer.append(scoreMap.get('R')>=scoreMap.get('T')?'R':'T');
      answer.append(scoreMap.get('C')>=scoreMap.get('F')?'C':'F');
      answer.append(scoreMap.get('J')>=scoreMap.get('M')?'J':'M');
      answer.append(scoreMap.get('A')>=scoreMap.get('N')?'A':'N');
      
      return answer.toString();
  }
}