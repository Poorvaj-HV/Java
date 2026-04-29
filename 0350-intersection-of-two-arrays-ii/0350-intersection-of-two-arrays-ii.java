class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm1 = new HashMap<>();
        Map<Integer, Integer> hm2 = new HashMap<>();
        
        for(int x: nums1) {
            hm1.put(x, hm1.getOrDefault(x, 0) + 1);
        }

        for(int x: nums2) {
            hm2.put(x, hm2.getOrDefault(x, 0) + 1);
        }

        List<Integer> l = new ArrayList<>();
        for(int x: hm1.keySet()) {
            if(hm2.containsKey(x)) {
                int f = (hm1.get(x) <= hm2.get(x) ? hm1.get(x): hm2.get(x));

                while(f > 0) {
                    l.add(x);
                    f--;
                }
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