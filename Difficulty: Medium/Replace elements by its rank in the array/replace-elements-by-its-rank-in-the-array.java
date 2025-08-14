// User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        // code here
        int[] a = arr.clone();
        
        Arrays.sort(a);
        
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        
        for(int i : a){
            if(!map.containsKey(i)){
                map.put(i, rank++);
            }
        }
        
        int[] res = new int[N];
        for(int i=0;i<N;i++){
            res[i]=map.get(arr[i]);
        }
        return res;
    }
}
