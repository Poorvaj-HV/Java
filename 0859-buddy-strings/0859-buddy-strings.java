class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }

        if(s.equals(goal)) {
            HashMap<Character, Integer> hm = new HashMap<>();
            for(char x: s.toCharArray()) {
                hm.put(x, hm.getOrDefault(x, 0) + 1);
                if(hm.get(x) > 1) {
                    return true;
                }
            }

            return false;
        }

        List<Integer> l = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != goal.charAt(i)) {
                l.add(i);
            }
        }

        if(l.size() != 2) {
            return false;
        }

        int ft = l.get(0);
        int sd = l.get(1);

        return s.charAt(ft) == goal.charAt(sd) && s.charAt(sd) == goal.charAt(ft);
    }
}