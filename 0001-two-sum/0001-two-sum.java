class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        int i=0;
        for(Integer x: nums) {
            if(hm.containsKey(target - x)) {
                return new int[]{hm.get(target-x), i};
            } else {
                hm.put(x, i);
            }
            i++;
        }

        return nums;
    }
}