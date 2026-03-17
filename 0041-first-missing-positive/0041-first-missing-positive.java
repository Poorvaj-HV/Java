class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int x: nums) {
            hs.add(x);
        }

        int i = 1;
        while(true) {
            if(!hs.contains(i)) {
                return i;
            }
            i++;
        }
    }
}