/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> res = new ArrayList<>();
        asd(root, res);
        return res;
    }
    
    public void asd(Node root, ArrayList<Integer>res){
        
        if(root == null){
            return;
        }
        
        asd(root.left,res);
        res.add(root.data);
        asd(root.right, res);
        
        
    }
}