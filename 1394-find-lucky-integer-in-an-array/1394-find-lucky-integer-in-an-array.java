class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int lucky = -1;

        for(int x: arr) {
            if(hm.containsKey(x)) {
                hm.put(x, hm.get(x) + 1);
            } else {
                hm.put(x, 1);
            }
        }

        for(int x: hm.keySet()) {
            if(x == hm.get(x)) {
                lucky = Math.max(lucky, x);
            }
        }

        return lucky;
    }
}