// User function Template for Java

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Node> st=new Stack<>();
        
        Node temp=root;
        
        while(!st.isEmpty() || temp!=null){
            while(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            
            temp=st.pop();
            ans.add(temp.data);
            temp=temp.right;
        }
        
        return ans;
    }
}