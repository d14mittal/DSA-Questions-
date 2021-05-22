class node {
    int data;
    node next;

    node(int d) {
        data = d;
        next = null;
    }
}

public class mylinkedlist{
    node head;
    public int getValueofIndex(int index)
    {
        node temp=head;
        int i=0;
        if(index<0) return -1;
        while(temp!=null)
        {
            if(i==index) 
                return temp.data;
            i++;
            temp=temp.next;    
        }
        return -1;
    }

    // public void add(int value)
    // {                                                
    //     node new_node=new node(value);             
    //     new_node.next=head;
    //     head=new_node;
    // }
    
    public void print(int index)              
    {                                           
        node temp=head;
        while(temp.next!=null)
        {
            System.out.print(getValueofIndex(index)+"-->");
            temp=temp.next;
            index++;
        }
        System.out.print(getValueofIndex(index));
        
        // while(head.next!=null)
        // {
        //     System.out.print(head.data+"->");
        //     head=head.next;
        // }
        // System.out.print(head.data);
    } 

    public void addathead(int value)
    {
        node newnode=new node(value);
        newnode.next=head;
        head=newnode;
    }
    public void addattail(int value)
    {
        node newnode=new node(value);
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public void addatindex(int index,int value)
    {
        node temp=head;
        int count=0;
        while(count!=index)
        {
            temp=temp.next;
            count++;
        }
        node newnode=new node(value);
        newnode.next=temp.next;
        temp.next=newnode;
    }
    // public void deletenode(node Node)
    // {
    //     node temp=Node;
    //     if(temp!=null && temp.next!=null)
    //     {
    //         temp
    //     }
        
    // }
    public static void main(String ar[])
    {
        mylinkedlist llist=new mylinkedlist();
        // llist.addathead(10); 
        // llist.addathead(20); 
        // llist.addathead(30); 
        // llist.addathead(40); 
        llist.addathead(50); 
        llist.addathead(60);
        /* Check the count function */
        // System.out.println("Element at index 0 is "+llist.getIndex(0)); 
        llist.addattail(80);
        llist.addatindex(2, 14);
        // llist.deleteatindex(4);
        llist.print(0);


    }
}