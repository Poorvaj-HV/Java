class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x: nums) {
            if(hm.containsKey(x)) {
                hm.put(x, hm.get(x) + 1);
            } else {
                hm.put(x, 1);
            }
        }

        for(int i: nums) {
            if(i % 2 == 0 && hm.get(i) == 1) {
                return i;
            }
        }

        return -1;
    }
}