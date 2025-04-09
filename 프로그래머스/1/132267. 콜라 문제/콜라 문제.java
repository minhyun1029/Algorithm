class Solution {
  public int solution(int a, int b, int n) {
      int answer = 0;
      int num=0;
      int num1=0;
      while(n>=a){
        num=(n/a)*b;
        num1=n%a;
        n=num+num1;
        answer+=num;
      }
      return answer;
  }
}