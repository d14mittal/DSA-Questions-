import java.util.*;
class Node{
    int key;
    Node left,right;
    Node(int item){
        key=item;
        left=right=null;
    }
}
public class BinarySearchTree {
    
    Node root=null;
    void insert(int key){
        root=insertRec(root,key);
    }
    static Node insertRec(Node root,int key){
        if(root==null){
            return new Node(key);
        }
        if(key>root.key){
            root.right=insertRec(root.right, key);
        }
        else if(key<root.key){
            root.left=insertRec(root.left,key);
        }
        return root;
        }
    
    void inorder(){
        inorderRec(root);
    }
    void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    public static void main(String a[]){
        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(12);
        tree.insert(30);
        tree.inorder();
    }
}
    
    

