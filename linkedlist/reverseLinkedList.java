public class reverseLinkedList {
    Node head;
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    
    void addattail(int value) {
        Node newnode = new Node(value);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }
    void reverseIterative(Node head){
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        
    }

    Node reverseRecursive(Node head) {
        Node temp = head;
        if (head == null || head.next == null) {
            return head;
        }
        Node newhead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
    
    public static void main(String[] args) {
        
    }
}
