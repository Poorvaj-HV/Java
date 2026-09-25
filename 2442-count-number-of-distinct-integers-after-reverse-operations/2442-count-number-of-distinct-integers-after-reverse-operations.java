class Solution {
    public int countDistinctIntegers(int[] nums) {
        int rev[] = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            int x = nums[i];
            int reverse = 0;
            while(x != 0) {
                int r = x % 10;
                x /= 10;
                reverse = reverse * 10 + r;
            }
            rev[i] = reverse;
        }

        Set<Integer> hs = new HashSet<>();

        for(int x : nums) {
            hs.add(x);
        }

        for(int x : rev) {
            hs.add(x);
        }

        return hs.size();
    }
}