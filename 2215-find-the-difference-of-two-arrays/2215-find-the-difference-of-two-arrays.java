class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for(int x: nums1) {
            hs1.add(x);
        }

        for(int x: nums2) {
            hs2.add(x);
        }

        List<Integer> l1 = new ArrayList<>();
        for(int x: nums1) {
            if(!hs2.contains(x) && !l1.contains(x)) {
                l1.add(x);
            }
        }
        ans.add(l1);

        List<Integer> l2 = new ArrayList<>();
        for(int x: nums2) {
            if(!hs1.contains(x) && !l2.contains(x)) {
                l2.add(x);
            }
        }
        ans.add(l2);

        return ans;
    }
}