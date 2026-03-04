class Solution {
    public void sort012(int[] arr) {
        int countZero = 0, countOne = 0, countTwo = 0;
        
        for(int i: arr) {
            if(i == 0) {
                countZero++;
            } else if(i == 1) {
                countOne++;
            } else {
                countTwo++;
            }
        }
        
        int idx = 0;
        
        while(countZero-- > 0) {
            arr[idx++] = 0;
        }
        
        while(countOne-- > 0) {
            arr[idx++] = 1;
        }
        
        while(countTwo-- > 0) {
            arr[idx++] = 2;
        }
    }
}