class CustomStack {
    List<Integer> stack = new ArrayList<>();
    int maxSize;
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(stack.size() < maxSize) {
            stack.add(x);
        }
    }
    
    public int pop() {
        if(stack.size() != 0) {
            return stack.remove(stack.size() - 1);
        }

        return -1;
    }
    
    public void increment(int k, int val) {
        for(int i=0; i<k && i<stack.size(); i++) {
            stack.set(i, stack.get(i) + val);
        }
    }
}