class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int i = 0;
        for(int x: nums) {
            if(hm.containsKey(x) && (Math.abs(hm.get(x) - i)) <= k) {
                return true;
            } else {
                hm.put(x, i);
            }
            i++;
        }

        return false;
    }
}