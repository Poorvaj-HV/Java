class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(Integer i: nums) {
            if(hm.containsKey(i)) {
                return i;
            } else {
                hm.put(i, 1);
            }
        }
        
        return 0;
    }
}