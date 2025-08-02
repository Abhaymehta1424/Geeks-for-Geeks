class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        
        int n = q.size();
        if(n<k){
            return q;
        }
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<k;i++){
            stack.push(q.remove());
        }
        
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        
        for(int i=0;i<n-k;i++){
            q.add(q.remove());
        }
        return q;
    }
}