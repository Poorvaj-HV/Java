class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();
        Set<Integer> hs3 = new HashSet<>();

        for(int x : nums1) {
            hs1.add(x);
        }

        for(int x : nums2) {
            hs2.add(x);
        }

        for(int x : nums3) {
            hs3.add(x);
        }

        Set<Integer> hs = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int x : nums1) {
            if(hs2.contains(x) || hs3.contains(x)) {
                hs.add(x);
            }
        }

        for(int x : nums2) {
            if(hs1.contains(x) || hs3.contains(x)) {
                hs.add(x);
            }
        }

        for(int x : hs) {
            res.add(x);
        }

        return res;
    }
}