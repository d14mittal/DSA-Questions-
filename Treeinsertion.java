import java.util.*;

public class Treeinsertion {

static class Node{
    int key;
    Node left,right;

    Node(int key){
        this.key=key;
        left=null;
        right=null;
    }
}

static Node root;
static Node temp=root;                       
static void inorder(Node temp)
{
    if(temp==null)                                                                                                                                  
    {                                                                                                                                                
        return;
    }
    inorder(temp.left);
    System.out.print(temp.key+" ");
    inorder(temp.right);
}

static void insert(Node temp,int key)
{
    Queue<Node> q=new LinkedList<Node>();
    q.add(temp);

    while(!q.isEmpty())
    {
        temp=q.peek();
        q.remove();
        if(temp.left==null)
        {
            temp.left=new Node(key);
            break;
        }
        else
        {
            q.add(temp.left);
        }
        if(temp.right==null)
        {
            temp.right=new Node(key);
        }
        else{
            q.add(temp.right);
        }
    }

}
    
public static void main(String ar[])
{
    root=new Node(10);
    root.left=new Node(20);
    root.right=new Node(30);
    root.left.left=new Node(40);
    root.left.right=new Node(50);
    System.out.print( "Inorder traversal before insertion: "); 
    inorder(root);
    int key = 12; 
    insert(root, key); 
    
    System.out.print("\nInorder traversal after insertion: "); 
    inorder(root);
}

}