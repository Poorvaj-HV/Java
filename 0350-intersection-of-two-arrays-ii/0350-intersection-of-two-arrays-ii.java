class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int x: nums1) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        List<Integer> l = new ArrayList<>();
        for(int x: nums2) {
            if(hm.containsKey(x) && hm.get(x) > 0) {
                l.add(x);
                hm.put(x, hm.get(x) - 1);
            }
        }

        int[] ans = new int[l.size()];
        int i = 0;
        for(int x: l) {
            ans[i++] = x;
        }

        return ans;
    }
}