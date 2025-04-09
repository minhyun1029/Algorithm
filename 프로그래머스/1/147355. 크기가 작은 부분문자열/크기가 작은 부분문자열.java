class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pl=p.length();
        long a = Long.parseLong(p);
        for(int i=0; i<=t.length()-pl;i++){
            String b = t.substring(i, i+pl);
            long num =Long.parseLong(b);
            if(num<=a){
                answer++;
            }
        }
        return answer;
        
    }
}