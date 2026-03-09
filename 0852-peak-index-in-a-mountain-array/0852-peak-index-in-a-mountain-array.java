class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak = -1;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                peak = i;
            }
        }

        return peak;
    }
}