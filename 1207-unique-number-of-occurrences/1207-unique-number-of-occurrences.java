class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();

        for(Integer i: arr) {
            if(hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }

        for(Integer i: hm.values()){
            if(hs.contains(i)) {
                return false;
            } else {
                hs.add(i);
            }
        }

        return true;
    }
}