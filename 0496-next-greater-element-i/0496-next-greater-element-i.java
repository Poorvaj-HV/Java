class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums2.length; i++) {
            hm.put(nums2[i], i);
        }

        List<Integer> ls = new ArrayList<>();
        for(int x : nums1) {
            int idx = hm.get(x);
            ls.add(getNextGretEle(nums2, idx, x));
        }

        int[] ans = new int[ls.size()];
        for(int i=0; i<ls.size(); i++) {
            ans[i] = ls.get(i);
        }

        return ans;
    }

    public int getNextGretEle(int[] nums2, int idx, int x) {
        for(int i=idx+1; i<nums2.length; i++) {
            if(nums2[i] > x) {
                return nums2[i];
            }
        }

        return -1;
    }
}