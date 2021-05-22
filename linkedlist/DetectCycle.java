public class DetectCycle {
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;
        } 
    }
    boolean detectcycle(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    
}
