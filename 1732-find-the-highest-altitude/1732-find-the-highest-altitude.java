class Solution {
    public int largestAltitude(int[] gain) {
        int peak = 0;
        int[] preArr = new int[gain.length + 1];
        preArr[0] = 0;

        int i = 1;
        for(int x: gain) {
            preArr[i] = preArr[i-1] + x;
            peak = Math.max(peak, preArr[i]);
            i++;
        }

        return peak;
    }
}