class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            int f = -1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    f=arr[j];
                    break;
                }
            }
            result.add(f);
        }
        return result;
    }
}