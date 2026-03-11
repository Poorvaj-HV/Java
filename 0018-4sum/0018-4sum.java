class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hs = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                int k = j+1;
                int l = nums.length-1;

                while(k < l) {
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum == target) {
                        List<Integer> al = new ArrayList<>();
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[k]);
                        al.add(nums[l]);
                        hs.add(al);
                        k++;
                    } else if(sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return new ArrayList<>(hs);
    }
}