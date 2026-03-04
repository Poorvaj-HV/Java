class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> l = new ArrayList<>();

        for(Integer i: nums) {
            if(hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }

        for(Integer i: hm.keySet()) {
            if(hm.get(i) > (n/3)) {
                l.add(i);
            }
        }

        return l;
    }
}