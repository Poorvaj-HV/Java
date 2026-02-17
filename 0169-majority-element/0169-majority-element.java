class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int value = nums[0];

        for(Integer i: nums) {
            if(hm.containsKey(i)) {
                int count = hm.get(i);
                count++;
                hm.put(i, count);
                // max = Math.max(max, hm.get(i));
                // value = (hm.get(i) > max) ? i : max;
                if(hm.get(i) > max) {
                    max = hm.get(i);
                    value = i;
                }
            } else {
                hm.put(i, 1);
            }
        }

        return value;
    }
}