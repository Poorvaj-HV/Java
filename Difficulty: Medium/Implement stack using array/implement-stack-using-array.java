class myStack {
    int stack[];
    int currLen = -1;
    int size;
    public myStack(int n) {
        // Define Data Structures
        stack = new int[n];
        size = n;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(currLen == -1) {
            return true;
        }
        
        return false;
    }

    public boolean isFull() {
        // check if the stack is full
        if(currLen+1 == size) {
            return true;
        }
        
        return false;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(++currLen+1 == size) {
            return;
        }
        
        stack[currLen] = x;
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(currLen == -1) {
            return;
        }
        
        stack[currLen] = 0;
        currLen--;
    }

    public int peek() {
        // Returns the top element of the stack
        if(currLen == -1) {
            return -1;
        }
        
        return stack[currLen];
    }
}