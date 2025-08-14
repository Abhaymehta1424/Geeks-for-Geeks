class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int[] merged = new int[a.length + b.length];

        int indx = 0;
        for (int i : a) merged[indx++] = i;
        for (int i : b) merged[indx++] = i;

        Arrays.sort(merged);
        
        
        return merged[k-1];
    }
}