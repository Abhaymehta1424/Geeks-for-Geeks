// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : arr){
            pq.add(i);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }
}
