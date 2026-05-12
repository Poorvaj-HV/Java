class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> lt = new ArrayList<>();

        for(int x: nums) {
            add(x, lt);
        }

        int ans[] = new int[lt.size()];
        for(int i=0; i<ans.length; i++) {
            ans[i] = lt.get(i);
        }

        return ans;
    }

    public void add(int x, List<Integer> lt) {
        if(x == 0) {
            return;
        }

        add(x / 10, lt);
        lt.add(x % 10);
        return;
    }
}