

class Solution {
  public int[] solution(int[] lottos, int[] win_nums) {
      int[] answer = new int[2];
      
      int loss=0;
      int count=0;
      for(int i=0;i<6;i++){
        if(lottos[i]==0){
          loss++;
        }
      }
      for(int i=0;i<6;i++){
        for(int j=0;j<6;j++){
          if(lottos[i]==win_nums[j]){
            count++;
          }
        }
      }
      int min=count;
      int max=count+loss;
      answer[0] = getRank(max); 
      answer[1] = getRank(min); 

      return answer;
  }

  private int getRank(int correct) {
      if (correct >= 2) {
          return 7 - correct;
      }
      return 6;
  }
}