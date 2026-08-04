class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int x : nums) {
            min = (x < min) ? x : min;
            max = (x > max) ? x : max;
            hs.add(x);
        }

        List<Integer> missing = new ArrayList<>();

        for(int i=min; i<=max; i++) {
            if(!hs.contains(i)) {
                missing.add(i);
            }
        }

        return missing;
    }
}