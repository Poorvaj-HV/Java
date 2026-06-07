class Solution {
    public boolean isSelfDividing(int n) {
        int x = n;
        while(n != 0) {
            int r = n % 10;
            if(r == 0) {
                return false;
            }
            
            if(x % r != 0) {
                return false;
            }
            
            n /= 10;
        }

        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls = new ArrayList<>();

        for(int i=left; i<=right; i++) {
            if(isSelfDividing(i)) {
                ls.add(i);
            }
        }

        return ls;
    }
}