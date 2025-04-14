class Solution {
  public int solution(int n) {
      int answer = 0;
      StringBuilder a = new StringBuilder();
      while(n>0){
        a.append(n%3);
        n/=3;
      }

      for(int i=0;i<a.length();i++){
        int b = a.charAt(i)-'0';
        answer+=b*Math.pow(3, a.length()-1-i);
      }

      return answer;
  }
}