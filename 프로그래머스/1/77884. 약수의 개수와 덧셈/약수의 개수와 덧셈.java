class Solution {
  public int solution(int left, int right) {
      int answer = 0;

      for(int i=left;i<=right;i++){
        int count = countDivisors(i);

        if(count%2==0){
          answer+=i;
        }else{
          answer-=i;
        }
      }

      return answer;
  }
  private int countDivisors(int num){
    if(num==1){
      return 1;
    }
    int count=0;
    for(int i=1;i<=Math.sqrt(num);i++){
      if(num%i==0){
        if(i*i==num){
          count++;
        }else{
          count+=2;
        }
      }
    }
    return count;
  }
}