class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> hs = new HashSet<>();
        int[] ans = new int[A.length];
        // ans[0] = 0;
        // hs.add(A[0]);
        // hs.add(B[0]);

        for(int i=0; i<A.length; i++) {
            hs.add(A[i]);
            int count = 0;
            for(int j=0; j<=i; j++) {
                if(hs.contains(B[j])) {
                    count++;
                }
            }
            ans[i] = count;
        }

        return ans;
    }
}