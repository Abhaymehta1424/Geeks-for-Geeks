class Solution {
    int majorityElement(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count =0;
        
        for(int num : arr){
            if(num == arr[arr.length/2]){
                count++;
            }
        }
        if(count > arr.length/2){
            return arr[arr.length/2];
        }else{
            return -1;
        }
    }
}