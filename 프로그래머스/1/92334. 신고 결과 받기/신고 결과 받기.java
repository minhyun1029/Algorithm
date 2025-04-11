import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> reportedCount = new HashMap<>();
        Map<String, Set<String>> reporterMap = new HashMap<>();

        for (String id : id_list) {
            reportedCount.put(id, 0);
            reporterMap.put(id, new HashSet<>());
        }

        for (String r : report) {  
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];

            if (reporterMap.get(reporter).add(reported)) {
                reportedCount.put(reported, reportedCount.get(reported) + 1);
            }
        }

        Set<String> bannedUsers = new HashSet<>();
        for (Map.Entry<String, Integer> entry : reportedCount.entrySet()) {
            if (entry.getValue() >= k) {
                bannedUsers.add(entry.getKey());
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            Set<String> reportedUsers = reporterMap.get(user);
            int mailCount = 0;

            for (String reportedUser : reportedUsers) {
                if (bannedUsers.contains(reportedUser)) {
                    mailCount++;
                }
            }
            answer[i] = mailCount;
        }

        return answer;
    }
}