class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        
        int min_distance = 1;
        int max_distance = stalls[stalls.length-1] - stalls[0];
        int ans = -1;
        
        while(min_distance <= max_distance){
            int mid = min_distance+(max_distance - min_distance)/2;
            
            int rakh = stalls[0];
            int count = 1;
            
            for(int i=1;i<stalls.length;i++){
                
                if(rakh + mid <= stalls[i]){
                    count++;
                    rakh = stalls[i];
                }
            }
            if(count < k){
                max_distance = mid - 1;
            }else{
                ans = mid;
                min_distance = mid+1;
            }
        }
        return ans;
    }
}