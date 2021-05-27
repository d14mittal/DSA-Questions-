

public class ReverseKnodes{
    class node{
        int data;
        node next;
        node(int d){
            data=d;
            next=null;
        }
    }
    node head;

    node reversek(node head, int k) {
        node curr = head;
        node prev = null;
        node nextptr=null;
        int count = 0;
        while (count < k && curr != null) {
            nextptr = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = nextptr;
            count++;
        }
        if (nextptr != null)
            head.next = reversek(nextptr, k);

        return prev;
    }
    
    void addattail(int value) {
        node newnode = new node(value);

        if (head == null) {
            head = newnode;
            return;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void printlist(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        node head = null;
        ReverseKnodes ll=new ReverseKnodes();
        ll.addattail(1);
        ll.addattail(2);
        ll.addattail(3);
        ll.addattail(4);
        ll.addattail(5);
        ll.addattail(6);
        ll.addattail(7);
        ll.addattail(8);
        ll.printlist(head);
        // int k = 2;
        // node newnode=ll.reversek(head, k);
        // ll.printlist();
    
    }
}


