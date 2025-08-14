class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int k =1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                return k;
            }
            k++;
        }
        return 0;
    }
}