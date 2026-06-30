/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
*/
// Stack class
class myStack {
    Node head = null;
    int size = 0;
    
    public myStack() {
        // Initialize your data members
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(head == null) {
            return true;
        }
        
        return false;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node newNode = new Node(x);
        if(head == null) {
            head = newNode;
            size++;
            return;
        }
        
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void pop() {
        // Removes the front element of the stack.
        if(head == null) {
            return;
        }
        
        head = head.next;
        size--;
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(head == null) {
            return -1;
        }
        
        return head.data;
    }

    public int size() {
        // Returns the current size of the stack.
        return size;
    }
}
