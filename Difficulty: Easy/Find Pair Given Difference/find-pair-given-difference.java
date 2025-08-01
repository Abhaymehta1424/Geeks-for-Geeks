
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        Arrays.sort(arr);
        int l=0;
        int r= 1;
        while(l<arr.length && r<arr.length){
            if( l!=r && arr[r] - arr[l] == x){
                return true;
            }else if (arr[r]-arr[l] < x) {
                r++;
            }else{
                l++;
            }
        }
        return false;
    }
}
