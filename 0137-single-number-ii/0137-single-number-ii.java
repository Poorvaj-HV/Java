class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(Integer i: nums) {
            if(hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }

        int ans = 0;
        for(int i : hm.keySet()) {
            if(hm.get(i) == 1) {
                ans = i;
            }
        }

        return ans;
    }
}