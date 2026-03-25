class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        if(l == 1 && flowerbed[0] == 0 && n == 1) {
            return true;
        }

        if(l == 1 && flowerbed[0] == 1 && n > 0) {
            return false;
        }

        if(l == 1 && n >= 0) {
            return true;
        }

        for(int i=0; i<l; i++) {
            if(i == 0 && flowerbed[0] == 0 && flowerbed[1] == 0 && n > 0) {
                flowerbed[0] = 1;
                n -= 1;
            } else if(i == l-1 && flowerbed[l-1] == 0 && flowerbed[l-2] == 0 && n > 0) {
                flowerbed[l-1] = 1;
                n -= 1;
            } else if(i - 1 >= 0 && i + 1 < l && flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0 && n > 0) {
                flowerbed[i] = 1;
                n -= 1;
            }
        }

        return n == 0;
    }
}