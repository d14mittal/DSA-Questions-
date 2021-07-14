public class StackUsingLinkedList {
     Node stackhead;
     class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
     void push(int data){
        Node newnode=new Node(data);
        if(stackhead==null){
            stackhead=newnode;
            return;
        }
        newnode.next=stackhead;
        stackhead=newnode; 
    }
     void pop(){
        if(stackhead==null){
            return;
        }
        stackhead=stackhead.next;
    }
     void print(){
        Node temp=stackhead;
        if(stackhead==null){
            return;
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("Null");
        }
    }
    void peek(){
        if(stackhead==null){
            return;
        }
        else{
            System.out.println("Top element: "+stackhead.data);
        }
    }
    public static void main(String[] args) {
        StackUsingLinkedList stack=new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.print(); 
        stack.pop();
        stack.pop();
        stack.print();
        stack.peek();
    }
}
