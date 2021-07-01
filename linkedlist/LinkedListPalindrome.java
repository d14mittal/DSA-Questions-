public class LinkedListPalindrome {
    Node head;
    class Node{
        int data;
        Node next;
        Node (int data, Node next){
            this.data=data;
            this.next=null;
        }
    }
    
    static boolean ispalindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node slow=head;
        Node fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverse(slow.next);
        slow=slow.next;

        while(slow!=null){
            if(head.data!=slow.data){
                return false;
            }
            head=head.next;
            slow=slow.next;
        }
        return true;
        
       
    }
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
    public static void main(String[] args) {
                
    }
    
}
