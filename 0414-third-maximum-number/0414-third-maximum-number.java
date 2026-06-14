class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int x : nums) {
            hs.add(x);
        }

        int[] arr = new int[hs.size()];
        int i = 0;
        for(int x : hs) {
            arr[i++] = x;
        }

        Arrays.sort(arr);

        return arr.length >= 3 ? arr[arr.length-3] : arr[arr.length-1];
    }
}