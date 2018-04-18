
    class Node {
        int data;
        Node left;
        Node right;
     }
    public class BSTorNot
    {
	 boolean printPostorder(Node node)
    {
        boolean res1=true, res2=true;
        if (node == null)
            return true;
        if(node.left != null && node.left.data < node.data && res1 !=false)
            res1 = printPostorder(node.left);
         else
             res1= false;

        //System.out.print(node.data + " ");
        if(node.right!=null && node.right.data > node.data && res2 != false )
            res2 = printPostorder(node.right);
         else
             res2 = false;
         
         return true;
    }
    boolean checkBST(Node root) {
        boolean result = printPostorder(root);
        return result;
    }
    
    public static void main()
    {
    	
    }
}