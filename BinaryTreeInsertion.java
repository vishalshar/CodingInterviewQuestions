/**
 *
 * @author vishal
 */
class Node
{
    Node left;
    int value;
    Node right;
    
    Node(int n)
    {
        left = null;
        value = n;
        right = null;
    }
}

public class BinaryTreeInsertion 
{

    
    public static void insertNode(Node root,int n)
    {
        Node temp = new Node(n);
        insert(root,temp);
    }
    
    public static void insert(Node root,Node n)
    {
        if(root==null)
             root=n;
        if(root.value < n.value)
        {
            if(root.right==null)
            {
                root.right = n;
            }
            else
            {
                insert(root.right,n);
            }
        }
        else
        {
            if(root.left == null)
                root.left = n;
            else
                insert(root.left,n);
        } 
    }
    
    public static void inOrder(Node root)
    {
        if(root==null)
           return;
        
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }
    
    public static void main(String args[])
    {
       Node root = new Node(10);
       insertNode(root,8);
       insertNode(root,17);
       insertNode(root,15);
       insertNode(root,4);
       insertNode(root,16);
       
       inOrder(root);
    }
}
