class Solution {
  public int solution(String[] babbling) {
      int answer = 0;
      String[] patterns = {"aya", "ye", "woo", "ma"};
      
      for(String word : babbling) {
          String temp = word;
          
          
          if(temp.contains("ayaaya") || temp.contains("yeye") || 
             temp.contains("woowoo") || temp.contains("mama")) {
              continue;
          }
          
          
          for(String p : patterns) {
              temp = temp.replace(p, " ");
          }
          
          
          temp = temp.replace(" ", "");
          if(temp.isEmpty()) {
              answer++;
          }
      }
      
      return answer;
  }
}