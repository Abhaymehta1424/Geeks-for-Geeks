class Solution {
    public int findKthSmall(int[] arr, int k) {
        // code here
        int count=0;
        int num = 1;
        
        while(count < k){
            boolean valid = true;

            for(int i : arr){
                if( i == num){
                    valid = false;
                    break;
                }
            }
            if(valid){
                count ++;
            }
            num++;
        }
        return num-1;
    }
}