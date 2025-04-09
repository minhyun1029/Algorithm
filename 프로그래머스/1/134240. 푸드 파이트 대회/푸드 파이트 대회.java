class Solution {
  public String solution(int[] food) {
      StringBuilder leftPart = new StringBuilder();

      for(int i=0; i<food.length;i++){
        int count = food[i]/2;
        leftPart.append(String.valueOf(i).repeat(count));
      }

      String rightPart =new StringBuilder(leftPart).reverse().toString();

      return leftPart.toString() + "0" + rightPart;
  }
}