class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> al = new ArrayList<>();
        
        int s = Integer.MAX_VALUE;
        int l = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++) {
            s = Math.min(s, arr[i]);
            l = Math.max(l, arr[i]);
        }
        
        al.add(s);
        al.add(l);
        
        return al;
    }
}
