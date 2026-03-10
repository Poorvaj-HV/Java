class Solution {
    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int result = arr[n-1] - arr[0];
        
        for(int i=1; i<n; i++) {
            //height cannot be negative
            if(arr[i] - k < 0) {
                continue;
            }
            
            int min = Math.min(arr[0] + k, arr[i] - k);
            int max = Math.max(arr[i-1] + k, arr[n-1] - k);
            
            result = Math.min(result, max-min);
        }
        
        return result;
    }
}
