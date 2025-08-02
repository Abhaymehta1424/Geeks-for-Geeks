/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        // Your code here
        ArrayList<Integer> res =new ArrayList<>();
        inOrderTraversal(root, res);
        return res.get(res.size()-k);
    }
        private void inOrderTraversal(Node node, ArrayList<Integer> res) {
            if (node == null) return;
            inOrderTraversal(node.left, res);
            res.add(node.data);
            inOrderTraversal(node.right, res);
        }
    
}