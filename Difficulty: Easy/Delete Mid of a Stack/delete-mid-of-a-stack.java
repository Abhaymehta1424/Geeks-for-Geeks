class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        ArrayList<Integer> a = new ArrayList<>();
        
        while(!s.isEmpty()){
            a.add(s.pop());
        }
        
        int mid = a.size()/2;
        
        a.remove(mid);
        
        for(int i=a.size()-1;i>=0;i--){
            s.push(a.get(i));
        }
    }
}