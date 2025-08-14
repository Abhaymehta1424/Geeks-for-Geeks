class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int l = 0;
        int r = arr.length;
        while(l<r){
            int mid = l+(r-l)/2;
            if(arr[mid] < target){
                l = mid+1;
            }else{
                r = mid;
            }
            
        }
        return l;
    }
}
