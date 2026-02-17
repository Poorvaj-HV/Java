class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();

        for(Integer i: nums) {
            if(hs.contains(i)){
                return true;
            } else {
                hs.add(i);
            }
        }

        return false;
    }
}