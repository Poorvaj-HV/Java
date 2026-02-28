class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;

        for(int num: nums) {
            if(num == 0) {
                countZero++;
            } else if(num == 1) {
                countOne++;
            } else {
                countTwo++;
            }
        }

        int idx = 0;
        while(countZero-- > 0) {
            nums[idx++] = 0;
        }

        while(countOne-- > 0) {
            nums[idx++] = 1;
        }

        while(countTwo-- > 0) {
            nums[idx++] = 2;
        }
    }
}
