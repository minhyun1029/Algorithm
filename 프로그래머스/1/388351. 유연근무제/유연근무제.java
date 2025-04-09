class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i=0; i<schedules.length; i++){
            int[] timelog = timelogs[i];
            int schedule = getSchedule(schedules[i]);
            
            int day = startday;
            
            for(int t: timelog){
                if(day%7==0 || day%7==6){
                    day++;
                    continue;
                }
                if(t>schedule){
                    break;
                }
                day++;
            }
            if(day==startday+7){
                answer++;
            }
        }
        
        return answer;
    }
    private int getSchedule(int schedule){
        schedule += 10;
        if (schedule % 100 >= 60){
            int h = (schedule / 100) + 1;
            int m = (schedule % 100) - 60;
            schedule = h*100 + m ;
        }
        return schedule;
    }
}