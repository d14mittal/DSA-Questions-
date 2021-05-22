public class MakeCycle{
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;
        } 
    }
    void makecycle(Node head, int pos){
        int count=1;
        Node temp=head;
        Node startnode=null;
        while(temp.next!=null){

            if(count==pos){
                 startnode=temp;
            }
            temp=temp.next;
            count++;
        }
        temp.next=startnode;
    }
}