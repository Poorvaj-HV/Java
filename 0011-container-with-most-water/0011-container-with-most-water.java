class Solution {
    public static int maxArea(int[] height) {
        int n = height.length;
        int maxC = Integer.MIN_VALUE;
        // for(int i=0; i<n; i++) {
        //     for(int j=i+1; j<n; j++) {
        //         int mintower = Math.min(height[i], height[j]);
        //         int w = j - i;
        //         int currC = mintower * w;

        //         maxC = Math.max(maxC, currC);
        //     }
        // }

        int leftP = 0;
        int rightP = n-1;
        for(int i=0; i<n; i++) {
            int minT = Math.min(height[leftP], height[rightP]);
            int w = rightP - leftP;
            int currC = minT * w;
            maxC = Math.max(maxC, currC);

            if(height[leftP] <= height[rightP]) {
                leftP++;
            } else {
                rightP--;
            }
        }

        return maxC;
    }

    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}