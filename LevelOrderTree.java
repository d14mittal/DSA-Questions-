import java.util.*;
class Node1{
    int data;
    Node1 left,right;
    public Node1(int key){
        data=key;
        left=right=null;
    }
}
public class LevelOrderTree {
    
    Node1 root;

    void LevelOrder()
    {
        Queue<Node1> q=new LinkedList<Node1>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node1 tempnode=q.poll();
            System.out.print(tempnode.data+" ");
            if(tempnode.left!=null)
            {
                q.add(tempnode.left);
            }
            if(tempnode.right!=null)
            {
                q.add(tempnode.right);
            }
        }
    }

    public static void main(String ar[])
    {
        LevelOrderTree tree=new LevelOrderTree();
        tree.root=new Node1(1);
        tree.root.left=new Node1(2);
        tree.root.right=new Node1(3);
        tree.root.left.left=new Node1(4);
        tree.root.left.right=new Node1(5);
        tree.LevelOrder();
        

    }
    
}