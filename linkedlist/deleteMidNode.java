public class deleteMidNode{
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;
        } 
    }
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node temp=head;
        if(head==null || head.next==null)
            return null;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        int n=0;
        while(n!=(count/2)-1){
            temp=temp.next;
            n++;
        }
        temp.next=temp.next.next;
        return head;
    }

    Node SlowFastPointer(Node head){
        Node temp=head;
        if(head==null || head.next==null)
            return null;
        Node fast=head, slow=head;
        Node prev=null;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }

        prev.next=slow.next;
        return head;
    }
    
}