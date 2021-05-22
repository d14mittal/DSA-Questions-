import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(){
    }
    Node(int data){
        this.data=data;
    }
    Node(int data,Node left,Node right){
        this.data=data;
        this.left=this.right=null;
    }
}
public class TreeInsertionINPUTWhileRun {
    static Scanner sc=null;
    public static void main(String ar[])
    {
        sc=new Scanner(System.in);
        createTree();
        
    }                                                                               
    static Node createTree()                                                        
                                                                              
    {
        Node root=null;
        System.out.println("Enter data: ");
        int data=sc.nextInt();
        if(data==-1) return null;
        
        root=new Node(data);

        System.out.println("enter for left: "+data);
        root.left=createTree();

        System.out.println("enter for right : "+data);
        root.right=createTree();


        return root;



    }
    
}