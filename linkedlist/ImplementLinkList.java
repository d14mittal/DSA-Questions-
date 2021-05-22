public class ImplementLinkList {
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;
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

    // boolean isEmpty(){
    //     // return head==null;
    //     if(head==null)
    //         return true;
    //     else    
    //         return false;
    // }

    int get(int index) {
        
        //         if(index<0 || index>=length){
        //             return -1;
        //         }
                
        //         else{
        //         Node temp=head;
        //         int count =0;
                
        //         while(count!=index){
        //             temp=temp.next;
        //             count++;
        //         }
                
        //         return temp.data;
        //         }
        
                // if (index >= length) 
                //     return -1;
                Node temp = head;
                int count=0;
                while(count!=index){
                    temp=temp.next;
                    count++;
                }
                return temp.data;
                
            }
    void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    
    }

    // void delete(int data){
    //     Node temp=head;

    //     while(temp.next.data!=data){
    //         temp=temp.next;
    //     }
        
    //     temp.next=temp.next.next;      
    
    
    // }

    void delete(int data){
        Node temp=head, prev=null;
        // delete head
        if(temp!=null && temp.data==data){
            head=temp.next;
            return ;
        }
        
        while(temp!=null && temp.data!=data){
            prev=temp;
            temp=temp.next;
        }

        if(temp==null){
            return;
        }

        prev.next=temp.next;
    }

    void deletion(Node head, int val){
        Node temp=head;

        if(head==null)
            return;
        if(head.next==null){
            head=temp.next;
            return;
        }
        while(temp.next.data!=val){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    void addAtIndex(int index, int data){
        
        Node new_node=new Node(data);
        Node temp=head;
        int count=0;
        while(count!=index-1){
            temp=temp.next;
        }
        new_node.next=temp.next;
        temp.next=new_node;
    }

    Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String args[]){
        Node head=null;
        ImplementLinkList list=new ImplementLinkList();
            list.add(10);
            list.add(20);
            list.add(30);
            list.printlist();
            list.deletion(head,10);
            list.addAtIndex(1,40);
            // list.deletion(head,10);

            list.printlist();
            
    }
}