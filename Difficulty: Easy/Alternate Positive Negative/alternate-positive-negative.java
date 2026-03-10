class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int i: arr) {
            if(i >= 0) {
                pos.add(i);
            } else {
                neg.add(i);
            }
        }
        
        int i=0, j=0, k=0;
        int idx = 0;
        
        while(i < pos.size() && j < neg.size()) {
            arr.set(idx++, pos.get(i++));
            arr.set(idx++, neg.get(j++));
        }
        
        while(i < pos.size()) {
            arr.set(idx++, pos.get(i++));
        }
        
        while(j < neg.size()) {
            arr.set(idx++, neg.get(j++));
        }
    }
}