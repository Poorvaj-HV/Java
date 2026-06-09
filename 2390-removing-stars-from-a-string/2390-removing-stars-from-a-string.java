class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for(char x : s.toCharArray()) {
            if(x == '*') {
                st.pop();
            } else {
                st.push(x);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.insert(0, st.peek());
            st.pop();
        }

        return sb.toString();
    }
}