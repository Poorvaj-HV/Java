class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();

        for(int x : nums) {
            if(hm.containsKey(x) && hm.get(x) == 2) {
                return false;                
            } else if(hm.containsKey(x)) {
                hm.put(x, hm.getOrDefault(x, 0) + 1);
            } else {
                hm.put(x, 1);
            }
        }

        return true;
    }
}