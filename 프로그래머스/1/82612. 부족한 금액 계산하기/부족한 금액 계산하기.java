class Solution {
  public long solution(int price, int money, int count) {
      
    
      long totalCost = (long)price * count * (count + 1) / 2;
      long shortage = totalCost - money;
      
      return shortage > 0 ? shortage : 0;
  }
}