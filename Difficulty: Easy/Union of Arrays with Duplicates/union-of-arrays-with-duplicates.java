class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i: a) {
            hs.add(i);
        }
        
        for(int i: b) {
            hs.add(i);
        }
        
        for(int i: hs) {
            al.add(i);
        }
        
        return al;
    }
}