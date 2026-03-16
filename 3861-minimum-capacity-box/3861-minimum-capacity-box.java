class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int ans = -1;
        int diff = Integer.MAX_VALUE;

        for(int i=0; i<capacity.length; i++) {
            if(capacity[i] == itemSize) {
                return i;
            } else if(capacity[i] > itemSize) {
                if(capacity[i] - itemSize < diff) {
                    diff = capacity[i] - itemSize;
                    ans = i;
                }
            }
        }

        return ans;
    }
}