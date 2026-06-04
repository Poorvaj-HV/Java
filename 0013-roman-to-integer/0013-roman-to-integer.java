class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> hm = new HashMap<>(Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000));

        int total = 0;
        int n = s.length();
        for(int i=0; i<n-1; i++) {
            if(hm.get(s.charAt(i)) < hm.get(s.charAt(i+1))) {
                total -= hm.get(s.charAt(i));
            } else {
                total += hm.get(s.charAt(i));
            }
        }

        total += hm.get(s.charAt(n-1));

        return total;
    }
}