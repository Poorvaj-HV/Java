class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {

        int hours = (startTime.charAt(0) - '0') * 10 + startTime.charAt(1) - '0';
        int minutes = (startTime.charAt(3) - '0') * 10 + startTime.charAt(4) - '0';
        int seconds = (startTime.charAt(6) - '0') * 10 + startTime.charAt(7) - '0';

        int sTseconds = hours * 3600 + minutes * 60 + seconds;

        hours = (endTime.charAt(0) - '0') * 10 + endTime.charAt(1) - '0';
        minutes = (endTime.charAt(3) - '0') * 10 + endTime.charAt(4) - '0';
        seconds = (endTime.charAt(6) - '0') * 10 + endTime.charAt(7) - '0';

        int eTseconds = hours * 3600 + minutes * 60 + seconds;

        return eTseconds - sTseconds;
    }
}