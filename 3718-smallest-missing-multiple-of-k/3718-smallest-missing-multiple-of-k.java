class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> hs = new HashSet<>();
        for(int x : nums) {
            hs.add(x);
        }

        int n = k;

        while(true) {
            if(!hs.contains(n)) {
                return n;
            }
            n += k;
        }
    }
}