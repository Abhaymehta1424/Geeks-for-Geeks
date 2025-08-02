// User function Template for Java

class Solution {
    int maxRepeating(int k, int[] arr) {
        // code here
        int[] a = new int[k];
        
        for(int i=0;i<arr.length;i++){
            a[arr[i]]++;
        }
        int countmax=0;
        int maxelement=0;
         for(int i=0;i<k;i++){
             if(a[i]>countmax){
                 countmax=a[i];
                 maxelement=i;
             }
         }
         return maxelement;
    }
}