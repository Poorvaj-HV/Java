class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return timeToSeconds(endTime) - timeToSeconds(startTime);
    }

    private int timeToSeconds(String time) {
        int hours = (time.charAt(0) - '0') * 10 + time.charAt(1) - '0';
        int minutes = (time.charAt(3) - '0') * 10 + time.charAt(4) - '0';
        int seconds = (time.charAt(6) - '0') * 10 + time.charAt(7) - '0';

        return hours * 3600 + minutes * 60 + seconds;
    }
}