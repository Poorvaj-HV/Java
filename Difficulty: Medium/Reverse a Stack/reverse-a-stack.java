class Solution {
    public static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()) {
            return;
        }
        
        int top = st.pop();
        reverseStack(st);
        pushAtBottom(st, top);
    }
    
    public static void pushAtBottom(Stack<Integer> st, int x) {
        if(st.isEmpty()) {
            st.push(x);
            return;
        }
        
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
}
