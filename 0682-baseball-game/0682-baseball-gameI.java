class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(String s : operations) {
            if(s.equals("D")) {
                st.push(st.peek() * 2);
            } else if(s.equals("C")) {
                st.pop();
            } else if(s.equals("+")) {
                int top = st.pop();
                int newVal = top + st.peek();
                st.push(top);
                st.push(newVal);
            } else {
                st.push(Integer.valueOf(s));
            }
        }

        int sum = 0;
        for(int x : st) {
            sum += x;
        }

        return sum;
    }
}
