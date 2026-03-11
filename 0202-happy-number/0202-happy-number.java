class Solution {
    public boolean isHappy(int n) {
        if(n == 1) {
            return true;
        }

        HashSet<Integer> hs = new HashSet<>();

        while(n != 1) {
            int sum = 0;
            while(n != 0) {
                int r = n % 10;
                n = n / 10;

                sum += (r * r);
            }
            if(hs.contains(sum)) {
                return false;
            }
            hs.add(sum);
            n = sum;
        }

        return n == 1;
    }
}