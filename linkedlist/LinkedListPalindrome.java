public class LinkedListPalindrome {
    Node head;
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    void add(int data){
        Node toadd=new Node(data);
        if(head==null){
           head=toadd;
           return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=toadd;
    }

     boolean ispalindrome(Node head){
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
    
     Node reverse(Node head){
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
    void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    
    }
    public static void main(String[] args) {
        Node head=null;
        LinkedListPalindrome ll=new LinkedListPalindrome();
        ll.add(10);
        ll.add(20);
        // ll.add(20);
        // ll.add(10);
        // ll.add(20);
        // ll.add(20);
        // ll.add(20);
        ll.printlist();
        System.out.println(ll.ispalindrome(head));
            
    }
        
}
