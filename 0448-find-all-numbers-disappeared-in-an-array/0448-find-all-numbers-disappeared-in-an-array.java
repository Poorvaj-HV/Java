class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();

        for(int x: nums) {
            hm.add(x);
        }

        List<Integer> l = new ArrayList<>();
        for(int i=1; i<=nums.length; i++) {
            if(!hm.contains(i)) {
                l.add(i);
            }
        }

        return l;
    }
}