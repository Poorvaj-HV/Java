class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int result[] = new int[2];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                int val = grid[i][j];
                if(hm.containsKey(val)) {
                    int count = hm.get(val);
                    count++;
                    hm.put(val, count);
                    result[0] = val;
                } else {
                    hm.put(val, 1);
                }
            }
        }

        for(int i=0; i<r*r; i++) {
            if(!hm.containsKey(i+1)) {
                result[1] = i+1;
            }
        }

        return result;
    }
}