/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class GFG {
    // Function to store the zig zag order traversal of tree in a list.
    ArrayList<Integer> zigZagTraversal(Node root) {
        
    ArrayList<Integer> res = new ArrayList<>();
    if (root == null) return res;

    Queue<Node> q = new LinkedList<>();
    q.add(root);
    boolean leftToRight = true;

    while (!q.isEmpty()) {
        int size = q.size();
        ArrayList<Integer> lop = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            Node current = q.poll();
            lop.add(current.data);

            if (current.left != null) q.add(current.left);
            if (current.right != null) q.add(current.right);
        }

        if (!leftToRight) Collections.reverse(lop);
        res.addAll(lop);
        leftToRight = !leftToRight;
    }

    return res;
}
}