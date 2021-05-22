class Node{
    int key;
    Node left,right;

    public Node(int item){
        key=item;
        left=right=null;
    }   
}
class binaryTree{
    Node root;
    binaryTree(int key)
    {
        root=new Node(key);
    }
    binaryTree()
    {
        root=null;
    }
    public static void main(String ar[])
    {
        binaryTree tree=new binaryTree();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
}
}