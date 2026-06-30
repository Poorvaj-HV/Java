class Solution {
    public static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()) {
            return;
        }
        
        List<Integer> stack = new ArrayList<>();
        while(!st.isEmpty()) {
            stack.add(st.pop());
        }
        
        for(int x : stack) {
            st.push(x);
        }
    }
}
