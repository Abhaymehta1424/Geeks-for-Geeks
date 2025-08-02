/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */

class Solution {
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
        ArrayList<Integer> res = new ArrayList<>();
        
        void Inorder(Node root){
            if(root == null){return;}
            
            Inorder(root.left);
            res.add(root.data);
            Inorder(root.right);
        }
        
        int i=0;
        void Assign(Node root){
            if(root == null){return;}
            
            Assign(root.left);
            root.data = res.get(i++);
            Assign(root.right);
        }
        
    Node binaryTreeToBST(Node root) {
        Inorder(root);
        Collections.sort(res);
        Assign(root);
        return root;
    }
}