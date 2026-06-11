class Solution {
    public int calPoints(String[] operations) {
        List<Integer> ls = new ArrayList<>();
        for(String s : operations) {
            if(s.equals("D")) {
                ls.add(ls.get(ls.size()-1) * 2);
            } else if(s.equals("C")) {
                ls.remove(ls.size()-1);
            } else if(s.equals("+")) {
                ls.add(ls.get(ls.size()-1) + ls.get(ls.size()-2));
            } else {
                ls.add(Integer.valueOf(s));
            }
        }

        int sum = 0;
        for(int i=0; i<ls.size(); i++) {
            sum += ls.get(i);
        }

        return sum;
    }
}