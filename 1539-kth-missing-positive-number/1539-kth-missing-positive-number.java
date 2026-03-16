class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> hs = new HashSet<>();

        for(int x: arr) {
            hs.add(x);
        }

        int i = 1;
        while(true) {
            if(!hs.contains(i)) {
                k--;
            }

            if(k == 0) {
                break;
            }
            i++;
        }

        return i;
    }
}