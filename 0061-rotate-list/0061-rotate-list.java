class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null) {
            return head;
        }

        int size = 0;
        ListNode temp = head;

        while(temp != null) {
            size++;
            temp = temp.next;
        }

        int arr[] = new int[size];
        temp = head;
        int idx = 0;
        while(temp != null) {
            arr[idx++] = temp.val;
            temp = temp.next;
        }

        int rotates = k % size;
        List<Integer> l = new ArrayList<>();
        for(int i=arr.length-rotates; i<=arr.length-1; i++) {
            l.add(arr[i]);
        }

        for(int i=0; i<=arr.length-1-rotates; i++) {
            l.add(arr[i]);
        }

        temp = head;
        idx = 0;
        while(temp != null) {
            temp.val = l.get(idx++);
            temp = temp.next;
        }

        return head;
    }
}