import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] videoSplit = video_len.split(":");
        LocalTime videoLenTime = getTime(videoSplit);
        
        String[] posSplit = pos.split(":");
        LocalTime posTime = getTime(posSplit);
        
        String[] startSplit = op_start.split(":");
        LocalTime opStartTime = getTime(startSplit);
        
        String[] endSplit = op_end.split(":");
        LocalTime opEndTime = getTime(endSplit);
        
        for(String command: commands){
            switch(command){
                    case "next" -> {
                        posTime = next(posTime,opStartTime,opEndTime,videoLenTime);
                    }
                    case "prev" -> {
                        posTime = prev(posTime,opStartTime,opEndTime);
                    }
            }
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm:ss");        
        return posTime.format(formatter);
        }
        private LocalTime prev(LocalTime posTime, LocalTime opStartTime, LocalTime opEndTime) {
            LocalTime tenSecondsStart = LocalTime.of(0,0, 10);
            if (posTime.isBefore(tenSecondsStart)) {
                posTime = LocalTime.of(0,0, 0);
                if (!posTime.isBefore(opStartTime) && !posTime.isAfter(opEndTime)) {
                    posTime = opEndTime;
                }
            } else {
                posTime = posTime.minusSeconds(10);
                if (!posTime.isBefore(opStartTime) && !posTime.isAfter(opEndTime)) {
                    posTime = opEndTime;
                }
            }
            return posTime;
        }

        private LocalTime next(LocalTime posTime, LocalTime opStartTime, LocalTime opEndTime, LocalTime videoLenTime) {
            LocalTime tenSecondsEnd = videoLenTime.minusSeconds(10);
            if (posTime.isAfter(tenSecondsEnd)) {
                posTime = videoLenTime;
            } else if (!posTime.isBefore(opStartTime) && !posTime.isAfter(opEndTime)) {
                posTime = opEndTime;
                posTime = posTime.plusSeconds(10);
            } else {
                posTime = posTime.plusSeconds(10);
                if (!posTime.isBefore(opStartTime) && !posTime.isAfter(opEndTime)) {
                    posTime = opEndTime;
                }
            }
            return posTime;
        }


        private LocalTime getTime(String[] split){
            return LocalTime.of(0,Integer.parseInt(split[0]),Integer.parseInt(split[1]));
        }
}