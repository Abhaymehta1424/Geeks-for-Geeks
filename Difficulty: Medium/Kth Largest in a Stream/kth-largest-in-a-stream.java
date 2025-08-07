class Solution {
    static int[] kthLargest(int k, int[] arr, int n) {
        // code here
        int[] a = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0;i<n;i++){
            pq.add(arr[i]);
            if(pq.size() < k){
                a[i] = -1;
            }else{
                while(pq.size() > k){
                    pq.remove();
                }
                a[i] = pq.peek();
            }
        }
        return a;
    }
};