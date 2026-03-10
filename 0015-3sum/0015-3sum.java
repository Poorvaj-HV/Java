class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> hs = new HashSet<>();

        for(int i=0; i<n; i++) {
            int j = i + 1;
            int k = n - 1;

            while(j < k) {
                if(nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    hs.add(l);
                    j++;
                } else if(nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return new ArrayList<>(hs);
    }
}