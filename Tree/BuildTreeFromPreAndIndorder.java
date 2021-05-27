
public class BuildTreeFromPreAndIndorder {
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    Node root;
    static int idx=0;
    int search(int in[],int start, int end, int curr){
        
        for(int i=start;i<=end;i++){
            if(in[i]==curr){
                return i;
            }
        }
        return -1;
    }
    Node buildtree(int pre[],int in[], int start, int end){
        
        if(start>end){
            return null;
        }
        int curr=pre[idx];
        idx++;
        Node newnode=new Node(curr);

        

        if(start==end){
            return newnode; 
        }
        
        int pos=search(in, start,  end,  curr);
        newnode.left=buildtree(pre, in, start, pos-1);
        newnode.right=buildtree(pre, in, pos+1, end);
        return newnode;

    }

    // Node buildtree(int in[], int pre[], int inStrt, int inEnd)
    // {
    //     if (inStrt > inEnd)
    //         return null;
 
    //     /* Pick current node from Preorder traversal using preIndex
    //        and increment preIndex */
    //     Node tNode = new Node(pre[idx++]);
 
    //     /* If this node has no children then return */
    //     if (inStrt == inEnd)
    //         return tNode;
 
    //     /* Else find the index of this node in Inorder traversal */
    //     int inIndex = search(in, inStrt, inEnd, tNode.data);
 
    //     /* Using index in Inorder traversal, construct left and
    //        right subtress */
    //     tNode.left = buildtree(in, pre, inStrt, inIndex - 1);
    //     tNode.right = buildtree(in, pre, inIndex + 1, inEnd);
 
    //     return tNode;
    // }
    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    public static void main(String[] args) {
        int pre[]={1,2,4,3,5};
        int in[]={4,2,1,5,3};
        BuildTreeFromPreAndIndorder o=new BuildTreeFromPreAndIndorder();
        Node root=o.buildtree(pre,in,0,4);
        o.inorder(root);
    }
    
}
