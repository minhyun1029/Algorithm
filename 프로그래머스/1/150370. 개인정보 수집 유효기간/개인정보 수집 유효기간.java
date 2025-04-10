import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        Map<String, Integer> termMap = new HashMap<>();
        for(String term : terms){
            String[] parts = term.split(" ");
            termMap.put(parts[0],Integer.parseInt(parts[1]));
        }

        int todayDays = convertToday(today);

        int[] temp =new int[privacies.length];
        int count =0;

        for(int i=0;i<privacies.length;i++){
            String[] parts = privacies[i].split(" ");
            String date=parts[0];
            String termType = parts[1];

            int expireDay = convertToday(date)+ termMap.get(termType)*28;

            if(expireDay<=todayDays){
                temp[count++]=i+1;
            }
        }

        int[] answer = Arrays.copyOf(temp, count);
        return answer;
    }

    private int convertToday(String date){
        String[] parts =date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        return (year-2000)*12*28+(month-1)*28+day;
    }
}