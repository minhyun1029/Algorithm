class Solution {
  public int solution(int[] numbers) {
      int answer = 0;
      int[] num = {0,1,2,3,4,5,6,7,8,9};
      for(int n:num){
        boolean no =false;
        for(int m:numbers){
          if(n==m){
            no =true;
            break;
          }
        }
        if(!no){
          answer+=n;
        }
      }
      return answer;
  }
}