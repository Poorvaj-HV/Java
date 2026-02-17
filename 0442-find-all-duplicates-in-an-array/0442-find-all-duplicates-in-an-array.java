class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        for(Integer i: nums) {
            if(hs.contains(i)) {
                l.add(i);
            } else {
                hs.add(i);
            }
        }

        return l;
    }
}