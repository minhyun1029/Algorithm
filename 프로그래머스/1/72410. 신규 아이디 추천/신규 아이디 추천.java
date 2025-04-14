class Solution {
  public String solution(String new_id) {
      // 1단계: 대문자를 소문자로 치환
      String answer = new_id.toLowerCase();
      
      // 2단계: 허용된 문자만 남기기
      answer = answer.replaceAll("[^a-z0-9\\-_.]", "");
      
      // 3단계: 연속된 마침표를 하나로 치환
      answer = answer.replaceAll("\\.{2,}", ".");
      
      // 4단계: 처음이나 끝의 마침표 제거
      answer = answer.replaceAll("^\\.|\\.$", "");
      
      // 5단계: 빈 문자열일 경우 "a" 대입
      if (answer.isEmpty()) {
          answer = "a";
      }
      
      // 6단계: 길이 16자 이상이면 15자로 제한 + 끝 마침표 제거
      if (answer.length() >= 16) {
          answer = answer.substring(0, 15);
          answer = answer.replaceAll("\\.$", "");
      }
      
      // 7단계: 길이 2자 이하일 경우 마지막 문자 반복
      while (answer.length() < 3) {
          answer += answer.charAt(answer.length() - 1);
      }
      
      return answer;
  }
}