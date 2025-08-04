class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int r = a.length-1;
        int l = 0;
        
        while(r >= 0 && l <  b.length){
            if(a[r] > b[l]){
                int t = a[r];
                a[r] = b[l];
                b[l] = t;
                
                r--;
                l++;
            }else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
