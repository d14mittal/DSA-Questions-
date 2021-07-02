public class DoubleLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            next=prev=null;
        }
    }
    void insertAtTail(Node head,int data){
        Node nn=new Node(data);
        Node temp=head;
        if(head==null){
            head=nn;
            return;
        }

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=nn;
        nn.prev=temp;
    }

    void delete(Node head, int pos){
        int count=1;
        Node temp=head;
        if(pos==1){
            head=head.next;
            head.prev=null;
            return;
        }
        
        while(temp!=null && count!=pos){
            temp=temp.next;
            count++;
        }
        if(temp.next==null){
            temp.prev.next=temp.next;
            return;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        
    }


    
}
