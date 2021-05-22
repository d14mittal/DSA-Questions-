import java.util.*;
public class deletionInBT {
    
    static class Node{
        int data;
        Node left,right;
        Node(int key){
            key=data;
            left=right=null;
        }
    }

    static Node root;
    static Node temp=root;

    static void inorder(Node temp)
    {
        if(temp==null)
            return;
        inorder(temp.left);
        System.out.print(temp.data+" ");
        inorder(temp.right);        
    }

    void deleteNode(Node root,Node d_Node)
    {
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node tempnode=q.poll();
            if(tempnode.left!=null)
            {
                if(tempnode.left==d_Node)
                {
                    tempnode.left=null;
                    d_Node=null;
                    return;
                }
                else{
                    q.add(temp.left);
                }
                

            }
            if(tempnode.right!=null)
            {
                if(tempnode.right==d_Node)
                {
                    tempnode.right=null;
                    d_Node=null;
                    return;
                }
                else{
                    q.add(tempnode.right);
                }
            }

        }

        
    }

    void deletion(Node root,int key)
    {
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);

        Node temp=null;
        Node key_node=null;

        while(!q.isEmpty())
        {
            temp=q.poll();
            if(temp.data==key)
            {
                key_node=temp;
            }
            if (temp.left!=null) 
                q.add(temp.left); 
    
            if (temp.right!=null) 
                q.add(temp.right);  
        }
        int x=temp.data;
        deleteNode(root, temp);
        key_node.data=x;
    }
        
    public static void main(String ar[])
    {

    }
    
}